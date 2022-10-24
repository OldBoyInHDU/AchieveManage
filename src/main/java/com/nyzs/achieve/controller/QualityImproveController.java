package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.PaperDto;
import com.nyzs.achieve.bean.dto.QIDocDto;
import com.nyzs.achieve.bean.dto.QIDto;
import com.nyzs.achieve.bean.vo.PaperVo;
import com.nyzs.achieve.bean.vo.QIVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.PaperService;
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
 * @description：质量改进相关 上传和管理
 * @date ：2022/9/1 12:39
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/techInno")
@RestController
public class QualityImproveController {

    private static Logger logger = LoggerFactory.getLogger(QualityImproveController.class);

    @Autowired
    QualityImproveService qiService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/getQualityImprove", method = RequestMethod.GET)
    public ResponseResult getQualityImprove(String project, String sort, String type, String status, String leader, String member, String year) {
        try {
            List<QIDto> qiDtoList = qiService.getQualityImprove(project, sort, type, status, leader, member, year);
            System.out.println(qiDtoList);
            return ResponseResult.ok(qiDtoList, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping(value = "/getQIByName", method = RequestMethod.GET)
    public ResponseResult getQIByName(String project) {
        try {
            QIDto qiDto = qiService.getQIByName(project);
            return ResponseResult.ok(qiDto, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping(value = "/getQIById", method = RequestMethod.GET)
    public ResponseResult getQIById(Integer id) {
        try {
            QIDto qiDto = qiService.getQIById(id);
            return ResponseResult.ok(qiDto, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping(value = "/getQIDocByProject", method = RequestMethod.GET)
    public ResponseResult getQIDocByProject(String  project) {
        try {
            List<QIDocDto> qiDocDtoList = qiService.getQIDocByProject(project);
            return ResponseResult.ok(qiDocDtoList, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping("/qiUpload")
    public ResponseResult uploadQi(
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

    @RequestMapping(value = "/submitQIInfo", method = RequestMethod.POST)
    public ResponseResult submitQIInfo(
            QIVo qiVo
    ) {
        try {
//            System.out.println("qiVo:" + qiVo);
            qiService.submitQIInfo(qiVo);
            return ResponseResult.ok("项目登记成功");
        } catch (Exception e) {
            logger.error("项目提交错误", e);
            return ResponseResult.failed(e.getMessage(), "项目登记失败");
        }
    }

    @RequestMapping(value = "/deleteQIById", method = RequestMethod.DELETE)
    public ResponseResult deleteQIById(Integer id) {
        try {
            qiService.deleteQIById(id);
        } catch (Exception e) {
            logger.error("项目删除错误", e);
            return ResponseResult.failed(e.getMessage(), "项目删除失败");
        }
        return ResponseResult.ok("项目删除成功");
    }


}
