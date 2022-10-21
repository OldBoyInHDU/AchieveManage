package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.PaperDto;
import com.nyzs.achieve.bean.dto.RightDto;
import com.nyzs.achieve.bean.vo.PaperVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.bean.vo.RightVo;
import com.nyzs.achieve.service.PaperService;
import com.nyzs.achieve.service.RightService;
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
 * @description：软著相关 上传和管理
 * @date ：2022/9/1 12:39
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/techInno")
@RestController
public class RightController {

    private static Logger logger = LoggerFactory.getLogger(RightController.class);

    @Autowired
    RightService rightService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/getRight", method = RequestMethod.GET)
    public ResponseResult getRight(String rightName, String author, String status, String project, String startDate, String endDate) {
        try {
            List<RightDto> rightDtoList = rightService.getRight(rightName, author, status, project, startDate, endDate);
            System.out.println(rightDtoList);
            return ResponseResult.ok(rightDtoList, "软著查询成功");
        } catch (Exception e) {
            logger.error("软著查询错误", e);
            return ResponseResult.failed(e.getMessage(), "软著查询失败");
        }
    }

    @RequestMapping(value = "/getRightById", method = RequestMethod.GET)
    public ResponseResult getRightById(Integer id) {
        try {
            RightDto right = rightService.getRightById(id);
            return ResponseResult.ok(right, "软著查询成功");
        } catch (Exception e) {
            logger.error("软著查询错误", e);
            return ResponseResult.failed(e.getMessage(), "软著查询失败");
        }
    }

    @RequestMapping("/rightUpload")
    public ResponseResult uploadRight(
            @RequestParam("file") MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadDoc(file);
            return ResponseResult.ok(filename, "软著文件上传成功");
        } catch (IOException e) {
            logger.error("软著文件上传程序错误", e);
            return ResponseResult.failed(e.getMessage(),"软著文件上传失败");
        }

    }

    @RequestMapping(value = "/submitRightInfo", method = RequestMethod.POST)
    public ResponseResult submitRightInfo(
            RightVo rightVo
    ) {
        try {
//            System.out.println("controller:" + statusDate);
            rightService.insertRightInfo(rightVo);
            return ResponseResult.ok("软著登记成功");
        } catch (Exception e) {
            logger.error("软著提交错误", e);
            return ResponseResult.failed(e.getMessage(), "软著登记失败");
        }
    }

    @RequestMapping(value = "/deleteRightById", method = RequestMethod.DELETE)
    public ResponseResult deleteRightById(Integer id) {
        try {
            rightService.deleteRightById(id);
        } catch (Exception e) {
            logger.error("软著删除错误", e);
            return ResponseResult.failed(e.getMessage(), "软著删除失败");
        }
        return ResponseResult.ok("删除成功");
    }


}
