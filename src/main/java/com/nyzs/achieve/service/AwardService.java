package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.AwardDto;
import com.nyzs.achieve.bean.vo.AwardVo;

import java.util.List;

public interface AwardService {
    List<AwardDto> getAwards(String type, String level, String sort, String awardee, String award, String year) throws Exception;

    AwardDto getAwardById(Integer id) throws Exception;

    void submitAwardInfo(AwardVo awardVo) throws Exception;

    void deleteAwardById(Integer id) throws Exception;
}
