package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User getByAccount(String account) throws Exception;
}
