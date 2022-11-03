package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.IndexTechDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexTechDao {
    List<IndexTechDto> getTechs() throws Exception;

    IndexTechDto getTechById(Integer id) throws Exception;

    void deleteTechById(Integer id) throws Exception;

    void updateTechInfo(IndexTechDto indexTechDto) throws Exception;

    void insertTechInfo(IndexTechDto indexTechDto) throws Exception;
}
