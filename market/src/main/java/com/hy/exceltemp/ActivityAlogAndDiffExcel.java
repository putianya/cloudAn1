package com.hy.exceltemp;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ActivityAlogAndDiffExcel {
    @ExcelProperty("活动名称")
    private String campaignName;
    @ExcelProperty("活动ID")
    private String campaignId;
    @ExcelProperty("开始日期")
    @ColumnWidth(value = 40)
    private Date startDate;
    @ColumnWidth(value = 40)
    @ExcelProperty("结束日期")
    private Date endDate;
    @ExcelProperty("花费")
    private BigDecimal cost;
    @ExcelProperty("监测率")
    private BigDecimal monitorRate;
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
    @ExcelProperty("拉新会员数")
    private Long newMemberAcquisitionCount;
    @ExcelProperty("拉新会员GMV")
    private BigDecimal newMemberAcquisitionGmv;
    @ExcelProperty("周期月活人数")
    private Long periodicMonthlyActiveUserCount;
    @ExcelProperty("周期月活GMV")
    private BigDecimal periodicMonthlyActiveUserGmv;
    @ExcelProperty("周期拉新会员数")
    private Long periodicNewMemberCount;
    @ExcelProperty("周期拉新会员GMV")
    private BigDecimal periodicNewMemberGmv;
    @ExcelProperty("次月月活会员数")
    private Long nextMonthActiveMemberCount;
    @ExcelProperty("次月月活会员GMV")
    private BigDecimal nextMonthActiveMemberGmv;
    @ExcelProperty("次月拉新会员数")
    private Long nextMonthNewMemberCount;
    @ExcelProperty("次月拉新会员GMV")
    private BigDecimal nextMonthNewMemberGmv;
    @ExcelProperty("活动类型")
    private String activityType;

    @ExcelProperty("花费差异")
    private BigDecimal costDiff;

    @ExcelProperty("监测率差异")
    private BigDecimal monitorRateDiff;

    @ExcelProperty("曝光次数差异")
    private Long exposureCountDiff;

    @ExcelProperty("曝光人数差异")
    private Long exposureUserCountDiff;

    @ExcelProperty("点击次数差异")
    private Long clickCountDiff;

    @ExcelProperty("点击人数差异")
    private Long clickUserCountDiff;

    @ExcelProperty("月活会员数差异")
    private Long monthlyActiveMemberCountDiff;

    @ExcelProperty("月活会员GMV差异")
    private BigDecimal monthlyActiveMemberGmvDiff;

    @ExcelProperty("拉新会员数差异")
    private Long newMemberAcquisitionCountDiff;

    @ExcelProperty("拉新会员GMV差异")
    private BigDecimal newMemberAcquisitionGmvDiff;

    @ExcelProperty("周期月活人数差异")
    private Long periodicMonthlyActiveUserCountDiff;

    @ExcelProperty("周期月活GMV差异")
    private BigDecimal periodicMonthlyActiveUserGmvDiff;

    @ExcelProperty("周期拉新会员数差异")
    private Long periodicNewMemberCountDiff;

    @ExcelProperty("周期拉新会员GMV差异")
    private BigDecimal periodicNewMemberGmvDiff;

    @ExcelProperty("次月月活会员数差异")
    private Long nextMonthActiveMemberCountDiff;

    @ExcelProperty("次月月活会员GMV差异")
    private BigDecimal nextMonthActiveMemberGmvDiff;

    @ExcelProperty("次月拉新会员数差异")
    private Long nextMonthNewMemberCountDiff;

    @ExcelProperty("次月拉新会员GMV差异")
    private BigDecimal nextMonthNewMemberGmvDiff;


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
