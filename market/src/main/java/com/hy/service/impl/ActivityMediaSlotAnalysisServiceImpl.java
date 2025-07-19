package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.hy.mapper.ActivityMediaSlotAnalysisMapper;
import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.MediaSlot;
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
    public List<MediaSlot> findMediaSlot(String cid,String point,String orderfield, String ordertype) {
       return activityMediaSlotAnalysisMapper.findMediaSlot(cid,point, orderfield, ordertype);
    }

    @Override
    public void mediaSlotDown(HttpServletResponse response, String cid, String point, String orderfield, String ordertype) throws IOException {
        List<MediaSlot> list = activityMediaSlotAnalysisMapper.findMediaSlot(cid,point, orderfield, ordertype);

        String filename = System.currentTimeMillis() + "";
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response,filename);

        EasyExcel.write(response.getOutputStream(), MediaSlot.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("媒介归因排名")
                .doWrite(list);


    }
}
