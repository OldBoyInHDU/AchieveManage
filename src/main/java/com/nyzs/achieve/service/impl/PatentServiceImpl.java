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
}
