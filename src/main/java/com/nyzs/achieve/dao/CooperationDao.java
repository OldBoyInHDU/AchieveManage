package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.CooperationDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CooperationDao {
    void deleteCooperationById(Integer id) throws Exception;

    CooperationDto getCooperationById(Integer id) throws Exception;

    void updateCooperationInfo(CooperationDto cooperationDto) throws Exception;

    void insertCooperationInfo(CooperationDto cooperationDto) throws Exception;

    List<CooperationDto> getCooperations(String title, String type, String author, String startDate, String endDate) throws Exception;
}
