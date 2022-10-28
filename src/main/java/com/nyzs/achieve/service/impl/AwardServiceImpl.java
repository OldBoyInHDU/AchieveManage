package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.AwardDto;
import com.nyzs.achieve.bean.vo.AwardVo;
import com.nyzs.achieve.dao.AwardDao;
import com.nyzs.achieve.service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：荣誉奖励 Service
 * @date ：2022/10/28 8:22
 */
@Service
public class AwardServiceImpl implements AwardService {

    @Autowired
    private AwardDao awardDao;

    @Override
    public List<AwardDto> getAwards(String type, String level, String sort, String awardee, String award, String year) throws Exception {
        return awardDao.getAwards(type, level, sort, awardee, award, year);
    }

    @Override
    public AwardDto getAwardById(Integer id) throws Exception {
        return awardDao.getAwardById(id);
    }

    @Override
    public void submitAwardInfo(AwardVo awardVo) throws Exception {
        AwardDto awardDto = new AwardDto(
                awardVo.getId(),
                awardVo.getType(),
                awardVo.getLevel(),
                awardVo.getSort(),
                awardVo.getAwardee(),
                awardVo.getAward(),
                awardVo.getStatusDate(),
                awardVo.getCert(),
                awardVo.getCertStoragePath()
        );
        if(awardDao.getAwardById(awardVo.getId()) != null) {
            System.out.println("update:" + awardDto);
            awardDao.updateAwardInfo(awardDto);
        } else {
            System.out.println("insert:" + awardDto);
            awardDao.insertAwardInfo(awardDto);
        }
    }

    @Override
    public void deleteAwardById(Integer id) throws Exception {
        awardDao.deleteAwardById(id);
    }
}
