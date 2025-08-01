package com.hy.result;

import lombok.Data;

import java.util.List;

@Data
public class PageResultQuery {

    private Integer pageNum;
    private Integer pageSize;
    private String cname;
    private List<String> medias ;
    private List<String> content;
    private List<String> contentDirection;
    private List<String> talentLevel;
    private List<String> talentType;
    private List<String> kolName;

    //用于标识前端用户正在访问的点位
    // 1.分活动 2.分活动分媒介 3.分活动分媒介分内容形式 4.分活动分媒介分内容方向
    // 5.分活动分媒介分达人等级6.分活动分媒介分达人类型 7.分活动分帖子
    private Integer status;
}
