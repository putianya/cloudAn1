package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.A;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.exceltemp.ActivityPlatformInfluencergradeGroupExcel;
import com.hy.mapper.ActivityPlatformInfluencergradeGroupMapper;
import com.hy.pojo.ActivityPlatformInfluencergradeGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import com.hy.service.ActivityPlatformInfluencergradeGroupService;
import com.hy.utils.ExcelUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityPlatformInfluencergradeGroupServiceImpl implements ActivityPlatformInfluencergradeGroupService {

        @Autowired
    private ActivityPlatformInfluencergradeGroupMapper activityPlatformInfluencergradeGroupMapper;

    @Override
    public PageResult<ActivityPlatformInfluencergradeGroup> findActivityPlatformInfluencergradeGroup(PageResultQuery query) {
        PageHelper.startPage(query.getPageNum(),query.getPageSize());
        List<ActivityPlatformInfluencergradeGroup> list = activityPlatformInfluencergradeGroupMapper.findActivityPlatformInfluencergradeGroup(query);
        PageInfo<ActivityPlatformInfluencergradeGroup> info=new PageInfo<>(list);
        return new PageResult<>(info.getPageNum(),info.getPageSize(),info.getList(), info.getTotal() );
    }

    @Override
    public void findActivityPlatformInfluencergradeGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException {
        PageResult<ActivityPlatformInfluencergradeGroup> page = findActivityPlatformInfluencergradeGroup(query);

        List<ActivityPlatformInfluencergradeGroup> list = page.getList();

        List<ActivityPlatformInfluencergradeGroupExcel> collection = list.stream().map((x)->{
            ActivityPlatformInfluencergradeGroupExcel excel = new ActivityPlatformInfluencergradeGroupExcel();
            BeanUtils.copyProperties(x,excel);
            return excel;
        }).collect(Collectors.toList());

        String filename = System.currentTimeMillis() + "";
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response, filename);
        EasyExcel.write(response.getOutputStream(), ActivityPlatformInfluencergradeGroupExcel.class)
                .registerWriteHandler(horizontalCellStyleStrategy)
                .sheet("分活动分媒介分达人等级")
                .doWrite(collection);
    }
}
