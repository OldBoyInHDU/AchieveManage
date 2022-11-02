package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.IndexAwardDto;
import com.nyzs.achieve.bean.vo.IndexAwardVo;

import java.util.List;

public interface IndexAwardService {
    List<IndexAwardDto> getAwards() throws Exception;

    IndexAwardDto getAwardById(Integer id) throws Exception;

    void submitAwardInfo(IndexAwardVo indexAwardVo) throws Exception;

    void deleteAwardById(Integer id) throws Exception;
}
