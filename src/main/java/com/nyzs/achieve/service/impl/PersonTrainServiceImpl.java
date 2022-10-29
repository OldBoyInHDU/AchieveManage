package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.TrainingDto;
import com.nyzs.achieve.bean.vo.TrainingVo;
import com.nyzs.achieve.dao.PersonTrainDao;
import com.nyzs.achieve.service.PersonTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：人才培训Service
 * @date ：2022/10/29 8:38
 */
@Service
public class PersonTrainServiceImpl implements PersonTrainService {

    @Autowired
    private PersonTrainDao personTrainDao;

    @Override
    public List<TrainingDto> getTrainings(String title, String type, String author, String startDate, String endDate) throws Exception {
        return personTrainDao.getTrainings(title, type, author, startDate, endDate);
    }

    @Override
    public void submitTrainingInfo(TrainingVo trainingVo) throws Exception {
        TrainingDto trainingDto = new TrainingDto();
        trainingDto.setTitle(trainingVo.getTitle());
        trainingDto.setType(trainingVo.getType());
        trainingDto.setAuthor(trainingVo.getAuthor());
        trainingDto.setContent(trainingVo.getContent());
        trainingDto.setStatusDate(trainingVo.getStatusDate());
        if(personTrainDao.getTrainingById(trainingVo.getId()) != null) {
            trainingDto.setId(trainingVo.getId());
            System.out.println("update:" + trainingDto);
            personTrainDao.updateTrainingInfo(trainingDto);
        } else {
            System.out.println("insert:" + trainingDto);
            personTrainDao.insertTrainingInfo(trainingDto);
        }

    }

    @Override
    public TrainingDto getTrainingById(Integer id) throws Exception {
        return personTrainDao.getTrainingById(id);
    }

    @Override
    public void deleteTrainingById(Integer id) throws Exception {
        personTrainDao.deleteTrainingById(id);
    }
}
