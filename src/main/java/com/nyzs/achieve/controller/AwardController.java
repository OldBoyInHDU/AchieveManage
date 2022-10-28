package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.AwardDto;
import com.nyzs.achieve.bean.dto.QIDocDto;
import com.nyzs.achieve.bean.dto.QIDto;
import com.nyzs.achieve.bean.vo.AwardVo;
import com.nyzs.achieve.bean.vo.QIVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.AwardService;
import com.nyzs.achieve.service.QualityImproveService;
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
 * @description：奖励荣誉 相关
 * @date ：2022/10/28 8:11
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/award")
@RestController
public class AwardController {
    private static Logger logger = LoggerFactory.getLogger(AwardController.class);

    @Autowired
    AwardService awardService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/getAwards", method = RequestMethod.GET)
    public ResponseResult getAwards(String type, String level, String sort, String awardee, String award, String year) {
        try {
            List<AwardDto>  awardDtoList = awardService.getAwards(type, level, sort, awardee, award, year);
            System.out.println(awardDtoList);
            return ResponseResult.ok(awardDtoList, "荣誉查询成功");
        } catch (Exception e) {
            logger.error("荣誉查询错误", e);
            return ResponseResult.failed(e.getMessage(), "荣誉查询失败");
        }
    }

    @RequestMapping(value = "/getAwardById", method = RequestMethod.GET)
    public ResponseResult getAwardById(Integer id) {
        try {
            AwardDto awardDto = awardService.getAwardById(id);
            return ResponseResult.ok(awardDto, "荣誉查询成功");
        } catch (Exception e) {
            logger.error("荣誉查询错误", e);
            return ResponseResult.failed(e.getMessage(), "荣誉查询失败");
        }
    }

    @RequestMapping("/awardUpload")
    public ResponseResult awardUpload(
            @RequestParam("file") MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadDoc(file);
            return ResponseResult.ok(filename, "荣誉文件上传成功");
        } catch (IOException e) {
            logger.error("荣誉文件上传程序错误", e);
            return ResponseResult.failed(e.getMessage(),"荣誉文件上传失败");
        }

    }

    @RequestMapping(value = "/submitAwardInfo", method = RequestMethod.POST)
    public ResponseResult submitAwardInfo(
            AwardVo AwardVo
    ) {
        try {
//            System.out.println("qiVo:" + qiVo);
            awardService.submitAwardInfo(AwardVo);
            return ResponseResult.ok("荣誉登记成功");
        } catch (Exception e) {
            logger.error("荣誉提交错误", e);
            return ResponseResult.failed(e.getMessage(), "荣誉登记失败");
        }
    }

    @RequestMapping(value = "/deleteAwardById", method = RequestMethod.DELETE)
    public ResponseResult deleteAwardById(Integer id) {
        try {
            awardService.deleteAwardById(id);
        } catch (Exception e) {
            logger.error("荣誉删除错误", e);
            return ResponseResult.failed(e.getMessage(), "荣誉删除失败");
        }
        return ResponseResult.ok("荣誉删除成功");
    }
}
