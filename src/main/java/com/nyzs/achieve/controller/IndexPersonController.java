package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.IndexCoopeDto;
import com.nyzs.achieve.bean.dto.IndexTrainingDto;
import com.nyzs.achieve.bean.vo.IndexCoopeVo;
import com.nyzs.achieve.bean.vo.IndexTrainingVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.IndexPersonService;
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
 * @description：人才培养
 * @date ：2022/11/3 12:32
 */

@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/index")
@RestController
public class IndexPersonController {

    private static Logger logger = LoggerFactory.getLogger(IndexPersonController.class);

    @Autowired
    private IndexPersonService indexPersonService;

    @RequestMapping(value = "/getTrainings", method = RequestMethod.GET)
    public ResponseResult getTrainings() {
        try {
            List<IndexTrainingDto> indexTrainingDtoList = indexPersonService.getTrainings();
            System.out.println(indexTrainingDtoList);
            return ResponseResult.ok(indexTrainingDtoList, "人才培养查询成功");
        } catch (Exception e) {
            logger.error("人才培养查询错误", e);
            return ResponseResult.failed(e.getMessage(), "人才培养查询失败");
        }
    }

    @RequestMapping(value = "/getTrainingById", method = RequestMethod.GET)
    public ResponseResult getTrainingById(Integer id) {
        try {
            IndexTrainingDto indexTrainingDto = indexPersonService.getTrainingById(id);
            System.out.println(indexTrainingDto);
            return ResponseResult.ok(indexTrainingDto, "人才培养查询成功");
        } catch (Exception e) {
            logger.error("人才培养查询错误", e);
            return ResponseResult.failed(e.getMessage(), "人才培养查询失败");
        }
    }

    @RequestMapping(value = "/submitTrainingInfo", method = RequestMethod.POST)
    public ResponseResult submitTrainingInfo(
            IndexTrainingVo indexTrainingVo
    ) {
        try {
            indexPersonService.submitTrainingInfo(indexTrainingVo);
            return ResponseResult.ok("人才培养登记成功");
        } catch (Exception e) {
            logger.error("人才培养提交错误", e);
            return ResponseResult.failed(e.getMessage(), "人才培养登记失败");
        }
    }

    @RequestMapping(value = "/deleteTrainingById", method = RequestMethod.DELETE)
    public ResponseResult deleteTrainingById(Integer id) {
        try {
            indexPersonService.deleteTrainingById(id);
        } catch (Exception e) {
            logger.error("人才培养删除错误", e);
            return ResponseResult.failed(e.getMessage(), "人才培养删除失败");
        }
        return ResponseResult.ok("人才培养删除成功");
    }
}
