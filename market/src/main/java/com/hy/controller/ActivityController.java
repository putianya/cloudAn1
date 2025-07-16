package com.hy.controller;

import com.hy.pojo.ActivityAnalysis;
import com.hy.result.ContentResult;
import com.hy.result.Result;
import com.hy.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;
    @GetMapping("/findActivity")
    public Result findActivity(){
       List<ActivityAnalysis> activityAnalyses=   activityService.findActivity();
       return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, activityAnalyses);
    }

    //查询最新活动列表
    @GetMapping("/findNewAnListRJX")
    public Result findNewAnList(){
            List<ActivityAnalysis> List=   activityService.findNewAnList();
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, List);
    }

    //查询当前活动下的整体投放概览
    @GetMapping("/findAllANRJX")
    public Result findAllAN(String cid){
       ActivityAnalysis activityAnalysis=   activityService.findAllAN(cid);
       return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, activityAnalysis);
    }
}
