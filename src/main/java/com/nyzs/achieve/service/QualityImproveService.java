package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.QIDocDto;
import com.nyzs.achieve.bean.dto.QIDto;
import com.nyzs.achieve.bean.vo.QIVo;

import java.util.List;

public interface QualityImproveService {
    List<QIDto> getQualityImprove(String project, String sort, String type, String status, String leader, String member, String year) throws Exception;

    QIDto getQIByName(String project) throws Exception;

    void submitQIInfo(QIVo qiVo) throws Exception;

    void deleteQIById(Integer id) throws Exception;

    QIDto getQIById(Integer id) throws Exception;

    List<QIDocDto> getQIDocByProject(String project) throws Exception;
}
