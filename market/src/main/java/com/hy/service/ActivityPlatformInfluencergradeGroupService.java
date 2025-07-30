package com.hy.service;

import com.hy.pojo.ActivityPlatformInfluencergradeGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public interface ActivityPlatformInfluencergradeGroupService {
    PageResult<ActivityPlatformInfluencergradeGroup> findActivityPlatformInfluencergradeGroup(PageResultQuery query);

    void findActivityPlatformInfluencergradeGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException;
}
