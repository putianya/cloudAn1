package com.hy.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class MediaSlot {

    private String campaignName;
    private String media;
    private String contactPoint;
    private String campaignId;
    private Date startDate;
    private Date endDate;
    private BigDecimal cost;
    private Long exposureCount;
    private Long exposureUserCount;
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

    //占比字段
    private BigDecimal costAcc;
    private BigDecimal exposureCountAcc;
    private BigDecimal exposureUserCountAcc;
    private BigDecimal clickCountAcc;
    private BigDecimal clickUserCountAcc;
    private BigDecimal mamcAcc;
    private BigDecimal mamgAcc;
    private BigDecimal nmacAcc;
    private BigDecimal nmagAcc;
    private BigDecimal nmnmcaAcc;
    private BigDecimal nmamgAcc;
    private BigDecimal nmnmcAcc;
    private BigDecimal nmnmgAcc;

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

    private BigDecimal cpmAvg;//CPM=花费/曝光次数*1000
    private BigDecimal roiAvg;//月活会员ROI=（收入-花费）/花费*100%
    private BigDecimal cacAvg;//CAC=花费/新增会员数
    private BigDecimal mamcRateAvg;//月活会员贡献率=月活会员数/周期月
    private BigDecimal mamcGmvRateAvg;//月活会员GMV贡献率 月活会员GMV贡献率=月活会员GMV/周期月
    private BigDecimal rnmRoiAvg;//拉新会员ROI=拉新会员GMA/花费
    private BigDecimal rnmCacAvg;//月活会员CAC=花费/月活会员数
    private BigDecimal nmcRateAvg;//月活会员贡献率=月活会员数/周期月活人数
    private BigDecimal nmcGmvRateAvg;//月活会员GMV贡献率=月活会员GMV/周期月活GMV
    private BigDecimal pcmaGmvAvg;//活动期人均月活GMV=月活会员GMV/月活会员数
    private BigDecimal mpcmaGmvAvg;//次月人均月活GMV=次月月活会员GMV/次月月活会员数
    private BigDecimal pcnGmvAvg;//活动期人均拉新GMV=拉新会员GMV/拉新会员数
    private BigDecimal panGmvAvg;//次月人均拉新GMV=次月拉新会员GMV/次月拉新会员数
    private BigDecimal masmRateAvg;//月活次月留存率=次月月活会员数/月活会员数
    private BigDecimal mrrRateAvg;//拉新次月留存率=次月拉新会员数/拉新会员数

    private BigDecimal cpmDiff;//CPM=花费/曝光次数*1000
    private BigDecimal roiDiff;//月活会员ROI=（收入-花费）/花费*100%
    private BigDecimal cacDiff;//CAC=花费/新增会员数
    private BigDecimal mamcRateDiff;//月活会员贡献率=月活会员数/周期月
    private BigDecimal mamcGmvRateDiff;//月活会员GMV贡献率 月活会员GMV贡献率=月活会员GMV/周期月
    private BigDecimal rnmRoiDiff;//拉新会员ROI=拉新会员GMA/花费
    private BigDecimal rnmCacDiff;//月活会员CAC=花费/月活会员数
    private BigDecimal nmcRateDiff;//月活会员贡献率=月活会员数/周期月活人数
    private BigDecimal nmcGmvRateDiff;//月活会员GMV贡献率=月活会员GMV/周期月活GMV
    private BigDecimal pcmaGmvDiff;//活动期人均月活GMV=月活会员GMV/月活会员数
    private BigDecimal mpcmaGmvDiff;//次月人均月活GMV=次月月活会员GMV/次月月活会员数
    private BigDecimal pcnGmvDiff;//活动期人均拉新GMV=拉新会员GMV/拉新会员数
    private BigDecimal panGmvDiff;//次月人均拉新GMV=次月拉新会员GMV/次月拉新会员数
    private BigDecimal masmRateDiff;//月活次月留存率=次月月活会员数/月活会员数
    private BigDecimal mrrRateDiff;//拉新次月留存率=次月拉新会员数/拉新会员数
}
