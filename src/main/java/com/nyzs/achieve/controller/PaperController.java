package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.PaperDto;
import com.nyzs.achieve.bean.dto.PatentDto;
import com.nyzs.achieve.bean.vo.PaperVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.PaperService;
import com.nyzs.achieve.service.PatentService;
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
 * @description：专利相关 上传和管理
 * @date ：2022/9/1 12:39
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/techInno")
@RestController
public class PaperController {

    private static Logger logger = LoggerFactory.getLogger(PaperController.class);

    @Autowired
    PaperService paperService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/getPaper", method = RequestMethod.GET)
    public ResponseResult getPaper(String paperName, String author, String status, String project, String startDate, String endDate) {
        try {
            List<PaperDto> paperDtoList = paperService.getPaper(paperName, author, status, project, startDate, endDate);
            System.out.println(paperDtoList);
            return ResponseResult.ok(paperDtoList, "论文查询成功");
        } catch (Exception e) {
            logger.error("专利查询错误", e);
            return ResponseResult.failed(e.getMessage(), "论文查询失败");
        }
    }

    @RequestMapping(value = "/getPaperByName", method = RequestMethod.GET)
    public ResponseResult getPaperByName(String paperName) {
        try {
            PaperDto paper = paperService.getPaperByName(paperName);
            return ResponseResult.ok(paper, "专利查询成功");
        } catch (Exception e) {
            logger.error("专利查询错误", e);
            return ResponseResult.failed(e.getMessage(), "专利查询失败");
        }
    }

    @RequestMapping("/paperUpload")
    public ResponseResult uploadPaper(
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

    @RequestMapping(value = "/submitPaperInfo", method = RequestMethod.POST)
    public ResponseResult submitPaperInfo(
            PaperVo paperVo
    ) {
        try {
//            System.out.println("controller:" + statusDate);
            paperService.insertPaperInfo(paperVo);
            return ResponseResult.ok("专利登记成功");
        } catch (Exception e) {
            logger.error("专利提交错误", e);
            return ResponseResult.failed(e.getMessage(), "专利登记失败");
        }
    }

    @RequestMapping(value = "/deletePaperById", method = RequestMethod.DELETE)
    public ResponseResult deletePaperById(Integer id) {
        try {
            paperService.deletePaperById(id);
        } catch (Exception e) {
            logger.error("专利删除错误", e);
            return ResponseResult.failed(e.getMessage(), "专利删除失败");
        }
        return ResponseResult.ok("删除成功");
    }


}
