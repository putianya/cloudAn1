package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.A;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.exceltemp.ActivityPlatformInfluencertypeGroupExcel;
import com.hy.mapper.ActivityPlatformInfluencertypeGroupMapper;
import com.hy.pojo.ActivityPlatformInfluencertypeGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import com.hy.service.ActivityPlatformInfluencertypeGroupService;
import com.hy.utils.ExcelUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityPlatformInfluencertypeGroupServiceImpl implements ActivityPlatformInfluencertypeGroupService {
        @Autowired
    private ActivityPlatformInfluencertypeGroupMapper activityPlatformInfluencertypeGroupMapper;

    @Override
    public PageResult<ActivityPlatformInfluencertypeGroup> findActivityPlatformInfluencerTypeGroup(PageResultQuery query) {
        PageHelper.startPage(query.getPageNum(),query.getPageSize());
        List<ActivityPlatformInfluencertypeGroup> list = activityPlatformInfluencertypeGroupMapper.findActivityPlatformInfluencerTypeGroup(query);
        PageInfo<ActivityPlatformInfluencertypeGroup> info = new PageInfo<>(list);
        return new PageResult<>(info.getPageNum(),info.getPageSize(), info.getList(), info.getTotal());
    }

    @Override
    public void findActivityPlatformInfluencerTypeGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException {
        // 根据查询条件查询分活动分媒介分达人类型列表
        PageResult<ActivityPlatformInfluencertypeGroup> page = findActivityPlatformInfluencerTypeGroup(query);
        // 获取查询结果列表
        List<ActivityPlatformInfluencertypeGroup> list = page.getList();

        // 将查询结果列表转换为Excel格式
        List<ActivityPlatformInfluencertypeGroupExcel> collection = list.stream().map((x) -> {
            ActivityPlatformInfluencertypeGroupExcel excel = new ActivityPlatformInfluencertypeGroupExcel();
            // 将查询结果列表中的属性值复制到Excel格式中
            BeanUtils.copyProperties(x, excel);
            return excel;
        }).collect(Collectors.toList());

        // 生成文件名
        String filename = System.currentTimeMillis() + "";
        // 获取Excel样式策略
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        // 将查询结果列表写入Excel文件
        EasyExcel.write(response.getOutputStream(), ActivityPlatformInfluencertypeGroupExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("分活动分媒介分达人类型")
                .doWrite(collection);


    }
}
