package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.IndexTechDto;
import com.nyzs.achieve.bean.vo.IndexTechVo;

import java.util.List;

public interface IndexTechService {
    List<IndexTechDto> getTechs() throws Exception;

    IndexTechDto getTechById(Integer id) throws Exception;

    void submitTechInfo(IndexTechVo indexTechVo) throws Exception;

    void deleteTechById(Integer id) throws Exception;
}
