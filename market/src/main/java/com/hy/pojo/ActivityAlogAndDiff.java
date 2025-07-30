package com.hy.pojo;

import lombok.Data;

@Data
public class ActivityAlogAndDiff {

    private ActivityAnalysis activityAnalysisA; // 活动分析对象
    private ActivityAnalysis activityAnalysisB; // 活动分析对象
    private AlogDiff alogDiff; // 活动分析差异对象
}
