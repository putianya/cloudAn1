package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.hy.exceltemp.ActivityAnalysisExcel;
import com.hy.mapper.ActivityAnalysisMapper;
import com.hy.pojo.*;
import com.hy.service.ActivityService;
import com.hy.service.AlogService;
import com.hy.utils.Alogutil;
import com.hy.utils.ExcelUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityAnalysisMapper activityAnalysisMapper;

    @Autowired
    private AlogService alogService;

    @Override
    public List<ActivityAnalysis> findActivity() {
        return activityAnalysisMapper.selectByExample(null);
    }

    @Override
    public List<ActivityAnalysis> findNewAnList() {
        return activityAnalysisMapper.findNewAnList();
    }

    @Override
    public ActivityAnalysis findAllAN(String cid) {
        //查询当前活动的基本指标
        ActivityAnalysis ac = activityAnalysisMapper.selectAnByCid(cid);
        //查询当前活动的算法指标
        Alog alog = alogService.getAlog(cid);
        //查询当前同类型活动的指标历史均值
        AlogAvg alogAvg = alogService.getAlogAvg(cid);

        AlogDiff diff = Alogutil.getAlogDiff(alog, alogAvg);

        ac.setAlogDiff(diff);
        ac.setAlog(alog);
        return ac;
    }

    @Override
    public void anDonwload(HttpServletResponse response) {
        try {
            //获取数据
            List<ActivityAnalysis> ac = activityAnalysisMapper.selectByExample(null);

            //设置文件名
            String fileName = System.currentTimeMillis() + "";

            //调用工具类完成样式的调用
            HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, fileName);

            //拷贝数据 把ActivityAnalysis数据拷贝到ActivityAnalysisExcel
           List<ActivityAnalysisExcel> collect =ac.stream().map((aa)->{
               ActivityAnalysisExcel ae = new ActivityAnalysisExcel();
               BeanUtils.copyProperties(aa,ae);
               return ae;
           }).collect(Collectors.toList());

            //填充样式让其生效并且输出ac的内容
            EasyExcel.write(response.getOutputStream(), ActivityAnalysisExcel.class)
                    .registerWriteHandler(horizontalCellStyleStrategy)
                    .sheet("归因概览")
                    .doWrite(collect);
        } catch (IOException e) {
            e.printStackTrace();
            // 可根据实际情况添加日志或抛出自定义异常
        }
    }

    @Override
    public ConversionIncome getConversionIncome(String cid,String status) {
        List<ConversionIncome> c=activityAnalysisMapper.getConversionIncome(cid);
        ConversionIncome con=  null;
        //获list中cid的数据
        if(c!=null && c.size()>0) {
            con = c.get(0);
        }

        BigDecimal emacRate=new BigDecimal("0");
        BigDecimal etnccRate=new BigDecimal("0");
        //设置计算指标
        if("1".equals(status)){
            //为曝光次数时:
            //曝光月活转化率=月活会员数|曝光次数、曝光拉新转化率=拉新会员数/曝光次数//曝光人数时:
            emacRate=new BigDecimal(con.getMonthlyActiveMemberCount()).divide(new BigDecimal(con.getExposureCount()),2, RoundingMode.HALF_UP);
            etnccRate=new BigDecimal(con.getNewMemberAcquisitionCount()).divide(new BigDecimal(con.getExposureCount()),2, RoundingMode.HALF_UP);
            con.setEmacRate(emacRate);
            con.setEtnccRate(etnccRate);

            //获取均值
            ConversionIncome cs=activityAnalysisMapper.findConversionIncomeAvg();
            con.setEmacRateAvg(cs.getEmacRateAvg());
            con.setEtnccRateAvg(cs.getEtnccRateAvg());

            //差值
            con.setEmacRateDiff(emacRate.subtract(con.getEmacRateAvg()));
            con.setEtnccRateDiff(etnccRate.subtract(con.getEtnccRateAvg()));
        }else
        {
            //为曝光人数时:
            //曝光月活转化率=月活会员数|曝光人数、曝光拉新转化率=拉新会员数|曝光人数
            emacRate=new BigDecimal(con.getMonthlyActiveMemberCount()).divide(new BigDecimal(con.getExposureUserCount()),2, RoundingMode.HALF_UP);
            etnccRate=new BigDecimal(con.getNewMemberAcquisitionCount()).divide(new BigDecimal(con.getExposureUserCount()),2, RoundingMode.HALF_UP);
            con.setEmacRate(emacRate);
            con.setEtnccRate(etnccRate);

            //获取均值
            ConversionIncome cs=activityAnalysisMapper.findConversionIncomeAvgUser();
            con.setEmacRateAvg(cs.getEmacRateAvg());
            con.setEtnccRateAvg(cs.getEtnccRateAvg());

            //差值
            con.setEmacRateDiff(emacRate.subtract(con.getEmacRateAvg()));
            con.setEtnccRateDiff(etnccRate.subtract(con.getEtnccRateAvg()));
        }

        return  con;

    }

    @Override
    public void ConversionIncomeDown(HttpServletResponse response, String cid, String status) throws IOException {

       ConversionIncome con=getConversionIncome(cid,status);

       ArrayList<ConversionIncome> arr = new ArrayList<>();
       arr.add(con);

        String fileName = System.currentTimeMillis() + "";

        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, fileName);

        EasyExcel.write(response.getOutputStream(),ConversionIncome.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("转化效率分析")
                .doWrite(arr);
    }


}
