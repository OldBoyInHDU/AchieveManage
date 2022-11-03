package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.IndexCoopeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexCoopeDao {
    List<IndexCoopeDto> getCoopes() throws Exception;

    IndexCoopeDto getCoopeById(Integer id) throws Exception;

    void deleteCoopeById(Integer id) throws Exception;

    void updateCoopeInfo(IndexCoopeDto indexCoopeDto) throws Exception;

    void insertCoopeInfo(IndexCoopeDto indexCoopeDto) throws Exception;
}
