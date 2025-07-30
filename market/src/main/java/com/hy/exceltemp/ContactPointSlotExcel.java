package com.hy.exceltemp;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class ContactPointSlotExcel {
    @ExcelProperty("活动名称")
    private String campaignName;
    @ExcelProperty("媒体")
    private String media;
    @ExcelProperty("接触点")
    private String contactPoint;
    @ExcelProperty("活动ID")
    private String campaignId;
    @ExcelProperty("开始日期")
    private Date startDate;
    @ExcelProperty("结束日期")
    private Date endDate;
    @ExcelProperty("花费")
    private BigDecimal cost;
    @ExcelProperty("曝光次数")
    private Long exposureCount;
    @ExcelProperty("曝光人数")
    private Long exposureUserCount;
    @ExcelProperty("点击次数")
    private Long clickCount;
    @ExcelProperty("点击人数")
    private Long clickUserCount;
    @ExcelProperty("月活会员数")
    private Long monthlyActiveMemberCount;
    @ExcelProperty("月活会员GMV")
    private BigDecimal monthlyActiveMemberGmv;
    @ExcelProperty("新增会员数")
    private Long newMemberAcquisitionCount;
    @ExcelProperty("新增会员GMV")
    private BigDecimal newMemberAcquisitionGmv;
    @ExcelProperty("次月月活会员数")
    private Long nextMonthActiveMemberCount;
    @ExcelProperty("次月月活会员GMV")
    private BigDecimal nextMonthActiveMemberGmv;
    @ExcelProperty("次月新增会员数")
    private Long nextMonthNewMemberCount;
    @ExcelProperty("次月新增会员GMV")
    private BigDecimal nextMonthNewMemberGmv;

    //占比字段
    @ExcelProperty("花费占比")
    private BigDecimal costAcc;
    @ExcelProperty("曝光次数占比")
    private BigDecimal exposureCountAcc;
    @ExcelProperty("曝光人数占比")
    private BigDecimal exposureUserCountAcc;
    @ExcelProperty("点击次数占比")
    private BigDecimal clickCountAcc;
    @ExcelProperty("点击人数占比")
    private BigDecimal clickUserCountAcc;
    @ExcelProperty("月活会员数占比")
    private BigDecimal mamcAcc;
    @ExcelProperty("月活会员GMV占比")
    private BigDecimal mamgAcc;
    @ExcelProperty("新增会员数占比")
    private BigDecimal nmacAcc;
    @ExcelProperty("新增会员GMV占比")
    private BigDecimal nmagAcc;
    @ExcelProperty("次月月活会员数占比")
    private BigDecimal nmnmcaAcc;
    @ExcelProperty("次月月活会员GMV占比")
    private BigDecimal nmamgAcc;
    @ExcelProperty("次月新增会员数占比")
    private BigDecimal nmnmcAcc;
    @ExcelProperty("次月新增会员GMV占比")
    private BigDecimal nmnmgAcc;

    @ExcelProperty("CPM")
    private BigDecimal cpm;//CPM=花费/曝光次数*1000
    @ExcelProperty("月活会员ROI")
    private BigDecimal roi;//月活会员ROI=（收入-花费）/花费*100%
    @ExcelProperty("CAC")
    private BigDecimal cac;//CAC=花费/新增会员数
    @ExcelProperty("月活会员贡献率")
    private BigDecimal mamcRate;//月活会员贡献率=月活会员数/周期月
    @ExcelProperty("月活会员GMV贡献率")
    private BigDecimal mamcGmvRate;//月活会员GMV贡献率=月活会员GMV/周期月
    @ExcelProperty("拉新会员ROI")
    private BigDecimal rnmRoi;//拉新会员ROI=拉新会员GMA/花费
    @ExcelProperty("月活会员CAC")
    private BigDecimal rnmCac;//月活会员CAC=花费/月活会员数
    @ExcelProperty("月活会员贡献率2")
    private BigDecimal nmcRate;//月活会员贡献率=月活会员数/周期月活人数
    @ExcelProperty("月活会员GMV贡献率2")
    private BigDecimal nmcGmvRate;//月活会员GMV贡献率=月活会员GMV/周期月活GMV
    @ExcelProperty("活动期人均月活GMV")
    private BigDecimal pcmaGmv;//活动期人均月活GMV=月活会员GMV/月活会员数
    @ExcelProperty("次月人均月活GMV")
    private BigDecimal mpcmaGmv;//次月人均月活GMV=次月月活会员GMV/次月月活会员数
    @ExcelProperty("活动期人均拉新GMV")
    private BigDecimal pcnGmv;//活动期人均拉新GMV=拉新会员GMV/拉新会员数
    @ExcelProperty("次月人均拉新GMV")
    private BigDecimal panGmv;//次月人均拉新GMV=次月拉新会员GMV/次月拉新会员数
    @ExcelProperty("月活次月留存率")
    private BigDecimal masmRate;//月活次月留存率=次月月活会员数/月活会员数
    @ExcelProperty("拉新次月留存率")
    private BigDecimal mrrRate;//拉新次月留存率=次月拉新会员数/拉新会员数

    @ExcelProperty("CPM均值")
    private BigDecimal cpmAvg;//CPM=花费/曝光次数*1000
    @ExcelProperty("月活会员ROI均值")
    private BigDecimal roiAvg;//月活会员ROI=（收入-花费）/花费*100%
    @ExcelProperty("CAC均值")
    private BigDecimal cacAvg;//CAC=花费/新增会员数
    @ExcelProperty("月活会员贡献率均值")
    private BigDecimal mamcRateAvg;//月活会员贡献率=月活会员数/周期月
    @ExcelProperty("月活会员GMV贡献率均值")
    private BigDecimal mamcGmvRateAvg;//月活会员GMV贡献率=月活会员GMV/周期月
    @ExcelProperty("拉新会员ROI均值")
    private BigDecimal rnmRoiAvg;//拉新会员ROI=拉新会员GMA/花费
    @ExcelProperty("月活会员CAC均值")
    private BigDecimal rnmCacAvg;//月活会员CAC=花费/月活会员数
    @ExcelProperty("月活会员贡献率均值2")
    private BigDecimal nmcRateAvg;//月活会员贡献率=月活会员数/周期月活人数
    @ExcelProperty("月活会员GMV贡献率均值2")
    private BigDecimal nmcGmvRateAvg;//月活会员GMV贡献率=月活会员GMV/周期月活GMV
    @ExcelProperty("活动期人均月活GMV均值")
    private BigDecimal pcmaGmvAvg;//活动期人均月活GMV=月活会员GMV/月活会员数
    @ExcelProperty("次月人均月活GMV均值")
    private BigDecimal mpcmaGmvAvg;//次月人均月活GMV=次月月活会员GMV/次月月活会员数
    @ExcelProperty("活动期人均拉新GMV均值")
    private BigDecimal pcnGmvAvg;//活动期人均拉新GMV=拉新会员GMV/拉新会员数
    @ExcelProperty("次月人均拉新GMV均值")
    private BigDecimal panGmvAvg;//次月人均拉新GMV=次月拉新会员GMV/次月拉新会员数
    @ExcelProperty("月活次月留存率均值")
    private BigDecimal masmRateAvg;//月活次月留存率=次月月活会员数/月活会员数
    @ExcelProperty("拉新次月留存率均值")
    private BigDecimal mrrRateAvg;//拉新次月留存率=次月拉新会员数/拉新会员数

    @ExcelProperty("CPM差值")
    private BigDecimal cpmDiff;//CPM=花费/曝光次数*1000
    @ExcelProperty("月活会员ROI差值")
    private BigDecimal roiDiff;//月活会员ROI=（收入-花费）/花费*100%
    @ExcelProperty("CAC差值")
    private BigDecimal cacDiff;//CAC=花费/新增会员数
    @ExcelProperty("月活会员贡献率差值")
    private BigDecimal mamcRateDiff;//月活会员贡献率=月活会员数/周期月
    @ExcelProperty("月活会员GMV贡献率差值")
    private BigDecimal mamcGmvRateDiff;//月活会员GMV贡献率=月活会员GMV/周期月
    @ExcelProperty("拉新会员ROI差值")
    private BigDecimal rnmRoiDiff;//拉新会员ROI=拉新会员GMA/花费
    @ExcelProperty("月活会员CAC差值")
    private BigDecimal rnmCacDiff;//月活会员CAC=花费/月活会员数
    @ExcelProperty("月活会员贡献率差值2")
    private BigDecimal nmcRateDiff;//月活会员贡献率=月活会员数/周期月活人数
    @ExcelProperty("月活会员GMV贡献率差值2")
    private BigDecimal nmcGmvRateDiff;//月活会员GMV贡献率=月活会员GMV/周期月活GMV
    @ExcelProperty("活动期人均月活GMV差值")
    private BigDecimal pcmaGmvDiff;//活动期人均月活GMV=月活会员GMV/月活会员数
    @ExcelProperty("次月人均月活GMV差值")
    private BigDecimal mpcmaGmvDiff;//次月人均月活GMV=次月月活会员GMV/次月月活会员数
    @ExcelProperty("活动期人均拉新GMV差值")
    private BigDecimal pcnGmvDiff;//活动期人均拉新GMV=拉新会员GMV/拉新会员数
    @ExcelProperty("次月人均拉新GMV差值")
    private BigDecimal panGmvDiff;//次月人均拉新GMV=次月拉新会员GMV/次月拉新会员数
    @ExcelProperty("月活次月留存率差值")
    private BigDecimal masmRateDiff;//月活次月留存率=次月月活会员数/月活会员数
    @ExcelProperty("拉新次月留存率差值")
    private BigDecimal mrrRateDiff;//拉新次月留存率=次月拉新会员数/拉新会员数
}
