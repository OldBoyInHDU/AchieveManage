package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.RightDto;
import com.nyzs.achieve.bean.vo.RightVo;
import com.nyzs.achieve.dao.RightDao;
import com.nyzs.achieve.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：right service
 * @date ：2022/10/20 14:08
 */
@Service
public class RightServiceImpl implements RightService {

    @Autowired
    RightDao rightDao;

    @Override
    public List<RightDto> getRight(String rightName, String author, String status, String project, String startDate, String endDate) throws Exception {
        return rightDao.getRight(rightName, author, status, project, startDate, endDate);
    }

    @Override
    public RightDto getRightById(Integer id) throws Exception {
        return rightDao.getRightById(id);
    }

    @Override
    public void insertRightInfo(RightVo rightVo) throws Exception {
        RightDto rightDto = new RightDto(
                rightVo.getRightName(),
                rightVo.getAuthor(),
                rightVo.getProject(),
                rightVo.getStatusDate(),
                rightVo.getStatus(),
                rightVo.getApplication(),
                rightVo.getAppStoragePath(),
                rightVo.getManual(),
                rightVo.getManualStoragePath(),
                rightVo.getCodes(),
                rightVo.getCodesStoragePath(),
                rightVo.getScanFile(),
                rightVo.getScanFileStoragePath()
        );

        if(rightDao.getRightByName(rightVo.getRightName()) != null) {
            System.out.println("update:" + rightDto);
            rightDao.updateRightInfo(rightDto);
        } else {
            System.out.println("insert:" + rightDto);
            rightDao.insertRightInfo(rightDto);
        }

    }

    @Override
    public void deleteRightById(Integer id) throws Exception {
        rightDao.deleteRightById(id);
    }
}
