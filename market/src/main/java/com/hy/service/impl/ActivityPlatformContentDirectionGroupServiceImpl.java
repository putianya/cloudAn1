package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.exceltemp.ActivityDirectionGroupExcel;
import com.hy.mapper.ActivityPlatformContentDirectionGroupMapper;
import com.hy.pojo.ActivityPlatformContentDirectionGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import com.hy.service.ActivityPlatformContentDirectionGroupService;
import com.hy.utils.ExcelUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityPlatformContentDirectionGroupServiceImpl implements ActivityPlatformContentDirectionGroupService {
    @Autowired
    private ActivityPlatformContentDirectionGroupMapper activityPlatformContentDirectionGroupMapper;

    @Override
    public PageResult<ActivityPlatformContentDirectionGroup> findActivityDirectionGroup(PageResultQuery query) {

        PageHelper.startPage(query.getPageNum(),query.getPageSize());
        List<ActivityPlatformContentDirectionGroup> list=activityPlatformContentDirectionGroupMapper.findActivityDirectionGroup(query);
        PageInfo<ActivityPlatformContentDirectionGroup> info=new PageInfo<>(list);
        return new PageResult<>(info.getPageNum(), info.getPageSize(), info.getList(), info.getTotal());
    }

    @Override
    public void findActivityDirectionGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException {

        PageResult<ActivityPlatformContentDirectionGroup> page   = findActivityDirectionGroup(query);
        //获取PageResult中的数据集合
        List<ActivityPlatformContentDirectionGroup> list = page.getList();

        //拷贝数据：List<ActivityPlatformContentDirectionGroup> --> List<ActivityDirectionGroupExcel>
        List<ActivityDirectionGroupExcel> collection = list.stream().map(( x)-> {
            ActivityDirectionGroupExcel excel = new ActivityDirectionGroupExcel();
            BeanUtils.copyProperties(x, excel);
            extracted(x, excel);

            return excel;
        }).collect(Collectors.toList());
        //分页逻辑
        String filename = System.currentTimeMillis() + "";
        //获取样式信息
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        //发送下载请求
        EasyExcel.write(response.getOutputStream(), ActivityDirectionGroupExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("分媒体分活动分内容方向")
                .doWrite(collection);
    }

    private static void extracted(ActivityPlatformContentDirectionGroup x, ActivityDirectionGroupExcel excel) {
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

