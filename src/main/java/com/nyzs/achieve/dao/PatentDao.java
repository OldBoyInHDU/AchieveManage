package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.PatentDto;
import com.nyzs.achieve.bean.dto.VideoFileInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface PatentDao {

    List<VideoFileInfoDto> getVideoInfoByPosOrTitle(String pos, String title) throws Exception;

    void addVideoInfo(VideoFileInfoDto videoFileInfoDto) throws Exception;

    void deleteVideoInfo(Integer id) throws Exception;

    List<PatentDto> getPatent(String patentName, String inventor, String patentType, String status, String startDate, String endDate);
}
