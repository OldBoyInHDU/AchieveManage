package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.TPDocDto;
import com.nyzs.achieve.bean.dto.TPDto;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.bean.vo.TPVo;
import com.nyzs.achieve.service.TechProjectService;
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
 * @description：科技项目相关 上传和管理
 * @date ：2022/9/1 12:39
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/techInno")
@RestController
public class TechProjectController {

    private static Logger logger = LoggerFactory.getLogger(TechProjectController.class);

    @Autowired
    TechProjectService tpService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/getTechProject", method = RequestMethod.GET)
    public ResponseResult getTechProject(String project, String type, String status, String leader, String member, String date) {
        try {
            List<TPDto> tpDtoList = tpService.getTechProject(project, type, status, leader, member, date);
            System.out.println(tpDtoList);
            return ResponseResult.ok(tpDtoList, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping(value = "/getTPByName", method = RequestMethod.GET)
    public ResponseResult getTPByName(String project) {
        try {
            TPDto tpDto = tpService.getTPByName(project);
            return ResponseResult.ok(tpDto, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping(value = "/getTPById", method = RequestMethod.GET)
    public ResponseResult getTPById(Integer id) {
        try {
            TPDto tpDto = tpService.getTPById(id);
            return ResponseResult.ok(tpDto, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping(value = "/getTPDocByProject", method = RequestMethod.GET)
    public ResponseResult getTPDocByProject(String  project) {
        try {
            List<TPDocDto> tpDocDtoList = tpService.getTPDocByProject(project);
            return ResponseResult.ok(tpDocDtoList, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }

    @RequestMapping("/tpUpload")
    public ResponseResult uploadTP(
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

    @RequestMapping(value = "/submitTPInfo", method = RequestMethod.POST)
    public ResponseResult submitTPInfo(
            TPVo tpVo
    ) {
        try {
//            System.out.println("qiVo:" + qiVo);
            tpService.submitTPInfo(tpVo);
            return ResponseResult.ok("项目登记成功");
        } catch (Exception e) {
            logger.error("项目提交错误", e);
            return ResponseResult.failed(e.getMessage(), "项目登记失败");
        }
    }

    @RequestMapping(value = "/deleteTPAndDoc", method = RequestMethod.DELETE)
    public ResponseResult deleteTPAndDoc(Integer id, String project) {
        try {
            tpService.deleteTPAndDoc(id, project);
        } catch (Exception e) {
            logger.error("项目删除错误", e);
            return ResponseResult.failed(e.getMessage(), "项目删除失败");
        }
        return ResponseResult.ok("项目删除成功");
    }


}
