package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.TrainingDto;
import com.nyzs.achieve.bean.vo.TrainingVo;

import java.util.List;

public interface PersonTrainService {
    List<TrainingDto> getTrainings(String title, String type, String author, String startDate, String endDate) throws Exception;

    void submitTrainingInfo(TrainingVo trainingVo) throws Exception;

    TrainingDto getTrainingById(Integer id) throws Exception;

    void deleteTrainingById(Integer id) throws Exception;
}
