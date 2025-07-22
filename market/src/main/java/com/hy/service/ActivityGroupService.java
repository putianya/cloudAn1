package com.hy.service;

import com.hy.pojo.ActivityGroup;

import java.util.List;

public interface ActivityGroupService {

    List<ActivityGroup> findActivityGroup(String cname);
}
