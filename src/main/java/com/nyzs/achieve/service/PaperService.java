package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.PaperDto;
import com.nyzs.achieve.bean.dto.PatentDto;
import com.nyzs.achieve.bean.vo.PaperVo;

import java.util.List;

public interface PaperService {
    List<PaperDto> getPaper(String paperName, String author, String status, String project, String startDate, String endDate) throws Exception;

    PaperDto getPaperByName(String paperName) throws Exception;

    void insertPaperInfo(PaperVo paperVo) throws Exception;

    void deletePaperById(Integer id) throws Exception;
}
