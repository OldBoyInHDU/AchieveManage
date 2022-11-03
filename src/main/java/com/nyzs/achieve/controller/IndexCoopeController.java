package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.IndexCoopeDto;
import com.nyzs.achieve.bean.vo.IndexCoopeVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.IndexCoopeService;
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
 * @description ：index 合作交流
 * @date ：2022/11/3 9:10
 */

@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/index")
@RestController
public class IndexCoopeController {

    private static Logger logger = LoggerFactory.getLogger(IndexCoopeController.class);

    @Autowired
    private IndexCoopeService indexCoopeService;

    @RequestMapping(value = "/getCoopes", method = RequestMethod.GET)
    public ResponseResult getCoopes() {
        try {
            List<IndexCoopeDto> indexCoopeDtoList = indexCoopeService.getCoopes();
            System.out.println(indexCoopeDtoList);
            return ResponseResult.ok(indexCoopeDtoList, "合作交流查询成功");
        } catch (Exception e) {
            logger.error("合作交流查询错误", e);
            return ResponseResult.failed(e.getMessage(), "合作交流查询失败");
        }
    }

    @RequestMapping(value = "/getCoopeById", method = RequestMethod.GET)
    public ResponseResult getCoopeById(Integer id) {
        try {
            IndexCoopeDto indexCoopeDto = indexCoopeService.getCoopeById(id);
            System.out.println(indexCoopeDto);
            return ResponseResult.ok(indexCoopeDto, "合作交流查询成功");
        } catch (Exception e) {
            logger.error("合作交流查询错误", e);
            return ResponseResult.failed(e.getMessage(), "合作交流查询失败");
        }
    }

    @RequestMapping(value = "/submitCoopeInfo", method = RequestMethod.POST)
    public ResponseResult submitCoopeInfo(
            IndexCoopeVo indexCoopeVo
    ) {
        try {
            indexCoopeService.submitCoopeInfo(indexCoopeVo);
            return ResponseResult.ok("合作交流登记成功");
        } catch (Exception e) {
            logger.error("合作交流提交错误", e);
            return ResponseResult.failed(e.getMessage(), "合作交流登记失败");
        }
    }

    @RequestMapping(value = "/deleteCoopeById", method = RequestMethod.DELETE)
    public ResponseResult deleteCoopeById(Integer id) {
        try {
            indexCoopeService.deleteCoopeById(id);
        } catch (Exception e) {
            logger.error("合作交流删除错误", e);
            return ResponseResult.failed(e.getMessage(), "合作交流删除失败");
        }
        return ResponseResult.ok("合作交流删除成功");
    }

}
