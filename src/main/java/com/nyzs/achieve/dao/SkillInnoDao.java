package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.QIDocDto;
import com.nyzs.achieve.bean.dto.QIDto;
import com.nyzs.achieve.bean.dto.SIDocDto;
import com.nyzs.achieve.bean.dto.SIDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkillInnoDao {
    List<SIDto> getSkillInno(String project, String type, String status, String leader, String member, String year) throws Exception;

    SIDto getSIByName(String project) throws Exception;

    void deleteSIById(Integer id) throws Exception;

    void insertSIInfo(SIDto siDto) throws Exception;

    void insertSIDocInfo(SIDocDto siDocDto) throws Exception;

    SIDto getSIById(Integer id) throws Exception;

    List<SIDocDto> getSIDocByProject(String project) throws Exception;

    void updateSIInfo(SIDto siDto) throws Exception;

    void deleteSIDocByProject(String project) throws Exception;
}
