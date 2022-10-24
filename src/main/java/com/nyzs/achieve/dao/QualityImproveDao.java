package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.QIDocDto;
import com.nyzs.achieve.bean.dto.QIDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QualityImproveDao {
    List<QIDto> getQualityImprove(String project, String sort, String type, String status, String leader, String member, String year) throws Exception;

    QIDto getQIByName(String project) throws Exception;

    void deleteQIById(Integer id) throws Exception;

    void insertQIInfo(QIDto qiDto) throws Exception;

    void insertQIDocInfo(QIDocDto qiDocDto) throws Exception;

    QIDto getQIById(Integer id) throws Exception;

    List<QIDocDto> getQIDocByProject(String project) throws Exception;

    void updateQIInfo(QIDto qiDto) throws Exception;
}
