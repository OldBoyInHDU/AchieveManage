package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.PatentDto;
import com.nyzs.achieve.bean.dto.VideoFileInfoDto;
import jdk.internal.org.objectweb.asm.tree.analysis.SourceValue;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface PatentDao {

    List<PatentDto> getPatent(String patentName, String inventor, String patentType, String status, String project, String startDate, String endDate);

    void insertPatentInfo(PatentDto patentDto) throws Exception;

    PatentDto getPatentByName(String patentName) throws Exception;

    void updatePatentInfo(PatentDto patentDto) throws Exception;

    void deletePatentById(Integer id) throws Exception;
}
