package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.PatentDto;
import com.nyzs.achieve.bean.dto.VideoFileInfoDto;
import com.nyzs.achieve.dao.PatentDao;
import com.nyzs.achieve.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author ：RukiHuang
 * @description：专利相关service
 * @date ：2022/9/1 12:46
 */
@Service
public class PatentServiceImpl implements PatentService {

    @Autowired
    PatentDao patentDao;

    @Override
    public List<PatentDto> getPatent(String patentName, String inventor, String patentType, String status, String startDate, String endDate) throws ParseException {

        return patentDao.getPatent(patentName, inventor, patentType, status, startDate, endDate);
    }

    @Override
    public void insertPatentInfo(String patentName, String inventor, String patentType, String project, String status, String statusDateStr, String application, String appStoragePath, String techFile, String techFileStoragePath, String cert, String certStoragePath) throws Exception {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(statusDateStr);
//        Date statusDate = dateFormat.parse(statusDateStr);
//        System.out.println(statusDate);
//        System.out.println(statusDate.toString());
        PatentDto patentDto = new PatentDto(patentName, inventor, patentType, project, status, statusDateStr, application, appStoragePath, techFile, techFileStoragePath, cert, certStoragePath);
//        System.out.println(patentDto);
        if(patentDao.getPatentByName(patentName) != null) {
            System.out.println("update:" + patentDto);
            patentDao.updatePatentInfo(patentDto);
        } else {
            System.out.println("insert:" + patentDto);
            patentDao.insertPatentInfo(patentDto);
        }

    }

    @Override
    public PatentDto getPatentByName(String patentName) throws Exception {
        PatentDto patent = patentDao.getPatentByName(patentName);
        System.out.println("getByName: " + patent);
        return patent;
    }

    @Override
    public void deletePatentById(Integer id) throws Exception {
        patentDao.deletePatentById(id);
    }
}
