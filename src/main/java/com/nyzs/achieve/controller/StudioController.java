package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.ProfileDto;
import com.nyzs.achieve.bean.vo.ProfileVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.StudioService;
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
 * @description：工作室设置 Controller
 * @date ：2022/11/1 8:19
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/studio")
@RestController
public class StudioController {

    private static Logger logger = LoggerFactory.getLogger(StudioController.class);

    @Autowired
    private StudioService studioService;

    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/getProfiles", method = RequestMethod.GET)
    public ResponseResult getProfiles(String type) {
        try {
            List<ProfileDto> profileDtoList = studioService.getProfiles(type);
            System.out.println(profileDtoList);
            return ResponseResult.ok(profileDtoList, "简介文档查询成功");
        } catch (Exception e) {
            logger.error("简介文档查询错误", e);
            return ResponseResult.failed(e.getMessage(), "简介文档查询失败");
        }
    }

    @RequestMapping("/profileUpload")
    public ResponseResult uploadProfile(
            @RequestParam("file") MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadDoc(file);
            return ResponseResult.ok(filename, "简介文档文件上传成功");
        } catch (IOException e) {
            logger.error("简介文档文件上传程序错误", e);
            return ResponseResult.failed(e.getMessage(),"简介文档文件上传失败");
        }

    }

    @RequestMapping(value = "/getProfileById", method = RequestMethod.GET)
    public ResponseResult getProfileById(Integer id) {
        try {
            ProfileDto profileDto = studioService.getProfileById(id);
            return ResponseResult.ok(profileDto, "简介文档查询成功");
        } catch (Exception e) {
            logger.error("简介文档查询错误", e);
            return ResponseResult.failed(e.getMessage(), "简介文档查询失败");
        }
    }

    @RequestMapping(value = "/submitProfileInfo", method = RequestMethod.POST)
    public ResponseResult submitProfileInfo(
            ProfileVo profileVo
    ) {
        try {
            studioService.submitProfileInfo(profileVo);
            return ResponseResult.ok("简介文档登记成功");
        } catch (Exception e) {
            logger.error("简介文档提交错误", e);
            return ResponseResult.failed(e.getMessage(), "简介文档登记失败");
        }
    }

    @RequestMapping(value = "/deleteProfileById", method = RequestMethod.DELETE)
    public ResponseResult deleteProfileById(Integer id) {
        try {
            studioService.deleteProfileById(id);
        } catch (Exception e) {
            logger.error("简介文档删除错误", e);
            return ResponseResult.failed(e.getMessage(), "简介文档删除失败");
        }
        return ResponseResult.ok("简介文档删除成功");
    }
}
