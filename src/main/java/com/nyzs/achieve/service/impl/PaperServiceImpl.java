package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.PaperDto;
import com.nyzs.achieve.bean.dto.PatentDto;
import com.nyzs.achieve.bean.vo.PaperVo;
import com.nyzs.achieve.dao.PaperDao;
import com.nyzs.achieve.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/10/17 9:44
 */
@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    PaperDao paperDao;

    @Override
    public List<PaperDto> getPaper(String paperName, String author, String status, String project, String startDate, String endDate) throws Exception {
        return paperDao.getPaper(paperName, author, status, project, startDate, endDate);
    }

    @Override
    public PaperDto getPaperByName(String paperName) throws Exception {
        return paperDao.getPaperByName(paperName);
    }

    @Override
    public void insertPaperInfo(PaperVo paperVo) throws Exception {
        PaperDto paperDto = new PaperDto(paperVo.getPaperName(),
                paperVo.getAuthor(),
                paperVo.getjournal(),
                paperVo.getProject(),
                paperVo.getStatusDate(),
                paperVo.getStatus(),
                paperVo.getApproval(),
                paperVo.getApprovalStoragePath(),
                paperVo.getPaperChn(),
                paperVo.getPaperChnStoragePath(),
                paperVo.getPaperEng(),
                paperVo.getPaperEngStoragePath(),
                paperVo.getScanFile(),
                paperVo.getScanFileStoragePath(),
                paperVo.getSearchProof(),
                paperVo.getSearchProofStoragePath());

        if(paperDao.getPaperByName(paperVo.getPaperName()) != null) {
            System.out.println("update:" + paperDto);
            paperDao.updatePaperInfo(paperDto);
        } else {
            paperDao.insertPaperInfo(paperDto);
        }

    }

    @Override
    public void deletePaperById(Integer id) throws Exception {
        paperDao.deletePaperById(id);
    }
}
