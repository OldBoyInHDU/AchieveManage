package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.IndexAwardDto;
import com.nyzs.achieve.bean.dto.IndexTechDto;
import com.nyzs.achieve.bean.vo.IndexAwardVo;
import com.nyzs.achieve.bean.vo.IndexTechVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.IndexTechService;
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
 * @description：index 科技创新
 * @date ：2022/11/3 8:25
 */

@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/index")
@RestController
public class IndexTechController {

    private static Logger logger = LoggerFactory.getLogger(IndexTechController.class);

    @Autowired
    private IndexTechService indexTechService;

    @RequestMapping(value = "/getTechs", method = RequestMethod.GET)
    public ResponseResult getTechs() {
        try {
            List<IndexTechDto> indexTechDtoList = indexTechService.getTechs();
            System.out.println(indexTechDtoList);
            return ResponseResult.ok(indexTechDtoList, "科技创新查询成功");
        } catch (Exception e) {
            logger.error("科技创新查询错误", e);
            return ResponseResult.failed(e.getMessage(), "科技创新查询失败");
        }
    }

    @RequestMapping(value = "/getTechById", method = RequestMethod.GET)
    public ResponseResult getTechById(Integer id) {
        try {
            IndexTechDto indexTechDto = indexTechService.getTechById(id);
            System.out.println(indexTechDto);
            return ResponseResult.ok(indexTechDto, "科技创新查询成功");
        } catch (Exception e) {
            logger.error("科技创新查询错误", e);
            return ResponseResult.failed(e.getMessage(), "科技创新查询失败");
        }
    }

    @RequestMapping(value = "/submitTechInfo", method = RequestMethod.POST)
    public ResponseResult submitTechInfo(
            IndexTechVo indexTechVo
    ) {
        try {
            indexTechService.submitTechInfo(indexTechVo);
            return ResponseResult.ok("科技创新登记成功");
        } catch (Exception e) {
            logger.error("科技创新提交错误", e);
            return ResponseResult.failed(e.getMessage(), "科技创新登记失败");
        }
    }

    @RequestMapping(value = "/deleteTechById", method = RequestMethod.DELETE)
    public ResponseResult deleteTechById(Integer id) {
        try {
            indexTechService.deleteTechById(id);
        } catch (Exception e) {
            logger.error("科技创新删除错误", e);
            return ResponseResult.failed(e.getMessage(), "科技创新删除失败");
        }
        return ResponseResult.ok("科技创新删除成功");
    }
}
