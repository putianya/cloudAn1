package com.hy.exceltemp;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ActivityDirectionGroupExcel {
    @ExcelProperty("活动名称")
    private String campaignName;

    @ExcelProperty("媒体")
    private String media;

    @ExcelProperty("内容方向")
    private String contentDirection;

    @ExcelProperty("花费")
    private BigDecimal cost;

    @ExcelProperty("曝光次数")
    private Long exposureCount;

    @ExcelProperty("曝光用户数")
    private Long exposureUserCount;

    @ExcelProperty("平均曝光频次")
    private BigDecimal avgImpressionFrequency;

    @ExcelProperty("点击次数")
    private Long clickCount;

    @ExcelProperty("点击用户数")
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

    @ExcelProperty("CPM")
    private BigDecimal cpm;//CPM=花费/曝光次数*1000
    @ExcelProperty("月活会员ROI")
    private BigDecimal roi;//月活会员ROI=（收入-花费）/花费*100%
    @ExcelProperty("CAC")
    private BigDecimal cac;//CAC=花费/新增会员数
    @ExcelProperty("月活会员贡献率")
    private BigDecimal mamcRate;//月活会员贡献率=月活会员数/周期月
    @ExcelProperty("月活会员GMV贡献率")
    private BigDecimal mamcGmvRate;//月活会员GMV贡献率 月活会员GMV贡献率=月活会员GMV/周期月
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
}
