package com.hy.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ActivityPlatformInfluencergradeGroup {
    private String campaignName;

    private String media;

    private String talentLevel;

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

    private BigDecimal cpm;//CPM=花费/曝光次数*1000
    private BigDecimal roi;//月活会员ROI=（收入-花费）/花费*100%
    private BigDecimal cac;//CAC=花费/新增会员数
    private BigDecimal mamcRate;//月活会员贡献率=月活会员数/周期月
    private BigDecimal mamcGmvRate;//月活会员GMV贡献率 月活会员GMV贡献率=月活会员GMV/周期月
    private BigDecimal rnmRoi;//拉新会员ROI=拉新会员GMA/花费
    private BigDecimal rnmCac;//月活会员CAC=花费/月活会员数
    private BigDecimal nmcRate;//月活会员贡献率=月活会员数/周期月活人数
    private BigDecimal nmcGmvRate;//月活会员GMV贡献率=月活会员GMV/周期月活GMV
    private BigDecimal pcmaGmv;//活动期人均月活GMV=月活会员GMV/月活会员数
    private BigDecimal mpcmaGmv;//次月人均月活GMV=次月月活会员GMV/次月月活会员数
    private BigDecimal pcnGmv;//活动期人均拉新GMV=拉新会员GMV/拉新会员数
    private BigDecimal panGmv;//次月人均拉新GMV=次月拉新会员GMV/次月拉新会员数
    private BigDecimal masmRate;//月活次月留存率=次月月活会员数/月活会员数
    private BigDecimal mrrRate;//拉新次月留存率=次月拉新会员数/拉新会员数
}