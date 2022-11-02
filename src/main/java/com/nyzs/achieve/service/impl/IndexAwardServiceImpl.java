package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.IndexAwardDto;
import com.nyzs.achieve.bean.vo.IndexAwardVo;
import com.nyzs.achieve.dao.IndexAwardDao;
import com.nyzs.achieve.service.IndexAwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：首页-奖励荣誉
 * @date ：2022/11/2 13:19
 */
@Service
public class IndexAwardServiceImpl implements IndexAwardService {

    @Autowired
    private IndexAwardDao indexAwardDao;

    @Override
    public List<IndexAwardDto> getAwards() throws Exception {
        return indexAwardDao.getAwards();
    }

    @Override
    public IndexAwardDto getAwardById(Integer id) throws Exception {
        return indexAwardDao.getAwardById(id);
    }

    @Override
    public void submitAwardInfo(IndexAwardVo indexAwardVo) throws Exception {
        IndexAwardDto indexAwardDto = new IndexAwardDto();
        indexAwardDto.setProject(indexAwardVo.getProject());
        indexAwardDto.setAwardee(indexAwardVo.getAwardee());
        indexAwardDto.setStatusDate(indexAwardVo.getStatusDate());
        indexAwardDto.setAward(indexAwardVo.getAward());
        indexAwardDto.setImgName(indexAwardVo.getImgName());
        indexAwardDto.setImgStoragePath(indexAwardVo.getImgStoragePath());

        if (indexAwardDao.getAwardById(indexAwardVo.getId()) != null) {
            indexAwardDto.setId(indexAwardVo.getId());
            System.out.println("update:" + indexAwardDto);
            indexAwardDao.updateAwardInfo(indexAwardDto);
        } else {
            System.out.println("insert:" + indexAwardDto);
            indexAwardDao.insertAwardInfo(indexAwardDto);
        }
    }

    @Override
    public void deleteAwardById(Integer id) throws Exception {
        indexAwardDao.deleteAwardById(id);
    }
}
