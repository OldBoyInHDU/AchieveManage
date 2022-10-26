package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.TPDocDto;
import com.nyzs.achieve.bean.dto.TPDto;
import com.nyzs.achieve.bean.vo.TPVo;

import java.util.List;

public interface TechProjectService {
    List<TPDto> getTechProject(String project, String type, String status, String leader, String member, String date) throws Exception;

    TPDto getTPByName(String project) throws Exception;

    TPDto getTPById(Integer id) throws Exception;

    List<TPDocDto> getTPDocByProject(String project) throws Exception;

    void submitTPInfo(TPVo tpVo) throws Exception;

    void deleteTPAndDoc(Integer id, String project) throws Exception;
}
