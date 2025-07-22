package com.hy.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ActivityMediaSlotAnalysis {
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

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName == null ? null : campaignName.trim();
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media == null ? null : media.trim();
    }

    public String getContactPoint() {
        return contactPoint;
    }

    public void setContactPoint(String contactPoint) {
        this.contactPoint = contactPoint == null ? null : contactPoint.trim();
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId == null ? null : campaignId.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Long getExposureCount() {
        return exposureCount;
    }

    public void setExposureCount(Long exposureCount) {
        this.exposureCount = exposureCount;
    }

    public Long getExposureUserCount() {
        return exposureUserCount;
    }

    public void setExposureUserCount(Long exposureUserCount) {
        this.exposureUserCount = exposureUserCount;
    }

    public Long getClickCount() {
        return clickCount;
    }

    public void setClickCount(Long clickCount) {
        this.clickCount = clickCount;
    }

    public Long getClickUserCount() {
        return clickUserCount;
    }

    public void setClickUserCount(Long clickUserCount) {
        this.clickUserCount = clickUserCount;
    }

    public Long getMonthlyActiveMemberCount() {
        return monthlyActiveMemberCount;
    }

    public void setMonthlyActiveMemberCount(Long monthlyActiveMemberCount) {
        this.monthlyActiveMemberCount = monthlyActiveMemberCount;
    }

    public BigDecimal getMonthlyActiveMemberGmv() {
        return monthlyActiveMemberGmv;
    }

    public void setMonthlyActiveMemberGmv(BigDecimal monthlyActiveMemberGmv) {
        this.monthlyActiveMemberGmv = monthlyActiveMemberGmv;
    }

    public Long getNewMemberAcquisitionCount() {
        return newMemberAcquisitionCount;
    }

    public void setNewMemberAcquisitionCount(Long newMemberAcquisitionCount) {
        this.newMemberAcquisitionCount = newMemberAcquisitionCount;
    }

    public BigDecimal getNewMemberAcquisitionGmv() {
        return newMemberAcquisitionGmv;
    }

    public void setNewMemberAcquisitionGmv(BigDecimal newMemberAcquisitionGmv) {
        this.newMemberAcquisitionGmv = newMemberAcquisitionGmv;
    }

    public Long getNextMonthActiveMemberCount() {
        return nextMonthActiveMemberCount;
    }

    public void setNextMonthActiveMemberCount(Long nextMonthActiveMemberCount) {
        this.nextMonthActiveMemberCount = nextMonthActiveMemberCount;
    }

    public BigDecimal getNextMonthActiveMemberGmv() {
        return nextMonthActiveMemberGmv;
    }

    public void setNextMonthActiveMemberGmv(BigDecimal nextMonthActiveMemberGmv) {
        this.nextMonthActiveMemberGmv = nextMonthActiveMemberGmv;
    }

    public Long getNextMonthNewMemberCount() {
        return nextMonthNewMemberCount;
    }

    public void setNextMonthNewMemberCount(Long nextMonthNewMemberCount) {
        this.nextMonthNewMemberCount = nextMonthNewMemberCount;
    }

    public BigDecimal getNextMonthNewMemberGmv() {
        return nextMonthNewMemberGmv;
    }

    public void setNextMonthNewMemberGmv(BigDecimal nextMonthNewMemberGmv) {
        this.nextMonthNewMemberGmv = nextMonthNewMemberGmv;
    }
}