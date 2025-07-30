package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.exceltemp.*;
import com.hy.mapper.ActivityMediaSlotAnalysisMapper;
import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.MediaSlot;
import com.hy.pojo.PlatBean;
import com.hy.result.PageResult;
import com.hy.result.ResultMediaSlot;
import com.hy.service.ActivityMediaSlotAnalysisService;
import com.hy.utils.ExcelUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ActivityMediaSlotAnalysisServiceImpl implements ActivityMediaSlotAnalysisService {
    @Autowired
    private ActivityMediaSlotAnalysisMapper activityMediaSlotAnalysisMapper;

    @Override
    public List<String> findContactPoint() {
        return activityMediaSlotAnalysisMapper.findContactPoint();
    }

    @Override
    public PageResult<MediaSlot> findMediaSlot(ResultMediaSlot slot) {

        // 使用PageHelper插件进行分页
        PageHelper.startPage(slot.getPageNum(), slot.getPageSize());
        // 调用activityMediaSlotAnalysisMapper的findMediaSlot方法，查询媒体位信息
        List<MediaSlot> mediaSlots = activityMediaSlotAnalysisMapper.findMediaSlot(slot);

        // 创建PageInfo对象，用于存储分页信息
        PageInfo<MediaSlot> info = new PageInfo<>(mediaSlots);

        // 返回分页结果
        return new PageResult<MediaSlot>(info.getPageNum(), info.getPageSize(), info.getList(), info.getTotal());
    }

    @Override
    public void mediaSlotDown(HttpServletResponse response, ResultMediaSlot slot) throws IOException {
        // 调用findMediaSlot方法获取分页结果
        PageResult<MediaSlot> page = findMediaSlot(slot);
        List<MediaSlot> list = page.getList();
        List<MediaSlotExcel> collection = list.stream().map((x) -> {
            MediaSlotExcel excel = new MediaSlotExcel();
            BeanUtils.copyProperties(x, excel);
            return excel;
        }).collect(Collectors.toList());
        //分页逻辑
        String filename = System.currentTimeMillis() + "";
        //获取样式信息
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        //发送下载请求
        EasyExcel.write(response.getOutputStream(), MediaSlotExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("媒介归因排名")
                .doWrite(collection);


    }

    @Override
    public List<String> findAllMedia() {
        return activityMediaSlotAnalysisMapper.findAllMedia();
    }

    @Override
    public void contactPointDown(HttpServletResponse response, ResultMediaSlot slot) throws IOException {
        // 根据slot查询MediaSlot
        PageResult<MediaSlot> page = findMediaSlot(slot);
        // 获取MediaSlot列表
        List<MediaSlot> list = page.getList();
        // 将MediaSlot列表转换为ContactPointSlotExcel列表
        List<ContactPointSlotExcel> collection = list.stream().map((x) -> {
            ContactPointSlotExcel excel = new ContactPointSlotExcel();
            BeanUtils.copyProperties(x, excel);
            return excel;
        }).collect(Collectors.toList());
        // 生成文件名
        String filename = System.currentTimeMillis() + "";
        // 获取水平单元格样式策略
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        // 使用EasyExcel将ContactPointSlotExcel列表写入Excel文件
        EasyExcel.write(response.getOutputStream(), ContactPointSlotExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("触点类型归因排名")
                .doWrite(collection);
    }

    @Override
    public Map<String, Map<String, List<PlatBean>>> platformDeliveryComparison(String cidA, String cidB, String filed) {
        //根据cidA和cidB以及filed查询出platBeans
        List<PlatBean> platBeans = activityMediaSlotAnalysisMapper.platformDeliveryComparison(cidA, cidB, filed);
        //将platBeans按照cname进行分组
        Map<String, List<PlatBean>> collect = platBeans.stream().collect(Collectors.groupingBy((x) -> x.getCname()));

        //创建一个返回数据
        HashMap<String, Map<String, List<PlatBean>>> map = new HashMap<>();
        //遍历collect，将每个cname对应的platBean按照media进行分组
        collect.forEach((k, v) -> {
            Map<String, List<PlatBean>> collect1 = v.stream().collect(Collectors.groupingBy((y) -> y.getMedia()));
            //将分组后的数据放入map中
            map.put(k, collect1);
        });
        //返回map
        return map;
    }

    @Override
    public void platformDeliveryComparisonDownload(HttpServletResponse response, String cidA, String cidB, String filed) throws Exception {
        List<PlatBean> platBeans = activityMediaSlotAnalysisMapper.platformDeliveryComparison(cidA, cidB, filed);
        //转换数据
        List<PlatformDeliveryExcel> collect = platBeans.stream().map((x) -> {
            PlatformDeliveryExcel p = new PlatformDeliveryExcel();
            BeanUtils.copyProperties(x, p);
            return p;
        }).collect(Collectors.toList());

        String filename = URLEncoder.encode("平台投放对比" + System.currentTimeMillis(), "UTF-8");
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        EasyExcel.write(response.getOutputStream(), PlatformDeliveryExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("媒介平台构成对比")
                .doWrite(collect);

    }

    @Override
    public Map<String, Map<String, List<PlatBean>>> distributionOfSubMediaPlatforms(String cidA, String cidB, String filed) {
        // 根据cidA、cidB和filed查询子媒体平台分布
        List<PlatBean> platBeans = activityMediaSlotAnalysisMapper.distributionOfSubMediaPlatforms(cidA, cidB, filed);
        // 将查询结果按照媒体分组
        Map<String, List<PlatBean>> collect = platBeans.stream().collect(Collectors.groupingBy((x) -> x.getMedia()));

        // 创建一个HashMap用于存储结果
        HashMap<String, Map<String, List<PlatBean>>> mm = new HashMap<>();

        // 遍历分组结果，将每个媒体下的子媒体分组
        collect.forEach((k, v) -> {
            Map<String, List<PlatBean>> map = v.stream().collect(Collectors.groupingBy((y) -> y.getCname()));
            // 将分组结果放入HashMap中
            mm.put(k, map);
        });
        // 返回结果
        return mm;
    }

    @Override
    public void distributionOfSubMediaPlatformsDownload(HttpServletResponse response, String cidA, String cidB, String filed) throws Exception {
        // 根据cidA、cidB和filed查询分媒介平台分布
        List<PlatBean> platBeans = activityMediaSlotAnalysisMapper.distributionOfSubMediaPlatforms(cidA, cidB, filed);
        // 将查询结果转换为PlatformDeliveryExcel对象
        List<PlatformDeliveryExcel> collect = platBeans.stream().map((x) -> {
            PlatformDeliveryExcel pe = new PlatformDeliveryExcel();
            BeanUtils.copyProperties(x, pe);
            return pe;
        }).collect(Collectors.toList());
        // 生成文件名，使用当前时间戳
        String filename = URLEncoder.encode("分媒介平台分布" + System.currentTimeMillis(), "UTF-8");
        // 获取水平单元格样式策略
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        // 使用EasyExcel将数据写入Excel文件
        EasyExcel.write(response.getOutputStream(), PlatformDeliveryExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("分媒介平台分布")
                .doWrite(collect);
    }

    @Override
    public Map<String, Map<String, List<PlatBean>>> contactTypeComposition(String cidA, String cidB, String filed) {
        List<PlatBean> list = activityMediaSlotAnalysisMapper.contactTypeComposition(cidA, cidB, filed);
        Map<String, List<PlatBean>> map = list.stream().collect(Collectors.groupingBy((x) -> x.getPoint()));

        HashMap<String, Map<String, List<PlatBean>>> mm = new HashMap<>();

        map.forEach((k, v) -> {
                    Map<String, List<PlatBean>> collect = v.stream().collect(Collectors.groupingBy((y) -> y.getCname()));
                    mm.put(k, collect);
                }
        );
        return mm;
    }

    @Override
    public void contactTypeCompositionDownload(HttpServletResponse response, String cidA, String cidB, String filed) throws Exception {
        // 根据cidA、cidB和filed查询分媒介分触点类型构成数据
        List<PlatBean> list = activityMediaSlotAnalysisMapper.contactTypeComposition(cidA, cidB, filed);
        // 将查询结果转换为PlatformDeliveryPointExcel类型
        List<PlatformDeliveryPointExcel> pointList = list.stream().map((x) -> {
            PlatformDeliveryPointExcel ex = new PlatformDeliveryPointExcel();
            BeanUtils.copyProperties(x, ex);
            return ex;
        }).collect(Collectors.toList());

        // 生成文件名，使用当前时间戳
        String filename = URLEncoder.encode("分媒介分触点类型构成" + System.currentTimeMillis(), "UTF-8");

        // 获取水平单元格样式策略
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);

        // 使用EasyExcel将数据写入Excel文件
        EasyExcel.write(response.getOutputStream(), PlatformDeliveryPointExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("分媒介分触点类型构成")
                .doWrite(pointList);
    }

    @Override
    public  Map<String, List<PlatBean>> contactDistribution(String cidA, String cidB, String filed, String media) {
        // 根据传入的参数，调用activityMediaSlotAnalysisMapper的contactDistribution方法，获取List<PlatBean>对象
        List<PlatBean> list = activityMediaSlotAnalysisMapper.contactDistribution(cidA, cidB, filed, media);
        // 将List<PlatBean>对象按照media属性进行分组，得到Map<String, List<PlatBean>>对象
        Map<String, List<PlatBean>> map = list.stream().collect(Collectors.groupingBy((x) -> x.getMedia()));
        // 创建一个HashMap对象，用于存储最终的结果
        HashMap<String,List<PlatBean>> mm = new HashMap<>();
        // 遍历Map<String, List<PlatBean>>对象
        map.forEach((k, v) -> {
                    Map<String, List<PlatBean>> m = v.stream().collect(Collectors.groupingBy((y) -> y.getPoint()));
                    m.forEach((k1, v1) -> {

                        mm.put(k + "-" + k1, v1);
                    });

                });
            // 返回HashMap对象
            return mm;
        }

    @Override
    public void contactDistributionDownload(HttpServletResponse response, String cidA, String cidB, String filed, String media) throws Exception{
        List<PlatBean> list = activityMediaSlotAnalysisMapper.contactDistribution(cidA, cidB, filed, media);
        List<contactDistributionExcel> list1 = list.stream().map((x) -> {
            contactDistributionExcel ex = new contactDistributionExcel();
            BeanUtils.copyProperties(x, ex);
            return ex;
        }).collect(Collectors.toList());

        String filename = URLEncoder.encode("分媒介分触点类型分布" + System.currentTimeMillis(), "UTF-8");
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        EasyExcel.write(response.getOutputStream(), contactDistributionExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("分媒介分触点类型分布")
                .doWrite(list1);
        }
}

