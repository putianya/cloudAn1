package com.hy.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ActivityPlatformContentDirectionGroup {
    private String campaignName;

    private String media;

    private String contentDirection;

    private BigDecimal cost;

    private Long exposureCount;

    private Long exposureUserCount;

    private BigDecimal avgImpressionFrequency;

    private Long clickCount;

    private Long clickUserCount;

    private Long monthlyActiveMemberCount;

    private BigDecimal monthlyActiveMemberGmv;

    private Long newMemberAcquisitionCount;

    private BigDecimal newMemberAcquisitionGmv;

    private Long nextMonthActiveMemberCount;

    private BigDecimal nextMonthActiveMemberGmv;

    private Long nextMonthNewMemberCount;

    private BigDecimal nextMonthNewMemberGmv;

    private Alog alog;
}