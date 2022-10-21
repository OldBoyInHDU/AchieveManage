package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.RightDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RightDao {
    List<RightDto> getRight(String rightName, String author, String status, String project, String startDate, String endDate) throws Exception;

    RightDto getRightById(Integer id) throws Exception;

    void updateRightInfo(RightDto rightDto) throws Exception;

    void insertRightInfo(RightDto rightDto) throws Exception;

    void deleteRightById(Integer id) throws Exception;

    RightDto getRightByName(String rightName) throws Exception;
}
