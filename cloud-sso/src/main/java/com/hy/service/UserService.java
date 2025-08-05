package com.hy.service;

import com.hy.pojo.TbUser;

public interface UserService {
    TbUser getUserByUsernameAndPassword(String username, String password);

    TbUser getUserByUsername(String username);

    TbUser getUserByUid(Integer uid);

    String order();
}
