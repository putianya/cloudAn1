package com.hy.exceltemp;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class ActivityGroupExcel {
    @ExcelProperty("活动名称")
    private String campaignName;

    @ExcelProperty("花费")
    private BigDecimal cost;

    @ExcelProperty("曝光次数")
    private Long exposureCount;

    @ExcelProperty("曝光人数")
    private Long exposureUserCount;

    @ExcelProperty("平均曝光频次")
    private BigDecimal avgImpressionFrequency;

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

    @ExcelProperty("CPM")
    private BigDecimal cpm;
    @ExcelProperty("月活会员ROI")
    private BigDecimal roi;
    @ExcelProperty("CAC")
    private BigDecimal cac;
    @ExcelProperty("月活会员贡献率")
    private BigDecimal mamcRate;
    @ExcelProperty("月活会员GMV贡献率")
    private BigDecimal mamcGmvRate;
    @ExcelProperty("拉新会员ROI")
    private BigDecimal rnmRoi;
    @ExcelProperty("月活会员CAC")
    private BigDecimal rnmCac;
    @ExcelProperty("月活会员贡献率2")
    private BigDecimal nmcRate;
    @ExcelProperty("月活会员GMV贡献率2")
    private BigDecimal nmcGmvRate;
    @ExcelProperty("活动期人均月活GMV")
    private BigDecimal pcmaGmv;
    @ExcelProperty("次月人均月活GMV")
    private BigDecimal mpcmaGmv;
    @ExcelProperty("活动期人均拉新GMV")
    private BigDecimal pcnGmv;
    @ExcelProperty("次月人均拉新GMV")
    private BigDecimal panGmv;
    @ExcelProperty("月活次月留存率")
    private BigDecimal masmRate;
    @ExcelProperty("拉新次月留存率")
    private BigDecimal mrrRate;

    @ExcelProperty("次月月活会员GMV")
    private BigDecimal nextMonthActiveMemberGmv;

    @ExcelProperty("次月新增会员数")
    private Long nextMonthNewMemberCount;

    @ExcelProperty("次月新增会员GMV")
    private BigDecimal nextMonthNewMemberGmv;
}
