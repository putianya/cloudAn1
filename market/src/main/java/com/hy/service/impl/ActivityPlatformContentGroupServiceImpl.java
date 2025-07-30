package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.exceltemp.ActivityGroupExcel;
import com.hy.exceltemp.ActivityPlatformContentGroupExcel;
import com.hy.mapper.ActivityPlatformContentGroupMapper;
import com.hy.pojo.ActivityGroup;
import com.hy.pojo.ActivityPlatformContentGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import com.hy.service.ActivityPlatformContentGroupService;
import com.hy.utils.ExcelUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityPlatformContentGroupServiceImpl implements ActivityPlatformContentGroupService {
    @Autowired
    private ActivityPlatformContentGroupMapper activityPlatformContentGroupMapper;

    @Override
    public PageResult<ActivityPlatformContentGroup> findActivityPlatformContentGroup(PageResultQuery query) {
        // 使用PageHelper插件进行分页查询
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<ActivityPlatformContentGroup> list=activityPlatformContentGroupMapper.findActivityPlatformContentGroup(query);
         PageInfo<ActivityPlatformContentGroup> info=new PageInfo<>(list);
         return  new   PageResult<>(info.getPageNum(), info.getPageSize(), info.getList(), info.getTotal());
    }

    @Override
    public void findActivityPlatformContentGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException {
        List<ActivityPlatformContentGroup> list = activityPlatformContentGroupMapper.findActivityPlatformContentGroup(query);
        List<ActivityPlatformContentGroupExcel> collection = list.stream().map((x) -> {
            ActivityPlatformContentGroupExcel excel = new ActivityPlatformContentGroupExcel();
            BeanUtils.copyProperties(x, excel);

            extracted(x, excel);
            return excel;
        }).collect(Collectors.toList());

        //分页逻辑
        String filename = System.currentTimeMillis() + "";
        //获取样式信息
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        //发送下载请求
        EasyExcel.write(response.getOutputStream(), ActivityPlatformContentGroupExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("分活动分媒介分内容形式")
                .doWrite(collection);
    }

    private static void extracted(ActivityPlatformContentGroup x, ActivityPlatformContentGroupExcel excel) {
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
