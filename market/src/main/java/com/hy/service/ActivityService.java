package com.hy.service;

import com.hy.pojo.ActivityAnalysis;

import java.util.List;

public interface ActivityService {
    List<ActivityAnalysis> findActivity();

    List<ActivityAnalysis> findNewAnList();


    ActivityAnalysis findAllAN(String cid);

}
