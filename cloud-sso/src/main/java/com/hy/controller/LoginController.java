package com.hy.controller;

import com.hy.pojo.TbUser;
import com.hy.result.ContentResult;
import com.hy.result.Result;
import com.hy.service.UserService;
import com.hy.utils.JwtUtil;
import com.hy.vo.UserVO;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/loginRJX")
    public Result login(String username, String password) {
        //获取subject对象
        Subject subject = SecurityUtils.getSubject();

        //创建usernameandpasswordtoken对象
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        //调用login方法
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
           e.printStackTrace();
           return new Result(ContentResult.FAIL_LOGIN_CODE,ContentResult.FAIL_LOGIN_MESSAGE);
        }

        //生成token
        TbUser tbUser = (TbUser) subject.getPrincipal();

        //脱敏处理
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(tbUser,userVO);
        String tokens  = jwtUtil.createJwt(userVO.getId().toString(), JSONObject.toJSONString(userVO), "userRoles");

        return new Result(ContentResult.SUCCESS_LOGIN_CODE,ContentResult.SUCCESS_LOGIN_MESSAGE,tokens);
    }
}

