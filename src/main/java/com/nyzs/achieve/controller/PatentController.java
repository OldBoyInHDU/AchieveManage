package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.PatentDto;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.UploadService;
import com.nyzs.achieve.service.PatentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author ：RukiHuang
 * @description：专利相关 上传和管理
 * @date ：2022/9/1 12:39
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/techInno")
@RestController
public class PatentController {

    private static Logger logger = LoggerFactory.getLogger(PatentController.class);

    @Autowired
    PatentService patentService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/getPatent", method = RequestMethod.GET)
    public ResponseResult getPatent(String patentName, String inventor, String patentType, String status, String project, String startDate, String endDate) {
        try {
//            System.out.println(patentName);
//            System.out.println(inventor);
//            System.out.println(patentType);
//            System.out.println(status);
//            System.out.println(startDate);
//            System.out.println(endDate);
            List<PatentDto> patentDtoList = patentService.getPatent(patentName, inventor, patentType, status, project, startDate, endDate);
            System.out.println(patentDtoList);
            return ResponseResult.ok(patentDtoList, "专利查询成功");
        } catch (Exception e) {
            logger.error("专利查询错误", e);
            return ResponseResult.failed(e.getMessage(), "专利查询失败");
        }
    }

    @RequestMapping(value = "/getPatentByName", method = RequestMethod.GET)
    public ResponseResult getPatentByName(String patentName) {
        try {
            PatentDto patent = patentService.getPatentByName(patentName);
            return ResponseResult.ok(patent, "专利查询成功");
        } catch (Exception e) {
            logger.error("专利查询错误", e);
            return ResponseResult.failed(e.getMessage(), "专利查询失败");
        }
    }

    @RequestMapping("/patentUpload")
    public ResponseResult uploadPatent(
            @RequestParam("file") MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadDoc(file);
            return ResponseResult.ok(filename, "专利文件上传成功");
        } catch (IOException e) {
            logger.error("专利文件上传程序错误", e);
            return ResponseResult.failed(e.getMessage(),"专利文件上传失败");
        }

    }

    @RequestMapping(value = "/submitPatentInfo", method = RequestMethod.POST)
    public ResponseResult submitPatentInfo(
            String patentName,
            String inventor,
            String patentType,
            String project,
            String status,
            String statusDate,
            String application,
            String appStoragePath,
            String techFile,
            String techFileStoragePath,
            String cert,
            String certStoragePath
    ) {
        try {
            System.out.println("controller:" + statusDate);
            patentService.insertPatentInfo(patentName, inventor, patentType, project, status, statusDate, application, appStoragePath,
                    techFile, techFileStoragePath, cert, certStoragePath);
            return ResponseResult.ok("专利登记成功");
        } catch (Exception e) {
            logger.error("专利提交错误", e);
            return ResponseResult.failed(e.getMessage(), "专利登记失败");
        }
    }

    @RequestMapping(value = "/deletePatentById", method = RequestMethod.DELETE)
    public ResponseResult deletePatentById(Integer id) {
        try {
            patentService.deletePatentById(id);
        } catch (Exception e) {
            logger.error("专利删除错误", e);
            return ResponseResult.failed(e.getMessage(), "专利删除失败");
        }
        return ResponseResult.ok("删除成功");
    }


}
