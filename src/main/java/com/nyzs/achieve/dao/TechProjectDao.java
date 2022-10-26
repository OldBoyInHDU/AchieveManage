package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.TPDocDto;
import com.nyzs.achieve.bean.dto.TPDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TechProjectDao {
    List<TPDto> getTechProject(String project, String type, String status, String leader, String member, String date) throws Exception;

    TPDto getTPByName(String project) throws Exception;

    TPDto getTPById(Integer id) throws Exception;

    List<TPDocDto> getTPDocByProject(String project) throws Exception;

    void deleteTPById(Integer id) throws Exception;

    void deleteTPDocByProject(String project) throws Exception;

    void updateTPInfo(TPDto tpDto) throws Exception;

    void insertTPInfo(TPDto tpDto) throws Exception;

    void insertTPDocInfo(TPDocDto tpDocDto) throws Exception;
}
