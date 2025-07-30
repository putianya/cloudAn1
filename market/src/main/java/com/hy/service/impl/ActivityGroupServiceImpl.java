package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.hy.exceltemp.ActivityGroupExcel;
import com.hy.exceltemp.MediaSlotExcel;
import com.hy.mapper.ActivityGroupMapper;
import com.hy.pojo.ActivityGroup;
import com.hy.result.PageResultQuery;
import com.hy.service.ActivityGroupService;
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
public class ActivityGroupServiceImpl implements ActivityGroupService {


    @Autowired
    private ActivityGroupMapper activityGroupMapper;

    @Override
    public List<ActivityGroup> findActivityGroup(PageResultQuery query) {
        return activityGroupMapper.findActivityGroup(query);
    }

    @Override
    public void findActivityGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException {
        List<ActivityGroup> list = activityGroupMapper.findActivityGroup(query);
    List<ActivityGroupExcel> collection = list.stream().map((x) -> {
        ActivityGroupExcel excel = new ActivityGroupExcel();
        BeanUtils.copyProperties(x, excel);
        return excel;
    }).collect(Collectors.toList());

        //分页逻辑
        String filename = System.currentTimeMillis() + "";
        //获取样式信息
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        //发送下载请求
        EasyExcel.write(response.getOutputStream(), ActivityGroupExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("分媒体分活动")
                .doWrite(collection);
    }


}
