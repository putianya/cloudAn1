package com.hy.controller;

import com.hy.api.DissApi;
import com.hy.pojo.TbDistributor;
import com.hy.pojo.TbUser;
import com.hy.result.ContentResult;
import com.hy.result.Result;
import com.hy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //注入分销商api接口
    @Autowired
    private DissApi dissApi;

    @Autowired
    private UserService userService;
    //根据用户id远程查询分销商的信息
    @GetMapping("/selectDissByUidRJX")
    public Result selectDissByUidRJX(Integer uid){

        //根据uid查询当前用户信息
        TbUser user = userService.getUserByUid(uid);

        List<TbDistributor> dissByUid = dissApi.findDissByUid(uid);

        user.setDis(dissByUid);
        return new Result(ContentResult.SUCCESS_CODE,ContentResult.SUCCESS_MESSAGE  ,user);

    }


    //查询请求
    @GetMapping("/queryRJX")
    public String query(){
        System.out.println("查询成功");
        String order = userService.order();
        System.out.println(order);
        return "查询成功";
    }

    //支付请求
    @GetMapping("/payRJX")
    public String pay(){
        System.out.println("支付成功");
        return "支付成功";
    }

    //订单请求
    @GetMapping("/orderRJX")
    public String order(){
        System.out.println("订单成功");
        String order = userService.order();
        System.out.println(order);
        return "订单成功";
    }


}
