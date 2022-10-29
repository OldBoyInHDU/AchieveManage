package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.CooperationDto;
import com.nyzs.achieve.bean.vo.CooperationVo;
import com.nyzs.achieve.dao.CooperationDao;
import com.nyzs.achieve.service.CooperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：合作 Service
 * @date ：2022/10/29 12:09
 */
@Service
public class CooperationServiceImpl implements CooperationService {
    
    @Autowired
    private CooperationDao cooperationDao;
    
    @Override
    public List<CooperationDto> getCooperations(String title, String type, String author, String startDate, String endDate) throws Exception {
        return cooperationDao.getCooperations(title, type, author, startDate, endDate);
    }

    @Override
    public void submitCooperationInfo(CooperationVo cooperationVo) throws Exception {
        CooperationDto cooperationDto = new CooperationDto();
        cooperationDto.setTitle(cooperationVo.getTitle());
        cooperationDto.setType(cooperationVo.getType());
        cooperationDto.setAuthor(cooperationVo.getAuthor());
        cooperationDto.setContent(cooperationVo.getContent());
        cooperationDto.setStatusDate(cooperationVo.getStatusDate());

        if(cooperationDao.getCooperationById(cooperationVo.getId()) != null) {
            cooperationDto.setId(cooperationVo.getId());
            System.out.println("update:" + cooperationDto);
            cooperationDao.updateCooperationInfo(cooperationDto);
        } else {
            System.out.println("insert:" + cooperationDto);
            cooperationDao.insertCooperationInfo(cooperationDto);
        }
    }

    @Override
    public CooperationDto getCooperationById(Integer id) throws Exception {
        return cooperationDao.getCooperationById(id);
    }

    @Override
    public void deleteCooperationById(Integer id) throws Exception {
        cooperationDao.deleteCooperationById(id);
    }
}
