package com.hy.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AlogAvg {
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
}
