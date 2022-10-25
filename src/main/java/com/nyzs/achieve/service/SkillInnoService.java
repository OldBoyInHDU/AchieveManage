package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.QIDocDto;
import com.nyzs.achieve.bean.dto.QIDto;
import com.nyzs.achieve.bean.dto.SIDocDto;
import com.nyzs.achieve.bean.dto.SIDto;
import com.nyzs.achieve.bean.vo.QIVo;
import com.nyzs.achieve.bean.vo.SIVo;

import java.util.List;

public interface SkillInnoService {
    List<SIDto> getSkillInno(String project, String type, String status, String leader, String member, String year) throws Exception;

    SIDto getSIByName(String project) throws Exception;

    void submitSIInfo(SIVo siVo) throws Exception;

    void deleteSIById(Integer id) throws Exception;

    SIDto getSIById(Integer id) throws Exception;

    List<SIDocDto> getSIDocByProject(String project) throws Exception;

    void deleteSIAndDoc(Integer id, String project) throws Exception;
}
