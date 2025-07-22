package com.hy.service;

import com.hy.pojo.ActivityPlatformContentGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;

public interface ActivityPlatformContentGroupService {
    PageResult<ActivityPlatformContentGroup> findActivityPlatformContentGroup(PageResultQuery query);
}
