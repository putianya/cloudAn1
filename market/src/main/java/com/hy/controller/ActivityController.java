package com.hy.controller;

import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.ConversionIncome;
import com.hy.result.ContentResult;
import com.hy.result.Result;
import com.hy.service.ActivityMediaSlotAnalysisService;
import com.hy.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;
    @Autowired
    private ActivityMediaSlotAnalysisService activityMediaSlotAnalysisService;

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

    //下载
    @GetMapping("/anDonwloadRJX")
    public void anDonwload(HttpServletResponse response){
        //访问service组装数据
        activityService.anDonwload(response);
    }

    //转化收益分析-获取当前活动下的数据--》五个
    @GetMapping("/getConversionIncomeRJX")
    public Result getConversionIncome(String cid,String status) {
        //status=1曝光次数、status=2 曝光人数
            ConversionIncome list=activityService.getConversionIncome(cid,status);
            return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, list);

    }

    //转化效益分析下载接口
    @GetMapping("/ConversionIncomeDownRJX")
    public void ConversionIncomeDown(HttpServletResponse response,String cid, String status) throws IOException {
        activityService.ConversionIncomeDown(response,cid,status);
    }

    //媒介归因排名-查询触点类型集合
    @GetMapping("/findContactPointRJX")
    public Result findContactPoint( ) {
        List<String> list=activityMediaSlotAnalysisService.findContactPoint();
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, list);

    }

}
