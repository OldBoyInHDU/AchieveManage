package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.RuleDto;
import com.nyzs.achieve.bean.vo.RuleVo;
import com.nyzs.achieve.dao.RuleDao;
import com.nyzs.achieve.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：规章制度 Service
 * @date ：2022/10/31 8:41
 */
@Service
public class RuleServiceImpl implements RuleService {

    @Autowired
    private RuleDao ruleDao;

    @Override
    public List<RuleDto> getRules(String type) throws Exception {
        return ruleDao.getRules(type);
    }

    @Override
    public RuleDto getRuleById(Integer id) throws Exception {
        return ruleDao.getRuleById(id);
    }

    @Override
    public void submitRuleInfo(RuleVo ruleVo) throws Exception {
        RuleDto ruleDto = new RuleDto();
        ruleDto.setType(ruleVo.getType());
        ruleDto.setRule(ruleVo.getRule());
        ruleDto.setRuleStoragePath(ruleVo.getRuleStoragePath());

        if (ruleDao.getRuleById(ruleVo.getId()) != null) {
            ruleDto.setId(ruleVo.getId());
            System.out.println("update:" + ruleDto);
            ruleDao.updateRuleInfo(ruleDto);
        } else {
            System.out.println("insert:" + ruleDto);
            ruleDao.insertRuleInfo(ruleDto);
        }
    }

    @Override
    public void deleteRuleById(Integer id) throws Exception {
        ruleDao.deleteRuleById(id);
    }
}
