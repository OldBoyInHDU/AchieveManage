package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.Utils.UploadUtils;
import com.nyzs.achieve.bean.dto.ImgFile;
import com.nyzs.achieve.config.UploadProperties;
import com.nyzs.achieve.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author ：RukiHuang
 * @description：上传service
 * @date ：2022/9/2 10:16
 */
@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    UploadProperties uploadProperties;

    @Value("${img.upload.path}")
    private String imgPath;

    @Override
    public String uploadDoc(MultipartFile file) throws IOException {
        System.out.println(file.getContentType());
        if(!uploadProperties.getAllowType().get(0).equals(file.getContentType())) {
            throw new IOException("文档上传类型错误");
        }
        String fileName = UploadUtils.generateFileName(file.getOriginalFilename());
        File newFile = new File(uploadProperties.getPath() + fileName);
        file.transferTo(newFile);
        System.out.println(newFile.getPath());
        return fileName;
    }

    @Override
    public String uploadVideo(MultipartFile file) throws IOException {
        System.out.println(file.getContentType());
        if(!uploadProperties.getAllowType().get(1).equals(file.getContentType())) {
            throw new IOException("视频上传类型错误");
        }
        String fileName = UploadUtils.generateFileName(file.getOriginalFilename());
        File newFile = new File(uploadProperties.getPath()+"\\video\\" + fileName);
        file.transferTo(newFile);
        System.out.println(newFile.getPath());
        return fileName;
    }

    @Override
    public String uploadCourseware(MultipartFile file) throws IOException {
        System.out.println(file.getContentType());
        if(!uploadProperties.getAllowType().get(0).equals(file.getContentType())) {
            throw new IOException("课件上传类型错误");
        }
        String fileName = UploadUtils.generateFileName(file.getOriginalFilename());
        File newFile = new File(uploadProperties.getPath()+"\\courseware\\" + fileName);
        file.transferTo(newFile);
        System.out.println(newFile.getPath());
        return fileName;
    }

    @Override
    public ImgFile uploadImg(MultipartFile file) throws IOException {
        System.out.println(file.getContentType());
        String imgName = UploadUtils.generateFileName(file.getOriginalFilename());
        File newFile = new File(imgPath + imgName);
        file.transferTo(newFile);
        System.out.println(newFile.getPath());
        String url = "http://localhost:8088/achieve/filestore/img/" + imgName;
        String alt = file.getOriginalFilename();
        String href = "http://localhost:8088/achieve/filestore/img/" + imgName;
        ImgFile imgFile = new ImgFile(url, alt, href);
        return imgFile;
    }
}
