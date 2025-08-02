package com.hy.controller;

import com.hy.pojo.TbDistributor;
import com.hy.service.DissService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diss")
public class DissController {
    @Autowired
    private DissService dissService;

    //根据远程传递过来的id查询当前id用户所管理的分销商信息
    @GetMapping("/findDissByUidRJX")
    public List<TbDistributor> findDissByUid(@RequestParam Integer uid){
      return   dissService.findDissByUid(uid);
    }
}
