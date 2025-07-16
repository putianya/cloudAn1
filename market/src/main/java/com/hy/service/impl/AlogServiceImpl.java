package com.hy.service.impl;

import com.hy.mapper.ActivityAnalysisMapper;
import com.hy.pojo.Alog;
import com.hy.service.AlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlogServiceImpl implements AlogService {

    @Autowired
    ActivityAnalysisMapper activityAnalysisMapper;
    @Override
    public Alog getAlog(String cid) {
        return activityAnalysisMapper.getAlog(cid);
    }
}
