package com.nyzs.achieve.service.impl;

import com.alibaba.fastjson.JSON;
import com.nyzs.achieve.bean.dto.*;
import com.nyzs.achieve.bean.vo.QIVo;
import com.nyzs.achieve.bean.vo.SIVo;
import com.nyzs.achieve.dao.QualityImproveDao;
import com.nyzs.achieve.dao.SkillInnoDao;
import com.nyzs.achieve.service.QualityImproveService;
import com.nyzs.achieve.service.SkillInnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：SkillInno Service
 * @date ：2022/10/22 9:37
 */
@Service
public class SkillInnoServiceImpl implements SkillInnoService {

    @Autowired
    SkillInnoDao siDao;

    @Override
    public List<SIDto> getSkillInno(String project, String type, String status, String leader, String member, String year) throws Exception {
        return siDao.getSkillInno(project, type, status, leader, member, year);
    }

    @Override
    public SIDto getSIByName(String project) throws Exception {
        return siDao.getSIByName(project);
    }

    @Override
    public void submitSIInfo(SIVo siVo) throws Exception {
        String uploadListJson = siVo.getUploadList();
        List<File> uploadList = JSON.parseArray(uploadListJson, File.class);
        SIDto siDto = new SIDto(siVo.getProject(),
                siVo.getType(),
                siVo.getLeader(),
                siVo.getMember(),
                siVo.getStatus(),
                siVo.getStatusDate(),
                siVo.getAward());

        if(siDao.getSIByName(siVo.getProject()) != null) {
            System.out.println("update:" + siDto);
            siDao.updateSIInfo(siDto);
        } else {
            System.out.println("insert:" + siDto);
            siDao.insertSIInfo(siDto);
        }
        for(int i = 0; i < uploadList.size(); i++) {
            String docFilename = uploadList.get(i).getFileName();
            String project = siVo.getProject();
            String storagePath = uploadList.get(i).getStoragePath();
            SIDocDto siDocDto = new SIDocDto(docFilename, project, storagePath);
            siDao.insertSIDocInfo(siDocDto);
        }
    }

    @Override
    public void deleteSIById(Integer id) throws Exception {
        siDao.deleteSIById(id);
    }

    @Override
    public SIDto getSIById(Integer id) throws Exception {
        return siDao.getSIById(id);
    }

    @Override
    public List<SIDocDto> getSIDocByProject(String project) throws Exception {
        return siDao.getSIDocByProject(project);
    }

    @Override
    public void deleteSIAndDoc(Integer id, String project) throws Exception {
        siDao.deleteSIById(id);
        siDao.deleteSIDocByProject(project);
    }
}
