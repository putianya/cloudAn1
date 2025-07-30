package com.hy.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class ActivityAnalysis {
    private String campaignName;

    private String campaignId;

    private Date startDate;

    private Date endDate;

    private BigDecimal cost;

    private BigDecimal monitorRate;

    private Long exposureCount;

    private Long exposureUserCount;

    private Long clickCount;

    private Long clickUserCount;

    private Long monthlyActiveMemberCount;

    private BigDecimal monthlyActiveMemberGmv;

    private Long newMemberAcquisitionCount;

    private BigDecimal newMemberAcquisitionGmv;

    private Long periodicMonthlyActiveUserCount;

    private BigDecimal periodicMonthlyActiveUserGmv;

    private Long periodicNewMemberCount;

    private BigDecimal periodicNewMemberGmv;

    private Long nextMonthActiveMemberCount;

    private BigDecimal nextMonthActiveMemberGmv;

    private Long nextMonthNewMemberCount;

    private BigDecimal nextMonthNewMemberGmv;

    private String activityType;

    //存放算法指标
    private Alog alog;

    //存放的指标差值
    private AlogDiff alogDiff;

    private  BigDecimal cpm;

}