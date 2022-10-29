package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.CooperationDto;
import com.nyzs.achieve.bean.dto.TrainingDto;
import com.nyzs.achieve.bean.vo.CooperationVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.bean.vo.TrainingVo;
import com.nyzs.achieve.service.CooperationService;
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
 * @description：合作交流 相关
 * @date ：2022/10/29 12:03
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/cooperation")
@RestController
public class CooperationController {
    private static Logger logger = LoggerFactory.getLogger(CooperationController.class);

    @Autowired
    private CooperationService cooperationService;

    @RequestMapping(value = "/getCooperations", method = RequestMethod.GET)
    public ResponseResult getCooperations(String title, String type, String author, String startDate, String endDate) {
        try {
            List<CooperationDto> cooperationDtoList = cooperationService.getCooperations(title, type, author, startDate, endDate);
            System.out.println(cooperationDtoList);
            return ResponseResult.ok(cooperationDtoList, "交流查询成功");
        } catch (Exception e) {
            logger.error("交流查询错误", e);
            return ResponseResult.failed(e.getMessage(), "交流查询失败");
        }
    }

    @RequestMapping(value = "/submitCooperationInfo", method = RequestMethod.POST)
    public ResponseResult submitCooperationInfo(
            CooperationVo cooperationVo
    ) {
        try {
            cooperationService.submitCooperationInfo(cooperationVo);
            return ResponseResult.ok("交流登记成功");
        } catch (Exception e) {
            logger.error("交流提交错误", e);
            return ResponseResult.failed(e.getMessage(), "交流登记失败");
        }
    }

    @RequestMapping(value = "/getCooperationById", method = RequestMethod.GET)
    public ResponseResult getCooperationById(Integer id) {
        try {
            CooperationDto cooperationDto = cooperationService.getCooperationById(id);
            return ResponseResult.ok(cooperationDto, "交流查询成功");
        } catch (Exception e) {
            logger.error("交流查询错误", e);
            return ResponseResult.failed(e.getMessage(), "交流查询失败");
        }
    }

    @RequestMapping(value = "/deleteCooperationById", method = RequestMethod.DELETE)
    public ResponseResult deleteCooperationById(Integer id) {
        try {
            cooperationService.deleteCooperationById(id);
        } catch (Exception e) {
            logger.error("交流删除错误", e);
            return ResponseResult.failed(e.getMessage(), "交流删除失败");
        }
        return ResponseResult.ok("交流删除成功");
    }
}
