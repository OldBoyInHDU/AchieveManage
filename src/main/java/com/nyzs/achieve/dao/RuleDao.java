package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.RuleDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RuleDao {
    void deleteRuleById(Integer id) throws Exception;

    RuleDto getRuleById(Integer id) throws Exception;

    List<RuleDto> getRules(String type) throws Exception;

    void updateRuleInfo(RuleDto ruleDto) throws Exception;

    void insertRuleInfo(RuleDto ruleDto) throws Exception;
}
