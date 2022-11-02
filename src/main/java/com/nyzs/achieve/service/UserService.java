package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.User;

public interface UserService {

    User getByAccount(String account) throws Exception;
}
