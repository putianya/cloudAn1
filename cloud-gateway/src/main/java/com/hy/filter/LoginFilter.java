package com.hy.filter;

import com.alibaba.nacos.shaded.io.grpc.Server;
import com.hy.result.ContentResult;
import com.hy.result.Result;
import com.hy.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.HashSet;

@Component
@Order(-1)
public class LoginFilter implements GlobalFilter {

    @Autowired
    private JwtUtil jwtUtil;
    @Value("#{'${ex.url}'.empty?null: '${ex.url}'.split(',')}")
    private HashSet<String> urls;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        //1.获取请求对象
        ServerHttpRequest request = exchange.getRequest();
        //2.获取请求头对象
        HttpHeaders headers=request.getHeaders();
        //3.从请求头中获取token
        String token = headers.getFirst("token");
        //匹配路径  如果是登录请求直接放行
        AntPathMatcher ant=new AntPathMatcher();
        for (String url : urls) {
            String path = request.getURI().getPath();
            if (ant.match(url,path)) {
                return chain.filter(exchange);
            }
        }
        //4.判断token是否存在
        if(token==null){
            return getMono(exchange);
        }
        //5.token存在，解析token
        try {
            jwtUtil.parseJwt(token);
            return chain.filter(exchange);
        }catch (Exception e) {
            e.printStackTrace();
            return getMono(exchange);
        }
    }

    private static Mono<Void> getMono(ServerWebExchange exchange) {
        //如果不存在，则响应错误信息
        ServerHttpResponse response = exchange.getResponse();
        //设置响应头 可以向前台传递中文响应
        response.getHeaders().add("Content-Type","application/json;charset=utf-8");
        //设置响应内容
        Result result = new Result(ContentResult.TOKEN_NOT_NULL_CODE, ContentResult.TOKEN_NOT_NULL_MESSAGE);
        return response.writeWith(Mono.just(response.bufferFactory().wrap(result.toString().getBytes())));
    }
}
