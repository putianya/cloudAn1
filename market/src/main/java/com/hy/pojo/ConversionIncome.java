package com.hy.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ConversionIncome {

    @ExcelProperty("总花费")
    private BigDecimal cost;
    @ExcelProperty("曝光次数")
    private long exposureCount;
    @ExcelProperty("曝光人数")
    private long exposureUserCount;
    @ExcelProperty("月活会员数")
    private long monthlyActiveMemberCount;
    @ExcelProperty("拉新会员数")
    private long newMemberAcquisitionCount;

    @ExcelProperty("曝光月活转换率")
    private BigDecimal emacRate;
    @ExcelProperty("曝光拉新转换率")
    private BigDecimal etnccRate;


    //均值
    @ExcelProperty("曝光月活转换率均值")
    private BigDecimal emacRateAvg;
    @ExcelProperty("曝光拉新转换率均值")
    private BigDecimal etnccRateAvg;

    //差值
    @ExcelProperty("曝光月活转换率差值")
    private BigDecimal emacRateDiff;
    @ExcelProperty("曝光拉新转换率差值")
    private BigDecimal etnccRateDiff;
}
