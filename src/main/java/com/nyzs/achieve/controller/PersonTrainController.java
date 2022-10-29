package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.AwardDto;
import com.nyzs.achieve.bean.dto.TrainingDto;
import com.nyzs.achieve.bean.vo.AwardVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.bean.vo.TrainingVo;
import com.nyzs.achieve.service.PersonTrainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description: 人才培训 相关
 * @date ：2022/10/29 8:29
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/personTrain")
@RestController
public class PersonTrainController {
    private static Logger logger = LoggerFactory.getLogger(PersonTrainController.class);

    @Autowired
    private PersonTrainService personTrainService;

    @RequestMapping(value = "/getTrainings", method = RequestMethod.GET)
    public ResponseResult getTrainings(String title, String type, String author, String startDate, String endDate) {
        try {
            List<TrainingDto> trainingDtoList = personTrainService.getTrainings(title, type, author, startDate, endDate);
            System.out.println(trainingDtoList);
            return ResponseResult.ok(trainingDtoList, "培训查询成功");
        } catch (Exception e) {
            logger.error("培训查询错误", e);
            return ResponseResult.failed(e.getMessage(), "培训查询失败");
        }
    }

    @RequestMapping(value = "/submitTrainingInfo", method = RequestMethod.POST)
    public ResponseResult submitTrainingInfo(
            TrainingVo trainingVo
    ) {
        try {
//            System.out.println("qiVo:" + qiVo);
            personTrainService.submitTrainingInfo(trainingVo);
            return ResponseResult.ok("培训登记成功");
        } catch (Exception e) {
            logger.error("培训提交错误", e);
            return ResponseResult.failed(e.getMessage(), "培训登记失败");
        }
    }

    @RequestMapping(value = "/getTrainingById", method = RequestMethod.GET)
    public ResponseResult getTrainingById(Integer id) {
        try {
            TrainingDto trainingDto = personTrainService.getTrainingById(id);
            return ResponseResult.ok(trainingDto, "培训查询成功");
        } catch (Exception e) {
            logger.error("培训查询错误", e);
            return ResponseResult.failed(e.getMessage(), "培训查询失败");
        }
    }

    @RequestMapping(value = "/deleteTrainingById", method = RequestMethod.DELETE)
    public ResponseResult deleteTrainingById(Integer id) {
        try {
            personTrainService.deleteTrainingById(id);
        } catch (Exception e) {
            logger.error("培训删除错误", e);
            return ResponseResult.failed(e.getMessage(), "培训删除失败");
        }
        return ResponseResult.ok("培训删除成功");
    }
}
