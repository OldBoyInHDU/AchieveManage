package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.User;
import com.nyzs.achieve.dao.UserDao;
import com.nyzs.achieve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：RukiHuang
 * @description：UserService
 * @date ：2022/9/20 8:46
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getByAccount(String account) throws Exception {
        return userDao.getByAccount(account);
    }
}
