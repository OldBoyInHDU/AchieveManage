package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.RuleDto;
import com.nyzs.achieve.bean.vo.RuleVo;

import java.util.List;

public interface RuleService {
    List<RuleDto> getRules(String type) throws Exception;

    RuleDto getRuleById(Integer id) throws Exception;

    void submitRuleInfo(RuleVo ruleVo) throws Exception;

    void deleteRuleById(Integer id) throws Exception;
}
