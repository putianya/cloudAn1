package com.hy.service;

import com.hy.pojo.ActivityPlatformContentDirectionGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ActivityPlatformContentDirectionGroupService {
    PageResult<ActivityPlatformContentDirectionGroup> findActivityDirectionGroup(PageResultQuery query);

    void findActivityDirectionGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException;
}
