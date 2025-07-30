package com.hy.exceltemp;

import lombok.Data;
import com.alibaba.excel.annotation.ExcelProperty;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ActivityKolGroupExcel {
    @ExcelProperty("活动名称")
    private String campaignName;

    @ExcelProperty("KOL名称")
    private String kolName;

    @ExcelProperty("帖子链接")
    private String postUrl;

    @ExcelProperty("媒体")
    private String media;

    @ExcelProperty("发帖日期")
    private Date postDate;

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

    @ExcelProperty("拉新会员数")
    private Long newMemberAcquisitionCount;

    @ExcelProperty("拉新会员GMV")
    private BigDecimal newMemberAcquisitionGmv;

    @ExcelProperty("次月月活会员数")
    private Long nextMonthActiveMemberCount;

    @ExcelProperty("次月月活会员GMV")
    private BigDecimal nextMonthActiveMemberGmv;

    @ExcelProperty("次月拉新会员数")
    private Long nextMonthNewMemberCount;

    @ExcelProperty("次月拉新会员GMV")
    private BigDecimal nextMonthNewMemberGmv;

    @ExcelProperty("CPM") //CPM=花费/曝光次数*1000
    private BigDecimal cpm;
    @ExcelProperty("月活会员ROI") //月活会员ROI=（收入-花费）/花费*100%
    private BigDecimal roi;
    @ExcelProperty("CAC") //CAC=花费/新增会员数
    private BigDecimal cac;
    @ExcelProperty("月活会员贡献率") //月活会员贡献率=月活会员数/周期月
    private BigDecimal mamcRate;
    @ExcelProperty("月活会员GMV贡献率") //月活会员GMV贡献率=月活会员GMV/周期月
    private BigDecimal mamcGmvRate;
    @ExcelProperty("拉新会员ROI") //拉新会员ROI=拉新会员GMA/花费
    private BigDecimal rnmRoi;
    @ExcelProperty("拉新会员CAC") //月活会员CAC=花费/月活会员数
    private BigDecimal rnmCac;
    @ExcelProperty("新会员贡献率") //月活会员贡献率=月活会员数/周期月活人数
    private BigDecimal nmcRate;
    @ExcelProperty("新会员GMV贡献率") //月活会员GMV贡献率=月活会员GMV/周期月活GMV
    private BigDecimal nmcGmvRate;
    @ExcelProperty("活动期人均月活GMV") //活动期人均月活GMV=月活会员GMV/月活会员数
    private BigDecimal pcmaGmv;
    @ExcelProperty("次月人均月活GMV") //次月人均月活GMV=次月月活会员GMV/次月月活会员数
    private BigDecimal mpcmaGmv;
    @ExcelProperty("活动期人均拉新GMV") //活动期人均拉新GMV=拉新会员GMV/拉新会员数
    private BigDecimal pcnGmv;
    @ExcelProperty("次月人均拉新GMV") //次月人均拉新GMV=次月拉新会员GMV/次月拉新会员数
    private BigDecimal panGmv;
    @ExcelProperty("月活次月留存率") //月活次月留存率=次月月活会员数/月活会员数
    private BigDecimal masmRate;
    @ExcelProperty("拉新次月留存率") //拉新次月留存率=次月拉新会员数/拉新会员数
    private BigDecimal mrrRate;
}
