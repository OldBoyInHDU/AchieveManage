package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.TrainingDto;
import com.nyzs.achieve.bean.vo.TrainingVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonTrainDao {
    void deleteTrainingById(Integer id) throws Exception;

    TrainingDto getTrainingById(Integer id) throws Exception;

    void insertTrainingInfo(TrainingDto trainingDto) throws Exception;

    List<TrainingDto> getTrainings(String title, String type, String author, String startDate, String endDate) throws Exception;

    void updateTrainingInfo(TrainingDto trainingDto) throws Exception;
}
