package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.ImgFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {
    String uploadDoc(MultipartFile file) throws IOException;

    String uploadVideo(MultipartFile file) throws IOException;

    String uploadCourseware(MultipartFile file) throws IOException;

    ImgFile uploadImg(MultipartFile file) throws IOException;
}
