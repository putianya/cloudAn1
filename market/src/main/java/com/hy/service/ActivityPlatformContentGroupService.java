package com.hy.service;

import com.hy.pojo.ActivityPlatformContentGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ActivityPlatformContentGroupService {
    PageResult<ActivityPlatformContentGroup> findActivityPlatformContentGroup(PageResultQuery query);

    void findActivityPlatformContentGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException;
}
