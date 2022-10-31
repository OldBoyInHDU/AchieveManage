package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.RuleDto;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.bean.vo.RuleVo;
import com.nyzs.achieve.service.RuleService;
import com.nyzs.achieve.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author ：RukiHuang
 * @description：规章制度 相关
 * @date ：2022/10/31 8:39
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/rules")
@RestController
public class RuleController {

    private static Logger logger = LoggerFactory.getLogger(RuleController.class);

    @Autowired
    private RuleService ruleService;

    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/getRules", method = RequestMethod.GET)
    public ResponseResult getRules(String type) {
        try {
            List<RuleDto> ruleDtoList = ruleService.getRules(type);
            System.out.println(ruleDtoList);
            return ResponseResult.ok(ruleDtoList, "规章制度查询成功");
        } catch (Exception e) {
            logger.error("规章制度查询错误", e);
            return ResponseResult.failed(e.getMessage(), "规章制度查询失败");
        }
    }

    @RequestMapping("/ruleUpload")
    public ResponseResult uploadRule(
            @RequestParam("file") MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadDoc(file);
            return ResponseResult.ok(filename, "规章制度文件上传成功");
        } catch (IOException e) {
            logger.error("规章制度文件上传程序错误", e);
            return ResponseResult.failed(e.getMessage(),"规章制度文件上传失败");
        }

    }

    @RequestMapping(value = "/getRuleById", method = RequestMethod.GET)
    public ResponseResult getRuleById(Integer id) {
        try {
            RuleDto ruleDto = ruleService.getRuleById(id);
            return ResponseResult.ok(ruleDto, "规章制度查询成功");
        } catch (Exception e) {
            logger.error("规章制度查询错误", e);
            return ResponseResult.failed(e.getMessage(), "规章制度查询失败");
        }
    }

    @RequestMapping(value = "/submitRuleInfo", method = RequestMethod.POST)
    public ResponseResult submitRuleInfo(
            RuleVo ruleVo
    ) {
        try {
            ruleService.submitRuleInfo(ruleVo);
            return ResponseResult.ok("规章制度登记成功");
        } catch (Exception e) {
            logger.error("规章制度提交错误", e);
            return ResponseResult.failed(e.getMessage(), "规章制度登记失败");
        }
    }

    @RequestMapping(value = "/deleteRuleById", method = RequestMethod.DELETE)
    public ResponseResult deleteRuleById(Integer id) {
        try {
            ruleService.deleteRuleById(id);
        } catch (Exception e) {
            logger.error("规章制度删除错误", e);
            return ResponseResult.failed(e.getMessage(), "规章制度删除失败");
        }
        return ResponseResult.ok("规章制度删除成功");
    }
}
