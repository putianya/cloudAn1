package com.hy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.mapper.ActivityPlatformGroupMapper;
import com.hy.pojo.ActivityPlatformGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import com.hy.service.ActivityPlatformGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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


}
