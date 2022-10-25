package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.QIDocDto;
import com.nyzs.achieve.bean.dto.QIDto;
import com.nyzs.achieve.bean.dto.SIDocDto;
import com.nyzs.achieve.bean.dto.SIDto;
import com.nyzs.achieve.bean.vo.QIVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.bean.vo.SIVo;
import com.nyzs.achieve.service.QualityImproveService;
import com.nyzs.achieve.service.SkillInnoService;
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
 * @description：质量改进相关 上传和管理
 * @date ：2022/9/1 12:39
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/techInno")
@RestController
public class SkillInnoController {

    private static Logger logger = LoggerFactory.getLogger(SkillInnoController.class);

    @Autowired
    SkillInnoService siService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/getSkillInno", method = RequestMethod.GET)
    public ResponseResult getSkillInno(String project, String type, String status, String leader, String member, String year) {
        try {
            List<SIDto> siDtoList = siService.getSkillInno(project, type, status, leader, member, year);
            System.out.println(siDtoList);
            return ResponseResult.ok(siDtoList, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping(value = "/getSIByName", method = RequestMethod.GET)
    public ResponseResult getSIByName(String project) {
        try {
            SIDto siDto = siService.getSIByName(project);
            return ResponseResult.ok(siDto, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping(value = "/getSIById", method = RequestMethod.GET)
    public ResponseResult getSIById(Integer id) {
        try {
            SIDto siDto = siService.getSIById(id);
            return ResponseResult.ok(siDto, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping(value = "/getSIDocByProject", method = RequestMethod.GET)
    public ResponseResult getSIDocByProject(String  project) {
        try {
            List<SIDocDto> siDocDtoList = siService.getSIDocByProject(project);
            return ResponseResult.ok(siDocDtoList, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping("/siUpload")
    public ResponseResult uploadSi(
            @RequestParam("file") MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadDoc(file);
            return ResponseResult.ok(filename, "项目文件上传成功");
        } catch (IOException e) {
            logger.error("项目文件上传程序错误", e);
            return ResponseResult.failed(e.getMessage(),"项目文件上传失败");
        }

    }

    @RequestMapping(value = "/submitSIInfo", method = RequestMethod.POST)
    public ResponseResult submitSIInfo(
            SIVo siVo
    ) {
        try {
//            System.out.println("qiVo:" + qiVo);
            siService.submitSIInfo(siVo);
            return ResponseResult.ok("项目登记成功");
        } catch (Exception e) {
            logger.error("项目提交错误", e);
            return ResponseResult.failed(e.getMessage(), "项目登记失败");
        }
    }

    @RequestMapping(value = "/deleteSIAndDoc", method = RequestMethod.DELETE)
    public ResponseResult deleteSIAndDoc(Integer id, String project) {
        try {
            siService.deleteSIAndDoc(id, project);
        } catch (Exception e) {
            logger.error("项目删除错误", e);
            return ResponseResult.failed(e.getMessage(), "项目删除失败");
        }
        return ResponseResult.ok("项目删除成功");
    }


}
