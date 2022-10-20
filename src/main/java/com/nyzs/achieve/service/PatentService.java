package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.PatentDto;


import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface PatentService {

    List<PatentDto> getPatent(String patentName, String inventor, String patentType, String status, String project, String startDate, String endDate) throws ParseException;

    void insertPatentInfo(String patentName, String inventor, String patentType, String project, String status, String statusDate, String application, String appStoragePath, String techFile, String techFileStoragePath, String cert, String certStoragePath) throws Exception;

    PatentDto getPatentByName(String patentName) throws Exception;

    void deletePatentById(Integer id) throws Exception;
}
