package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.RightDto;
import com.nyzs.achieve.bean.vo.RightVo;

import java.util.List;

public interface RightService {
    List<RightDto> getRight(String rightName, String author, String status, String project, String startDate, String endDate) throws Exception;

    RightDto getRightById(Integer id) throws Exception;

    void insertRightInfo(RightVo rightVo) throws Exception;

    void deleteRightById(Integer id) throws Exception;
}
