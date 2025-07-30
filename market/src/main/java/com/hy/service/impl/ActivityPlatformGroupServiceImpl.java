package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.exceltemp.ActivityPlatformGroupExcel;
import com.hy.mapper.ActivityPlatformGroupMapper;
import com.hy.pojo.ActivityPlatformGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import com.hy.service.ActivityPlatformGroupService;
import com.hy.utils.ExcelUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityPlatformGroupServiceImpl implements ActivityPlatformGroupService {
    @Autowired
    private ActivityPlatformGroupMapper activityPlatformGroupMapper;

    @Override
    public PageResult<ActivityPlatformGroup> findActivityPlatformGroup(PageResultQuery query) {
        PageHelper.startPage(query.getPageNum(),query.getPageSize());
        List<ActivityPlatformGroup> ac= activityPlatformGroupMapper.findActivityPlatformGroup(query);
        PageInfo<ActivityPlatformGroup> info = new PageInfo<>(ac);
        return new PageResult<ActivityPlatformGroup>(info.getPageNum(), info.getPageSize(), info.getList(), info.getTotal());
    }

    @Override
    public void findActivityPlatformGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException {
        // 根据查询条件查询活动平台分组
        PageResult<ActivityPlatformGroup> page=findActivityPlatformGroup(query);
        // 获取查询结果列表
        List<ActivityPlatformGroup> list=page.getList();
        // TODO: 将查询结果导出为Excel文件
        List<ActivityPlatformGroupExcel> collection = list.stream().map((x) -> {
            ActivityPlatformGroupExcel excel = new ActivityPlatformGroupExcel();
            BeanUtils.copyProperties(x, excel);

            extracted(x, excel);

            return excel;
        }).collect(Collectors.toList());
        //分页逻辑
        String filename = System.currentTimeMillis() + "";
        //获取样式信息
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        //发送下载请求
        EasyExcel.write(response.getOutputStream(), ActivityPlatformGroupExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("分活动分媒介")
                .doWrite(collection);
        }

    private static void extracted(ActivityPlatformGroup x, ActivityPlatformGroupExcel excel) {
        excel.setCpm(x.getAlog().getCpm());
        excel.setRoi(x.getAlog().getRoi());
        excel.setCac(x.getAlog().getCac());
        excel.setMamcRate(x.getAlog().getMamcRate());
        excel.setMamcGmvRate(x.getAlog().getMamcGmvRate());
        excel.setRnmRoi(x.getAlog().getRnmRoi());
        excel.setRnmCac(x.getAlog().getRnmCac());
        excel.setNmcRate(x.getAlog().getNmcRate());
        excel.setNmcGmvRate(x.getAlog().getNmcGmvRate());
        excel.setPcmaGmv(x.getAlog().getPcmaGmv());
        excel.setMpcmaGmv(x.getAlog().getMpcmaGmv());
        excel.setPcnGmv(x.getAlog().getPcnGmv());
        excel.setPanGmv(x.getAlog().getPanGmv());
        excel.setMasmRate(x.getAlog().getMasmRate());
        excel.setMrrRate(x.getAlog().getMrrRate());
    }

}



