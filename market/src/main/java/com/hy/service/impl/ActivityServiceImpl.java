package com.hy.service.impl;

import com.hy.mapper.ActivityAnalysisMapper;
import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.Alog;
import com.hy.service.ActivityService;
import com.hy.service.AlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityAnalysisMapper activityAnalysisMapper;

    @Autowired
    private AlogService alogService;
    @Override
    public List<ActivityAnalysis> findActivity() {
        return activityAnalysisMapper.selectByExample(null);
    }

    @Override
    public List<ActivityAnalysis> findNewAnList() {
        return activityAnalysisMapper.findNewAnList();
    }

    @Override
    public ActivityAnalysis findAllAN(String cid) {
        //查询当前活动的基本指标
        ActivityAnalysis ac=activityAnalysisMapper.selectAnByCid(cid);
        //查询当前活动的算法指标
        Alog alog = alogService.getAlog(cid);
        ac.setAlog(alog);
        return ac;


    }
}
