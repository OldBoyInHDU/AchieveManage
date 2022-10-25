package com.nyzs.achieve.service.impl;

import com.alibaba.fastjson.JSON;
import com.nyzs.achieve.bean.dto.File;
import com.nyzs.achieve.bean.dto.QIDocDto;
import com.nyzs.achieve.bean.dto.QIDto;
import com.nyzs.achieve.bean.vo.QIVo;
import com.nyzs.achieve.dao.QualityImproveDao;
import com.nyzs.achieve.service.QualityImproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/10/22 9:37
 */
@Service
public class QualityImproveServiceImpl implements QualityImproveService {

    @Autowired
    QualityImproveDao qiDao;

    @Override
    public List<QIDto> getQualityImprove(String project, String sort, String type, String status, String leader, String member, String year) throws Exception {
        return qiDao.getQualityImprove(project, sort, type, status, leader, member, year);
    }

    @Override
    public QIDto getQIByName(String project) throws Exception {
        return qiDao.getQIByName(project);
    }

    @Override
    public void submitQIInfo(QIVo qiVo) throws Exception {
        String uploadListJson = qiVo.getUploadList();
        List<File> uploadList = JSON.parseArray(uploadListJson, File.class);
        QIDto qiDto = new QIDto(qiVo.getProject(),
                qiVo.getSort(),
                qiVo.getType(),
                qiVo.getLeader(),
                qiVo.getMember(),
                qiVo.getStatus(),
                qiVo.getStatusDate(),
                qiVo.getAward());

        if(qiDao.getQIByName(qiVo.getProject()) != null) {
            System.out.println("update:" + qiDto);
            qiDao.updateQIInfo(qiDto);
        } else {
            System.out.println("insert:" + qiDto);
            qiDao.insertQIInfo(qiDto);
        }
        for(int i = 0; i < uploadList.size(); i++) {
            String docFilename = uploadList.get(i).getFileName();
            String project = qiVo.getProject();
            String storagePath = uploadList.get(i).getStoragePath();
            QIDocDto qiDocDto = new QIDocDto(docFilename, project, storagePath);
            qiDao.insertQIDocInfo(qiDocDto);
        }
    }

    @Override
    public void deleteQIById(Integer id) throws Exception {
        qiDao.deleteQIById(id);
    }

    @Override
    public QIDto getQIById(Integer id) throws Exception {
        return qiDao.getQIById(id);
    }

    @Override
    public List<QIDocDto> getQIDocByProject(String project) throws Exception {
        return qiDao.getQIDocByProject(project);
    }

    @Override
    public void deleteQIAndDoc(Integer id, String project) throws Exception {
        qiDao.deleteQIById(id);
        qiDao.deleteQIDocByProject(project);
    }
}
