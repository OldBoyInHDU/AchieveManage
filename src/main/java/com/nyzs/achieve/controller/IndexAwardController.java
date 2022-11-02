package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.IndexAwardDto;
import com.nyzs.achieve.bean.vo.IndexAwardVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.IndexAwardService;
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
 * @description：首页-奖励荣誉
 * @date ：2022/11/2 13:18
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/index")
@RestController
public class IndexAwardController {

    private static Logger logger = LoggerFactory.getLogger(IndexAwardController.class);

    @Autowired
    private IndexAwardService indexAwardService;

    @RequestMapping(value = "/getAwards", method = RequestMethod.GET)
    public ResponseResult getAwards() {
        try {
            List<IndexAwardDto> indexAwardDtoList = indexAwardService.getAwards();
            System.out.println(indexAwardDtoList);
            return ResponseResult.ok(indexAwardDtoList, "荣誉查询成功");
        } catch (Exception e) {
            logger.error("荣誉查询错误", e);
            return ResponseResult.failed(e.getMessage(), "荣誉查询失败");
        }
    }

    @RequestMapping(value = "/getAwardById", method = RequestMethod.GET)
    public ResponseResult getAwardById(Integer id) {
        try {
            IndexAwardDto indexAwardDto = indexAwardService.getAwardById(id);
            System.out.println(indexAwardDto);
            return ResponseResult.ok(indexAwardDto, "荣誉查询成功");
        } catch (Exception e) {
            logger.error("荣誉查询错误", e);
            return ResponseResult.failed(e.getMessage(), "荣誉查询失败");
        }
    }

    @RequestMapping(value = "/submitAwardInfo", method = RequestMethod.POST)
    public ResponseResult submitAwardInfo(
            IndexAwardVo indexAwardVo
    ) {
        try {
            indexAwardService.submitAwardInfo(indexAwardVo);
            return ResponseResult.ok("荣誉登记成功");
        } catch (Exception e) {
            logger.error("荣誉提交错误", e);
            return ResponseResult.failed(e.getMessage(), "荣誉登记失败");
        }
    }

    @RequestMapping(value = "/deleteAwardById", method = RequestMethod.DELETE)
    public ResponseResult deleteAwardById(Integer id) {
        try {
            indexAwardService.deleteAwardById(id);
        } catch (Exception e) {
            logger.error("荣誉删除错误", e);
            return ResponseResult.failed(e.getMessage(), "荣誉删除失败");
        }
        return ResponseResult.ok("荣誉删除成功");
    }
}
