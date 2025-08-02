package com.hy.service;

import com.hy.pojo.TbDistributor;

import java.util.List;

public interface DissService {
    List<TbDistributor> findDissByUid(Integer uid);
}
