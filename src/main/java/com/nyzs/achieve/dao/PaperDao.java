package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.PaperDto;
import com.nyzs.achieve.bean.dto.PatentDto;
import com.nyzs.achieve.bean.vo.PaperVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaperDao {
    List<PaperDto> getPaper(String paperName, String author, String status, String project, String startDate, String endDate) throws Exception;

    PaperDto getPaperByName(String paperName) throws Exception;

    void insertPaperInfo(PaperDto paperDto) throws Exception;

    void deletePaperById(Integer id) throws Exception;

    void updatePaperInfo(PaperDto paperDto) throws Exception;
}
