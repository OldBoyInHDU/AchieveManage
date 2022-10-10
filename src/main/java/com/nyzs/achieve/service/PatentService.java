package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.PatentDto;
import com.nyzs.achieve.bean.dto.VideoFileInfoDto;

import java.text.ParseException;
import java.util.List;

public interface PatentService {

    List<PatentDto> getPatent(String patentName, String inventor, String patentType, String status, String startDate, String endDate) throws ParseException;
}
