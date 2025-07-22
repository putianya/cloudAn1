package com.hy.service.impl;

import com.hy.mapper.ActivityGroupMapper;
import com.hy.pojo.ActivityGroup;
import com.hy.service.ActivityGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ActivityGroupServiceImpl implements ActivityGroupService {


    @Autowired
    private ActivityGroupMapper activityGroupMapper;

    @Override
    public List<ActivityGroup> findActivityGroup(String cname) {
        return activityGroupMapper.findActivityGroup(cname);
    }


}
