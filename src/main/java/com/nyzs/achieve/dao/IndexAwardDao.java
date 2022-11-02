package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.IndexAwardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexAwardDao {
    IndexAwardDto getAwardById(Integer id) throws Exception;

    List<IndexAwardDto> getAwards() throws Exception;

    void deleteAwardById(Integer id) throws Exception;

    void updateAwardInfo(IndexAwardDto indexAwardDto) throws Exception;

    void insertAwardInfo(IndexAwardDto indexAwardDto) throws Exception;
}
