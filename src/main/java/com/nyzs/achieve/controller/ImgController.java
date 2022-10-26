package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.ImgFile;
import com.nyzs.achieve.bean.vo.ImgResponseResult;
import com.nyzs.achieve.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author ：RukiHuang
 * @description：富文本图片上传
 * @date ：2022/10/25 9:30
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class ImgController {

    private static Logger logger = LoggerFactory.getLogger(ImgController.class);

    @Autowired
    private UploadService uploadService;

    @RequestMapping("/uploadImg")
    public ImgResponseResult uploadImg(@RequestParam("file") MultipartFile file) {

        try {
            ImgFile imgFile = uploadService.uploadImg(file);
            ImgResponseResult res = new ImgResponseResult();
            res.setErrno(200);
            res.setData(imgFile);
            return res;
        } catch (IOException e) {
            logger.error("论文删除错误", e);
            ImgResponseResult err = new ImgResponseResult();
            err.setErrno(500);
            err.setData(null);
            return err;
        }
    }
}
