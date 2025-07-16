package com.hy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityAnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityAnalysisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCampaignNameIsNull() {
            addCriterion("campaign_name is null");
            return (Criteria) this;
        }

        public Criteria andCampaignNameIsNotNull() {
            addCriterion("campaign_name is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignNameEqualTo(String value) {
            addCriterion("campaign_name =", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotEqualTo(String value) {
            addCriterion("campaign_name <>", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameGreaterThan(String value) {
            addCriterion("campaign_name >", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameGreaterThanOrEqualTo(String value) {
            addCriterion("campaign_name >=", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameLessThan(String value) {
            addCriterion("campaign_name <", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameLessThanOrEqualTo(String value) {
            addCriterion("campaign_name <=", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameLike(String value) {
            addCriterion("campaign_name like", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotLike(String value) {
            addCriterion("campaign_name not like", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameIn(List<String> values) {
            addCriterion("campaign_name in", values, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotIn(List<String> values) {
            addCriterion("campaign_name not in", values, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameBetween(String value1, String value2) {
            addCriterion("campaign_name between", value1, value2, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotBetween(String value1, String value2) {
            addCriterion("campaign_name not between", value1, value2, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIsNull() {
            addCriterion("campaign_id is null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIsNotNull() {
            addCriterion("campaign_id is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdEqualTo(String value) {
            addCriterion("campaign_id =", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotEqualTo(String value) {
            addCriterion("campaign_id <>", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThan(String value) {
            addCriterion("campaign_id >", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThanOrEqualTo(String value) {
            addCriterion("campaign_id >=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThan(String value) {
            addCriterion("campaign_id <", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThanOrEqualTo(String value) {
            addCriterion("campaign_id <=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLike(String value) {
            addCriterion("campaign_id like", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotLike(String value) {
            addCriterion("campaign_id not like", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIn(List<String> values) {
            addCriterion("campaign_id in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotIn(List<String> values) {
            addCriterion("campaign_id not in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdBetween(String value1, String value2) {
            addCriterion("campaign_id between", value1, value2, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotBetween(String value1, String value2) {
            addCriterion("campaign_id not between", value1, value2, "campaignId");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andMonitorRateIsNull() {
            addCriterion("monitor_rate is null");
            return (Criteria) this;
        }

        public Criteria andMonitorRateIsNotNull() {
            addCriterion("monitor_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorRateEqualTo(BigDecimal value) {
            addCriterion("monitor_rate =", value, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andMonitorRateNotEqualTo(BigDecimal value) {
            addCriterion("monitor_rate <>", value, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andMonitorRateGreaterThan(BigDecimal value) {
            addCriterion("monitor_rate >", value, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andMonitorRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monitor_rate >=", value, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andMonitorRateLessThan(BigDecimal value) {
            addCriterion("monitor_rate <", value, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andMonitorRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monitor_rate <=", value, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andMonitorRateIn(List<BigDecimal> values) {
            addCriterion("monitor_rate in", values, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andMonitorRateNotIn(List<BigDecimal> values) {
            addCriterion("monitor_rate not in", values, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andMonitorRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monitor_rate between", value1, value2, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andMonitorRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monitor_rate not between", value1, value2, "monitorRate");
            return (Criteria) this;
        }

        public Criteria andExposureCountIsNull() {
            addCriterion("exposure_count is null");
            return (Criteria) this;
        }

        public Criteria andExposureCountIsNotNull() {
            addCriterion("exposure_count is not null");
            return (Criteria) this;
        }

        public Criteria andExposureCountEqualTo(Long value) {
            addCriterion("exposure_count =", value, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureCountNotEqualTo(Long value) {
            addCriterion("exposure_count <>", value, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureCountGreaterThan(Long value) {
            addCriterion("exposure_count >", value, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureCountGreaterThanOrEqualTo(Long value) {
            addCriterion("exposure_count >=", value, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureCountLessThan(Long value) {
            addCriterion("exposure_count <", value, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureCountLessThanOrEqualTo(Long value) {
            addCriterion("exposure_count <=", value, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureCountIn(List<Long> values) {
            addCriterion("exposure_count in", values, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureCountNotIn(List<Long> values) {
            addCriterion("exposure_count not in", values, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureCountBetween(Long value1, Long value2) {
            addCriterion("exposure_count between", value1, value2, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureCountNotBetween(Long value1, Long value2) {
            addCriterion("exposure_count not between", value1, value2, "exposureCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountIsNull() {
            addCriterion("exposure_user_count is null");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountIsNotNull() {
            addCriterion("exposure_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountEqualTo(Long value) {
            addCriterion("exposure_user_count =", value, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountNotEqualTo(Long value) {
            addCriterion("exposure_user_count <>", value, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountGreaterThan(Long value) {
            addCriterion("exposure_user_count >", value, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountGreaterThanOrEqualTo(Long value) {
            addCriterion("exposure_user_count >=", value, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountLessThan(Long value) {
            addCriterion("exposure_user_count <", value, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountLessThanOrEqualTo(Long value) {
            addCriterion("exposure_user_count <=", value, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountIn(List<Long> values) {
            addCriterion("exposure_user_count in", values, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountNotIn(List<Long> values) {
            addCriterion("exposure_user_count not in", values, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountBetween(Long value1, Long value2) {
            addCriterion("exposure_user_count between", value1, value2, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andExposureUserCountNotBetween(Long value1, Long value2) {
            addCriterion("exposure_user_count not between", value1, value2, "exposureUserCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNull() {
            addCriterion("click_count is null");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNotNull() {
            addCriterion("click_count is not null");
            return (Criteria) this;
        }

        public Criteria andClickCountEqualTo(Long value) {
            addCriterion("click_count =", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotEqualTo(Long value) {
            addCriterion("click_count <>", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThan(Long value) {
            addCriterion("click_count >", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThanOrEqualTo(Long value) {
            addCriterion("click_count >=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThan(Long value) {
            addCriterion("click_count <", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThanOrEqualTo(Long value) {
            addCriterion("click_count <=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIn(List<Long> values) {
            addCriterion("click_count in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotIn(List<Long> values) {
            addCriterion("click_count not in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountBetween(Long value1, Long value2) {
            addCriterion("click_count between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotBetween(Long value1, Long value2) {
            addCriterion("click_count not between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountIsNull() {
            addCriterion("click_user_count is null");
            return (Criteria) this;
        }

        public Criteria andClickUserCountIsNotNull() {
            addCriterion("click_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andClickUserCountEqualTo(Long value) {
            addCriterion("click_user_count =", value, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountNotEqualTo(Long value) {
            addCriterion("click_user_count <>", value, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountGreaterThan(Long value) {
            addCriterion("click_user_count >", value, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountGreaterThanOrEqualTo(Long value) {
            addCriterion("click_user_count >=", value, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountLessThan(Long value) {
            addCriterion("click_user_count <", value, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountLessThanOrEqualTo(Long value) {
            addCriterion("click_user_count <=", value, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountIn(List<Long> values) {
            addCriterion("click_user_count in", values, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountNotIn(List<Long> values) {
            addCriterion("click_user_count not in", values, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountBetween(Long value1, Long value2) {
            addCriterion("click_user_count between", value1, value2, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andClickUserCountNotBetween(Long value1, Long value2) {
            addCriterion("click_user_count not between", value1, value2, "clickUserCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountIsNull() {
            addCriterion("monthly_active_member_count is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountIsNotNull() {
            addCriterion("monthly_active_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountEqualTo(Long value) {
            addCriterion("monthly_active_member_count =", value, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountNotEqualTo(Long value) {
            addCriterion("monthly_active_member_count <>", value, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountGreaterThan(Long value) {
            addCriterion("monthly_active_member_count >", value, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountGreaterThanOrEqualTo(Long value) {
            addCriterion("monthly_active_member_count >=", value, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountLessThan(Long value) {
            addCriterion("monthly_active_member_count <", value, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountLessThanOrEqualTo(Long value) {
            addCriterion("monthly_active_member_count <=", value, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountIn(List<Long> values) {
            addCriterion("monthly_active_member_count in", values, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountNotIn(List<Long> values) {
            addCriterion("monthly_active_member_count not in", values, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountBetween(Long value1, Long value2) {
            addCriterion("monthly_active_member_count between", value1, value2, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberCountNotBetween(Long value1, Long value2) {
            addCriterion("monthly_active_member_count not between", value1, value2, "monthlyActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvIsNull() {
            addCriterion("monthly_active_member_gmv is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvIsNotNull() {
            addCriterion("monthly_active_member_gmv is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvEqualTo(BigDecimal value) {
            addCriterion("monthly_active_member_gmv =", value, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvNotEqualTo(BigDecimal value) {
            addCriterion("monthly_active_member_gmv <>", value, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvGreaterThan(BigDecimal value) {
            addCriterion("monthly_active_member_gmv >", value, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_active_member_gmv >=", value, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvLessThan(BigDecimal value) {
            addCriterion("monthly_active_member_gmv <", value, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_active_member_gmv <=", value, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvIn(List<BigDecimal> values) {
            addCriterion("monthly_active_member_gmv in", values, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvNotIn(List<BigDecimal> values) {
            addCriterion("monthly_active_member_gmv not in", values, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_active_member_gmv between", value1, value2, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andMonthlyActiveMemberGmvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_active_member_gmv not between", value1, value2, "monthlyActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountIsNull() {
            addCriterion("new_member_acquisition_count is null");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountIsNotNull() {
            addCriterion("new_member_acquisition_count is not null");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountEqualTo(Long value) {
            addCriterion("new_member_acquisition_count =", value, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountNotEqualTo(Long value) {
            addCriterion("new_member_acquisition_count <>", value, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountGreaterThan(Long value) {
            addCriterion("new_member_acquisition_count >", value, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountGreaterThanOrEqualTo(Long value) {
            addCriterion("new_member_acquisition_count >=", value, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountLessThan(Long value) {
            addCriterion("new_member_acquisition_count <", value, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountLessThanOrEqualTo(Long value) {
            addCriterion("new_member_acquisition_count <=", value, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountIn(List<Long> values) {
            addCriterion("new_member_acquisition_count in", values, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountNotIn(List<Long> values) {
            addCriterion("new_member_acquisition_count not in", values, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountBetween(Long value1, Long value2) {
            addCriterion("new_member_acquisition_count between", value1, value2, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionCountNotBetween(Long value1, Long value2) {
            addCriterion("new_member_acquisition_count not between", value1, value2, "newMemberAcquisitionCount");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvIsNull() {
            addCriterion("new_member_acquisition_gmv is null");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvIsNotNull() {
            addCriterion("new_member_acquisition_gmv is not null");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvEqualTo(BigDecimal value) {
            addCriterion("new_member_acquisition_gmv =", value, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvNotEqualTo(BigDecimal value) {
            addCriterion("new_member_acquisition_gmv <>", value, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvGreaterThan(BigDecimal value) {
            addCriterion("new_member_acquisition_gmv >", value, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_member_acquisition_gmv >=", value, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvLessThan(BigDecimal value) {
            addCriterion("new_member_acquisition_gmv <", value, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_member_acquisition_gmv <=", value, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvIn(List<BigDecimal> values) {
            addCriterion("new_member_acquisition_gmv in", values, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvNotIn(List<BigDecimal> values) {
            addCriterion("new_member_acquisition_gmv not in", values, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_member_acquisition_gmv between", value1, value2, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andNewMemberAcquisitionGmvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_member_acquisition_gmv not between", value1, value2, "newMemberAcquisitionGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountIsNull() {
            addCriterion("periodic_monthly_active_user_count is null");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountIsNotNull() {
            addCriterion("periodic_monthly_active_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountEqualTo(Long value) {
            addCriterion("periodic_monthly_active_user_count =", value, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountNotEqualTo(Long value) {
            addCriterion("periodic_monthly_active_user_count <>", value, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountGreaterThan(Long value) {
            addCriterion("periodic_monthly_active_user_count >", value, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountGreaterThanOrEqualTo(Long value) {
            addCriterion("periodic_monthly_active_user_count >=", value, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountLessThan(Long value) {
            addCriterion("periodic_monthly_active_user_count <", value, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountLessThanOrEqualTo(Long value) {
            addCriterion("periodic_monthly_active_user_count <=", value, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountIn(List<Long> values) {
            addCriterion("periodic_monthly_active_user_count in", values, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountNotIn(List<Long> values) {
            addCriterion("periodic_monthly_active_user_count not in", values, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountBetween(Long value1, Long value2) {
            addCriterion("periodic_monthly_active_user_count between", value1, value2, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserCountNotBetween(Long value1, Long value2) {
            addCriterion("periodic_monthly_active_user_count not between", value1, value2, "periodicMonthlyActiveUserCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvIsNull() {
            addCriterion("periodic_monthly_active_user_gmv is null");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvIsNotNull() {
            addCriterion("periodic_monthly_active_user_gmv is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvEqualTo(BigDecimal value) {
            addCriterion("periodic_monthly_active_user_gmv =", value, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvNotEqualTo(BigDecimal value) {
            addCriterion("periodic_monthly_active_user_gmv <>", value, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvGreaterThan(BigDecimal value) {
            addCriterion("periodic_monthly_active_user_gmv >", value, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("periodic_monthly_active_user_gmv >=", value, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvLessThan(BigDecimal value) {
            addCriterion("periodic_monthly_active_user_gmv <", value, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("periodic_monthly_active_user_gmv <=", value, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvIn(List<BigDecimal> values) {
            addCriterion("periodic_monthly_active_user_gmv in", values, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvNotIn(List<BigDecimal> values) {
            addCriterion("periodic_monthly_active_user_gmv not in", values, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("periodic_monthly_active_user_gmv between", value1, value2, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicMonthlyActiveUserGmvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("periodic_monthly_active_user_gmv not between", value1, value2, "periodicMonthlyActiveUserGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountIsNull() {
            addCriterion("periodic_new_member_count is null");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountIsNotNull() {
            addCriterion("periodic_new_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountEqualTo(Long value) {
            addCriterion("periodic_new_member_count =", value, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountNotEqualTo(Long value) {
            addCriterion("periodic_new_member_count <>", value, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountGreaterThan(Long value) {
            addCriterion("periodic_new_member_count >", value, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountGreaterThanOrEqualTo(Long value) {
            addCriterion("periodic_new_member_count >=", value, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountLessThan(Long value) {
            addCriterion("periodic_new_member_count <", value, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountLessThanOrEqualTo(Long value) {
            addCriterion("periodic_new_member_count <=", value, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountIn(List<Long> values) {
            addCriterion("periodic_new_member_count in", values, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountNotIn(List<Long> values) {
            addCriterion("periodic_new_member_count not in", values, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountBetween(Long value1, Long value2) {
            addCriterion("periodic_new_member_count between", value1, value2, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberCountNotBetween(Long value1, Long value2) {
            addCriterion("periodic_new_member_count not between", value1, value2, "periodicNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvIsNull() {
            addCriterion("periodic_new_member_gmv is null");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvIsNotNull() {
            addCriterion("periodic_new_member_gmv is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvEqualTo(BigDecimal value) {
            addCriterion("periodic_new_member_gmv =", value, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvNotEqualTo(BigDecimal value) {
            addCriterion("periodic_new_member_gmv <>", value, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvGreaterThan(BigDecimal value) {
            addCriterion("periodic_new_member_gmv >", value, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("periodic_new_member_gmv >=", value, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvLessThan(BigDecimal value) {
            addCriterion("periodic_new_member_gmv <", value, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("periodic_new_member_gmv <=", value, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvIn(List<BigDecimal> values) {
            addCriterion("periodic_new_member_gmv in", values, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvNotIn(List<BigDecimal> values) {
            addCriterion("periodic_new_member_gmv not in", values, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("periodic_new_member_gmv between", value1, value2, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andPeriodicNewMemberGmvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("periodic_new_member_gmv not between", value1, value2, "periodicNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountIsNull() {
            addCriterion("next_month_active_member_count is null");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountIsNotNull() {
            addCriterion("next_month_active_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountEqualTo(Long value) {
            addCriterion("next_month_active_member_count =", value, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountNotEqualTo(Long value) {
            addCriterion("next_month_active_member_count <>", value, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountGreaterThan(Long value) {
            addCriterion("next_month_active_member_count >", value, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountGreaterThanOrEqualTo(Long value) {
            addCriterion("next_month_active_member_count >=", value, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountLessThan(Long value) {
            addCriterion("next_month_active_member_count <", value, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountLessThanOrEqualTo(Long value) {
            addCriterion("next_month_active_member_count <=", value, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountIn(List<Long> values) {
            addCriterion("next_month_active_member_count in", values, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountNotIn(List<Long> values) {
            addCriterion("next_month_active_member_count not in", values, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountBetween(Long value1, Long value2) {
            addCriterion("next_month_active_member_count between", value1, value2, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberCountNotBetween(Long value1, Long value2) {
            addCriterion("next_month_active_member_count not between", value1, value2, "nextMonthActiveMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvIsNull() {
            addCriterion("next_month_active_member_gmv is null");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvIsNotNull() {
            addCriterion("next_month_active_member_gmv is not null");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvEqualTo(BigDecimal value) {
            addCriterion("next_month_active_member_gmv =", value, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvNotEqualTo(BigDecimal value) {
            addCriterion("next_month_active_member_gmv <>", value, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvGreaterThan(BigDecimal value) {
            addCriterion("next_month_active_member_gmv >", value, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("next_month_active_member_gmv >=", value, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvLessThan(BigDecimal value) {
            addCriterion("next_month_active_member_gmv <", value, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("next_month_active_member_gmv <=", value, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvIn(List<BigDecimal> values) {
            addCriterion("next_month_active_member_gmv in", values, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvNotIn(List<BigDecimal> values) {
            addCriterion("next_month_active_member_gmv not in", values, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("next_month_active_member_gmv between", value1, value2, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthActiveMemberGmvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("next_month_active_member_gmv not between", value1, value2, "nextMonthActiveMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountIsNull() {
            addCriterion("next_month_new_member_count is null");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountIsNotNull() {
            addCriterion("next_month_new_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountEqualTo(Long value) {
            addCriterion("next_month_new_member_count =", value, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountNotEqualTo(Long value) {
            addCriterion("next_month_new_member_count <>", value, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountGreaterThan(Long value) {
            addCriterion("next_month_new_member_count >", value, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountGreaterThanOrEqualTo(Long value) {
            addCriterion("next_month_new_member_count >=", value, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountLessThan(Long value) {
            addCriterion("next_month_new_member_count <", value, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountLessThanOrEqualTo(Long value) {
            addCriterion("next_month_new_member_count <=", value, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountIn(List<Long> values) {
            addCriterion("next_month_new_member_count in", values, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountNotIn(List<Long> values) {
            addCriterion("next_month_new_member_count not in", values, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountBetween(Long value1, Long value2) {
            addCriterion("next_month_new_member_count between", value1, value2, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberCountNotBetween(Long value1, Long value2) {
            addCriterion("next_month_new_member_count not between", value1, value2, "nextMonthNewMemberCount");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvIsNull() {
            addCriterion("next_month_new_member_gmv is null");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvIsNotNull() {
            addCriterion("next_month_new_member_gmv is not null");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvEqualTo(BigDecimal value) {
            addCriterion("next_month_new_member_gmv =", value, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvNotEqualTo(BigDecimal value) {
            addCriterion("next_month_new_member_gmv <>", value, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvGreaterThan(BigDecimal value) {
            addCriterion("next_month_new_member_gmv >", value, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("next_month_new_member_gmv >=", value, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvLessThan(BigDecimal value) {
            addCriterion("next_month_new_member_gmv <", value, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("next_month_new_member_gmv <=", value, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvIn(List<BigDecimal> values) {
            addCriterion("next_month_new_member_gmv in", values, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvNotIn(List<BigDecimal> values) {
            addCriterion("next_month_new_member_gmv not in", values, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("next_month_new_member_gmv between", value1, value2, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andNextMonthNewMemberGmvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("next_month_new_member_gmv not between", value1, value2, "nextMonthNewMemberGmv");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(String value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(String value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(String value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(String value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLike(String value) {
            addCriterion("activity_type like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotLike(String value) {
            addCriterion("activity_type not like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<String> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<String> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(String value1, String value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(String value1, String value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}