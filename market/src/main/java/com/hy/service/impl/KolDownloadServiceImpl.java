package com.hy.service.impl;

import com.hy.result.PageResultQuery;
import com.hy.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class KolDownloadServiceImpl implements KolDownloadService {

    @Autowired
    private ActivityGroupService activityGroupService;
    @Autowired
    private ActivityPlatformGroupService activityPlatformGroupService;
    @Autowired
    private ActivityPlatformContentGroupService activityPlatformContentGroupService;
    @Autowired
    private ActivityPlatformContentDirectionGroupService activityPlatformContentDirectionGroupService;
    @Autowired
    private ActivityPlatformInfluencergradeGroupService activityPlatformInfluencergradeGroupService;
    @Autowired
    private ActivityPlatformInfluencertypeGroupService activityPlatformInfluencertypeGroupService;
    @Autowired
    private ActivityKolGroupService activityKolGroupService;

    @Override
    public void kolDownload(HttpServletResponse response, PageResultQuery query) throws IOException {
            // 根据query中的status值，调用不同的下载方法
            switch (query.getStatus()){
                case 1:
                    // 分活动下载
                    activityGroupService.findActivityGroupDownload(response,query);
                    return;
                case 2:
                    // 分活动分媒介下载
                    activityPlatformGroupService.findActivityPlatformGroupDownload(response,query);
                    return;
                case 3:
                    // 分活动分媒介分内容形式下载
                    activityPlatformContentGroupService.findActivityPlatformContentGroupDownload(response,query);
                    return;
                case 4:
                    // 分活动分媒介分内容方向下载
                    activityPlatformContentDirectionGroupService.findActivityDirectionGroupDownload(response,query);
                    return;
                case 5:
                    //分活动分媒介分达人等级下载
                    activityPlatformInfluencergradeGroupService.findActivityPlatformInfluencergradeGroupDownload(response,query);
                    return;
                case 6:
                    // 分活动分媒介分达人类型下载
                    activityPlatformInfluencertypeGroupService.findActivityPlatformInfluencerTypeGroupDownload(response,query);
                    return;
                case 7:
                    //分活动分帖子下载
                    activityKolGroupService.findActivityKolGroupDownload(response,query);

            }

    }
}
