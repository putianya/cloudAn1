package com.hy.test;

import io.jsonwebtoken.*;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;

public class JWTTest {
    @Test
    public void createToken(){
        //封装头部数据
        HashMap<String, Object> headMap = new HashMap<>();
        headMap.put(JwsHeader.TYPE, JwsHeader.JWT_TYPE);
        headMap.put(JwsHeader.ALGORITHM, "HS256");
        //封装主体数据
        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", 1);
        bodyMap.put("username", "zhangsan");
        //生成token
        String token = Jwts.builder()
                .setHeader(headMap) //设置头
                .setClaims(bodyMap) //设置体
                .signWith(SignatureAlgorithm.HS256, "huayu") //设置加密算法和盐
                .setExpiration(new Date(System.currentTimeMillis() + 300000)) //设置过期时间
                .compact();

        System.out.println(token);
    }

    @Test
    public void decodeToken(){
       String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNzU0MDEzNTUzLCJ1c2VybmFtZSI6InpoYW5nc2FuIn0.C4B3MngNueR3EkoJ1MqiI3onNwm8UnpZxpovPIV6tcI";
        try {
            Claims map = Jwts.parser()
                    .setSigningKey("huayu") //解析盐
                    .parseClaimsJws(token)  //解析token
                    .getBody();

            System.out.println(map.get("id"));
            System.out.println(map.get("username"));
        }catch (ExpiredJwtException e){
            System.out.println("token已经过期");
        }catch (Exception e){
            System.out.println("token不合法");
        }
    }
}