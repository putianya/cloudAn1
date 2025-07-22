package com.hy.service;

import com.hy.pojo.ActivityPlatformGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;

import java.util.List;

public interface ActivityPlatformGroupService {
    PageResult<ActivityPlatformGroup> findActivityPlatformGroup(PageResultQuery query);
}
