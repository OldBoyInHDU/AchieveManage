package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.IndexTrainingDto;
import com.nyzs.achieve.bean.vo.IndexTrainingVo;

import java.util.List;

public interface IndexPersonService {
    List<IndexTrainingDto> getTrainings() throws Exception;

    IndexTrainingDto getTrainingById(Integer id) throws Exception;

    void deleteTrainingById(Integer id) throws Exception;

    void submitTrainingInfo(IndexTrainingVo indexTrainingVo) throws Exception;
}
