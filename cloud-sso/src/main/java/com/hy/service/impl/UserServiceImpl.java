package com.hy.service.impl;

import com.hy.mapper.TbUserMapper;
import com.hy.pojo.TbUser;
import com.hy.pojo.TbUserExample;
import com.hy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getUserByUsernameAndPassword(String username, String password) {
        // 创建TbUserExample对象
        TbUserExample tbUserExample = new TbUserExample();
        // 创建Criteria对象
        TbUserExample.Criteria ex = tbUserExample.createCriteria();

        // 设置查询条件，用户名和密码相等
        ex.andUsernameEqualTo(username).andPasswordEqualTo(password);

        // 根据查询条件查询TbUser对象
        List<TbUser> tbUsers = tbUserMapper.selectByExample(tbUserExample);
        // 如果查询结果不为空且结果集大于0，则返回第一个TbUser对象，否则返回null
        return tbUsers!=null && tbUsers.size()>0 ? tbUsers.get(0) : null;
    }

    @Override
    public TbUser getUserByUsername(String username) {
      TbUserExample tbUserExample = new TbUserExample();
      TbUserExample.Criteria ex = tbUserExample.createCriteria();

      ex.andUsernameEqualTo(username);

        List<TbUser> tbUsers = tbUserMapper.selectByExample(tbUserExample);

        if(tbUsers!=null && tbUsers.size()>0){
            return tbUsers.get(0);
        }
            return null;

    }
}
