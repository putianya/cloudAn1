package com.hy.service.impl;

import com.hy.mapper.TbDistributorMapper;
import com.hy.pojo.TbDistributor;
import com.hy.pojo.TbDistributorExample;
import com.hy.service.DissService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DissServiceImpl implements DissService {
    @Autowired
    private TbDistributorMapper tbDistributorMapper;

    @Override
    public List<TbDistributor> findDissByUid(Integer uid) {
        TbDistributorExample tbDistributorExample = new TbDistributorExample();
        TbDistributorExample.Criteria ex = tbDistributorExample.createCriteria();

        ex.andUserIdEqualTo(uid);

        List<TbDistributor> tbDistributors = tbDistributorMapper.selectByExample(tbDistributorExample);
        return tbDistributors;
    }
}
