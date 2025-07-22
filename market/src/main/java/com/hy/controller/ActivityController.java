package com.hy.controller;

import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.A;
import com.hy.pojo.*;
import com.hy.result.ContentResult;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import com.hy.result.Result;
import com.hy.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Autowired
    private ActivityGroupService activityGroupService;
    @Autowired
    private ActivityPlatformGroupService activityPlatformGroupService;
    @Autowired
    private ActivityPlatformContentGroupService activityPlatformContentGroupService;
    @Autowired
    private ActivityPlatformContentDirectionGroupService activityPlatformContentDirectionGroupService;

    //查询活动列表
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

    //查询当前活动下全部的媒介归因排名
        @GetMapping("/findMediaSlotRJX")
    public Result findMediaSlot (String cid,String point,String orderfield,String ordertype,Integer pageNum,Integer pageSize,String media) {
            PageResult<MediaSlot> list=activityMediaSlotAnalysisService.findMediaSlot(cid,point,orderfield,ordertype,pageNum,pageSize,media);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, list);
        }


    //媒介归因排名下载
    @GetMapping("/mediaSlotDownRJX")
    public void mediaSlotDown(HttpServletResponse response,String cid,String point,String orderfield,String ordertype,Integer pageNum,Integer pageSize,String media) throws IOException {
        activityMediaSlotAnalysisService.mediaSlotDown(response,cid,point,orderfield,ordertype,pageNum,pageSize,media);
    }

    //查询所有媒介平台名称
    @GetMapping("/findAllMediaRJX")
    public Result findAllMedia() {
        List<String> list = activityMediaSlotAnalysisService.findAllMedia();
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, list);
    }

    //kol投放
    //分活动
    @GetMapping("/findActivityGroupRJX")
    public Result findActivityGroup(String cname) {
       List<ActivityGroup> alog= activityGroupService.findActivityGroup(cname);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, alog);
    }

    //分活动分媒介
    @PostMapping("/findActivityPlatformGroupRJX")
    public Result findActivityPlatformGroup(@RequestBody PageResultQuery query) {
        PageResult<ActivityPlatformGroup> activityPlatformGroup= activityPlatformGroupService.findActivityPlatformGroup(query);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, activityPlatformGroup);
    }

    //分内容形式
    @PostMapping("/findActivityPlatformContentGroupRJX")
    public Result findActivityPlatformContentGroup (@RequestBody PageResultQuery query) {
       PageResult<ActivityPlatformContentGroup> page=  activityPlatformContentGroupService.findActivityPlatformContentGroup(query);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, page);
    }
    //分内容方向
    @PostMapping("/findActivityDirectionGroupRJX")
    public Result findActivityDirectionGroup (@RequestBody PageResultQuery query) {
           PageResult<ActivityPlatformContentDirectionGroup> list= activityPlatformContentDirectionGroupService.findActivityDirectionGroup(query);
           return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, list);
    }

    //分媒介分活动分内容方向下载
    @PostMapping("/findActivityDirectionGroupDownloadRJX")
    public void findActivityDirectionGroupDownload(HttpServletResponse response,@RequestBody PageResultQuery query ) throws IOException {
        activityPlatformContentDirectionGroupService.findActivityDirectionGroupDownload(response, query);
    }


}
