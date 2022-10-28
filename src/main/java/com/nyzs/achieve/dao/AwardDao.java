package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.AwardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AwardDao {
    void deleteAwardById(Integer id) throws Exception;


    AwardDto getAwardById(Integer id) throws Exception;

    List<AwardDto> getAwards(String type, String level, String sort, String awardee, String award, String year) throws Exception;

    void insertAwardInfo(AwardDto awardDto) throws Exception;

    void updateAwardInfo(AwardDto awardDto) throws Exception;
}
