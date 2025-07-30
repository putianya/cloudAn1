package com.hy.controller;

import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.A;
import com.hy.pojo.*;
import com.hy.result.*;
import com.hy.service.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@RefreshScope
@RequestMapping("/market")
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
    @Autowired
    private ActivityPlatformInfluencergradeGroupService activityPlatformInfluencergradeGroupService;
    @Autowired
    private ActivityPlatformInfluencertypeGroupService activityPlatformInfluencertypeGroupService;
    @Autowired
    private ActivityKolGroupService activityKolGroupService;
    @Autowired
    private KolDownloadService kolDownloadService;

    @Value("${upload}")
    private String upload;
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
    public Result findMediaSlot (ResultMediaSlot slot) {
            PageResult<MediaSlot> list=activityMediaSlotAnalysisService.findMediaSlot(slot);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, list);
        }


    //媒介归因排名下载
    @GetMapping("/mediaSlotDownRJX")
    public void mediaSlotDown(HttpServletResponse response,ResultMediaSlot slot) throws IOException {
        activityMediaSlotAnalysisService.mediaSlotDown(response,slot);
    }

    //触点类型归因排名下载
    @GetMapping("/contactPointDownRJX")
    public void contactPointDown(HttpServletResponse response,ResultMediaSlot slot) throws IOException {
        activityMediaSlotAnalysisService.contactPointDown(response,slot);
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
    public Result findActivityGroup(PageResultQuery query) {
       List<ActivityGroup> alog= activityGroupService.findActivityGroup(query);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, alog);
    }
    //分活动下载
    @GetMapping("/findActivityGroupDownloadRJX")
    public void findActivityGroupDownload(HttpServletResponse response,PageResultQuery query) throws IOException {
        activityGroupService.findActivityGroupDownload(response,query);
    }

    //分活动分媒介
    @PostMapping("/findActivityPlatformGroupRJX")
    public Result findActivityPlatformGroup(@RequestBody PageResultQuery query) {
        PageResult<ActivityPlatformGroup> activityPlatformGroup= activityPlatformGroupService.findActivityPlatformGroup(query);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, activityPlatformGroup);
    }
    //分活动分媒介下载
    @PostMapping("/findActivityPlatformGroupDownloadRJX")
    public void findActivityPlatformGroupDownload(HttpServletResponse response,@RequestBody PageResultQuery query) throws IOException {
        activityPlatformGroupService.findActivityPlatformGroupDownload(response, query);
    }


    //分活动分媒介分内容形式
    @PostMapping("/findActivityPlatformContentGroupRJX")
    public Result findActivityPlatformContentGroup (@RequestBody PageResultQuery query) {
       PageResult<ActivityPlatformContentGroup> page=  activityPlatformContentGroupService.findActivityPlatformContentGroup(query);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, page);
    }
    //分活动分媒介分内容形式下载
    @PostMapping("/findActivityPlatformContentGroupDownloadRJX")
    public void findActivityPlatformContentGroupDownload(HttpServletResponse response,@RequestBody PageResultQuery query) throws IOException {
        activityPlatformContentGroupService.findActivityPlatformContentGroupDownload(response, query);
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

    //分媒介分活动分达人等级
    @PostMapping("/findActivityPlatformInfluencergradeGroupRJX")
    public Result findActivityPlatformInfluencergradeGroup (@RequestBody PageResultQuery query) {
        PageResult<ActivityPlatformInfluencergradeGroup> page= activityPlatformInfluencergradeGroupService.findActivityPlatformInfluencergradeGroup(query);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, page);
    }
    //分媒介分活动分达人等级-下载
    @PostMapping("/findActivityPlatformInfluencergradeGroupDownloadRJX")
    public void findActivityPlatformInfluencergradeGroupDownload(HttpServletResponse response,@RequestBody PageResultQuery query) throws IOException {
        activityPlatformInfluencergradeGroupService.findActivityPlatformInfluencergradeGroupDownload(response, query);
    }

    //分媒介分活动分达人类型
    @PostMapping("/findActivityPlatformInfluencerTypeGroupRJX")
    public Result findActivityPlatformInfluencerTypeGroup (@RequestBody PageResultQuery query) {
        PageResult<ActivityPlatformInfluencertypeGroup> page =activityPlatformInfluencertypeGroupService.findActivityPlatformInfluencerTypeGroup(query);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, page);
    }

    //分媒介分活动分达人类型-下载
   @PostMapping("/findActivityPlatformInfluencerTypeGroupDownloadRJX")
    public void findActivityPlatformInfluencerTypeGroupDownload(HttpServletResponse response,@RequestBody PageResultQuery query) throws IOException {
        activityPlatformInfluencertypeGroupService.findActivityPlatformInfluencerTypeGroupDownload(response, query);
   }

   //分活动分帖子
    @PostMapping("/findActivityKolGroupRJX")
    public Result findActivityKolGroup(@RequestBody PageResultQuery query) {
        PageResult<ActivityKolGroup> page = activityKolGroupService.findActivityKolGroup(query);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, page);
    }

    //分活动分帖子-下载
    @PostMapping("/findActivityKolGroupDownloadRJX")
    public void findActivityKolGroupDownload(HttpServletResponse response,@RequestBody PageResultQuery query) throws IOException {
        activityKolGroupService.findActivityKolGroupDownload(response, query);
    }

    //kol统一下载接口
    @PostMapping("/kolDownloadRJX")
    public void kolDownload(HttpServletResponse response,@RequestBody PageResultQuery query) throws IOException {
        kolDownloadService.kolDownload(response, query);
    }

    ////////////////////////////////////////////////////多活动归因//////////////////////////////////////////////////
    @GetMapping("/findTypeAndCnamesRJX")
    public Result findTypeAndCnames() {
        Map<String,List<String>> map= activityService.findTypeAndCnames();
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, map);
    }

    //多活动归因-获取两个活动的所有指标数据的集合-核心指标对比
    @GetMapping("/comparisonOfCoreIndicatorsRJX")
      public Result comparisonOfCoreIndicators(String cidA, String cidB) {
        ActivityAlogAndDiff as=activityService.comparisonOfCoreIndicators(cidA, cidB);
        return  new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, as);

    }

    //多活动归的核心指标对比下都
    @GetMapping("/comparisonOfCoreIndicatorsDownloadRJX")
    public void comparisonOfCoreIndicatorsDownload(HttpServletResponse response, String cidA, String cidB) throws IOException {
        activityService.comparisonOfCoreIndicatorsDownload(response, cidA, cidB);
    }

    //多活动归因-分媒介平台投放对比
    @GetMapping("/platformDeliveryComparisonRJX")
    public Result platformDeliveryComparison(String cidA, String cidB,String filed) {
        Map<String,Map<String,List<PlatBean>>> map=activityMediaSlotAnalysisService.platformDeliveryComparison(cidA, cidB,filed);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, map);
    }

    //多活动归因-分媒介平台投放对比下载
    @GetMapping("/platformDeliveryComparisonDownloadRJX")
    public void platformDeliveryComparisonDownload(HttpServletResponse response, String cidA, String cidB,String filed) throws Exception {
        activityMediaSlotAnalysisService.platformDeliveryComparisonDownload(response, cidA, cidB,filed);
    }

    //多活动归因-分媒介平台分布
    @GetMapping("/distributionOfSubMediaPlatformsRJX")
    public Result distributionOfSubMediaPlatforms(String cidA, String cidB,String filed) {
        Map<String,Map<String,List<PlatBean>>> map=activityMediaSlotAnalysisService.distributionOfSubMediaPlatforms(cidA, cidB,filed);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, map);
    }

    //多活动归因-分媒介平台分布下载
    @GetMapping("/distributionOfSubMediaPlatformsDownloadRJX")
    public void distributionOfSubMediaPlatformsDownload(HttpServletResponse response, String cidA, String cidB,String filed) throws Exception {
        activityMediaSlotAnalysisService.distributionOfSubMediaPlatformsDownload(response, cidA, cidB,filed);
    }

    //多活动归因-分媒介分触点类型构成
    @GetMapping("/contactTypeCompositionRJX")
    public Result contactTypeComposition(String cidA, String cidB,String filed) {
        Map<String,Map<String,List<PlatBean>>> map=activityMediaSlotAnalysisService.contactTypeComposition(cidA, cidB,filed);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, map);
    }

    //多活动归因-分媒介分触点类型构成下载
    @GetMapping("/contactTypeCompositionDownloadRJX")
    public void contactTypeCompositionDownload(HttpServletResponse response, String cidA, String cidB,String filed) throws Exception {
        activityMediaSlotAnalysisService.contactTypeCompositionDownload(response, cidA, cidB,filed);
    }

    //多活动归因-分媒介分触点类型分布
    @GetMapping("/contactDistributionRJX")
    public Result contactDistribution(String cidA, String cidB,String filed,String media) {
        Map<String, List<PlatBean>> map=activityMediaSlotAnalysisService.contactDistribution(cidA, cidB,filed,media);
        return new Result(ContentResult.SUCCESS_CODE, ContentResult.SUCCESS_MESSAGE, map);
    }

    //多活动归因-分媒介分触点类型分布下载
    @GetMapping("/contactDistributionDownloadRJX")
    public void contactDistributionDownload(HttpServletResponse response, String cidA, String cidB,String filed,String media) throws Exception {
        activityMediaSlotAnalysisService.contactDistributionDownload(response, cidA, cidB,filed,media);
    }

    @GetMapping("/uploadRJX")
    public void upload(){
        System.out.println(upload);

    }


}
