package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.mapper.ActivityMediaSlotAnalysisMapper;
import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.MediaSlot;
import com.hy.result.PageResult;
import com.hy.service.ActivityMediaSlotAnalysisService;
import com.hy.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public class ActivityMediaSlotAnalysisServiceImpl implements ActivityMediaSlotAnalysisService {
    @Autowired
    private ActivityMediaSlotAnalysisMapper activityMediaSlotAnalysisMapper;

    @Override
    public List<String> findContactPoint() {
       return activityMediaSlotAnalysisMapper.findContactPoint();
    }

    @Override
        public PageResult<MediaSlot> findMediaSlot(String cid,String point,String orderfield, String ordertype,Integer pageNum,Integer pageSize,String media) {
        // 使用PageHelper插件进行分页
        PageHelper.startPage(pageNum,pageSize);
        // 调用activityMediaSlotAnalysisMapper的findMediaSlot方法，查询媒体位信息
        List<MediaSlot> mediaSlots= activityMediaSlotAnalysisMapper.findMediaSlot(cid,point, orderfield, ordertype,media);
        // 创建PageInfo对象，用于存储分页信息
        PageInfo<MediaSlot> info = new PageInfo<>(mediaSlots);
        // 返回分页结果
        return new PageResult<MediaSlot>(info.getPageNum(),info.getPageSize(),info.getList(),info.getTotal());
    }

    @Override
    public void mediaSlotDown(HttpServletResponse response, String cid, String point, String orderfield, String ordertype,Integer pageNum,Integer pageSize,String media) throws IOException {
        // 使用PageHelper插件进行分页
        PageHelper.startPage(pageNum,pageSize);
        List<MediaSlot> list = activityMediaSlotAnalysisMapper.findMediaSlot(cid,point, orderfield, ordertype,media);

        String filename = System.currentTimeMillis() + "";
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response,filename);

        EasyExcel.write(response.getOutputStream(), MediaSlot.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("媒介归因排名")
                .doWrite(list);


    }

    @Override
    public List<String> findAllMedia() {
        return activityMediaSlotAnalysisMapper.findAllMedia();
    }
}
