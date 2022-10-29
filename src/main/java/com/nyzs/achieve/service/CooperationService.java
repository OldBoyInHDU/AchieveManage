package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.CooperationDto;
import com.nyzs.achieve.bean.vo.CooperationVo;

import java.util.List;

public interface CooperationService {
    List<CooperationDto> getCooperations(String title, String type, String author, String startDate, String endDate) throws Exception;

    void submitCooperationInfo(CooperationVo cooperationVo) throws Exception;

    CooperationDto getCooperationById(Integer id) throws Exception;

    void deleteCooperationById(Integer id) throws Exception;
}
