package com.nyzs.achieve.service.impl;

import com.alibaba.fastjson.JSON;
import com.nyzs.achieve.bean.dto.File;
import com.nyzs.achieve.bean.dto.TPDocDto;
import com.nyzs.achieve.bean.dto.TPDto;
import com.nyzs.achieve.bean.vo.TPVo;
import com.nyzs.achieve.dao.TechProjectDao;
import com.nyzs.achieve.service.TechProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TechProjectService
 * @date ：2022/10/26 8:49
 */
@Service
public class TechProjectServiceImpl implements TechProjectService {

    @Autowired
    private TechProjectDao tpDao;

    @Override
    public List<TPDto> getTechProject(String project, String type, String status, String leader, String member, String date) throws Exception {
        return tpDao.getTechProject(project, type, status, leader, member, date);
    }

    @Override
    public TPDto getTPByName(String project) throws Exception {
        return tpDao.getTPByName(project);
    }

    @Override
    public TPDto getTPById(Integer id) throws Exception {
        return tpDao.getTPById(id);
    }

    @Override
    public List<TPDocDto> getTPDocByProject(String project) throws Exception {
        return tpDao.getTPDocByProject(project);
    }

    @Override
    public void submitTPInfo(TPVo tpVo) throws Exception {
        String uploadListJson = tpVo.getUploadList();
        List<File> uploadList = JSON.parseArray(uploadListJson, File.class);
        TPDto tpDto = new TPDto(
                tpVo.getProject(),
                tpVo.getType(),
                tpVo.getLeader(),
                tpVo.getMember(),
                tpVo.getStatus(),
                tpVo.getStartDate(),
                tpVo.getEndDate(),
                tpVo.getAward());
        if(tpDao.getTPByName(tpVo.getProject()) != null) {
            System.out.println("update:" + tpDto);
            tpDao.updateTPInfo(tpDto);
        } else {
            System.out.println("insert:" + tpDto);
            tpDao.insertTPInfo(tpDto);
        }
        for(int i = 0; i < uploadList.size(); i++) {
            String docFilename = uploadList.get(i).getFileName();
            String project = tpVo.getProject();
            String storagePath = uploadList.get(i).getStoragePath();
            TPDocDto tpDocDto = new TPDocDto(docFilename, project, storagePath);
            tpDao.insertTPDocInfo(tpDocDto);
        }
    }

    @Override
    public void deleteTPAndDoc(Integer id, String project) throws Exception {
        tpDao.deleteTPById(id);
        tpDao.deleteTPDocByProject(project);
    }
}
