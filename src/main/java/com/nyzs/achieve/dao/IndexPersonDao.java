package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.IndexTrainingDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexPersonDao {
    List<IndexTrainingDto> getTrainings() throws Exception;

    IndexTrainingDto getTrainingById(Integer id) throws Exception;

    void deleteTrainingById(Integer id) throws Exception;

    void updateTrainingInfo(IndexTrainingDto indexTrainingDto) throws Exception;

    void insertTrainingInfo(IndexTrainingDto indexTrainingDto) throws Exception;
}
