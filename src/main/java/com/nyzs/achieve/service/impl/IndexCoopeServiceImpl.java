package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.IndexCoopeDto;
import com.nyzs.achieve.bean.vo.IndexCoopeVo;
import com.nyzs.achieve.dao.IndexCoopeDao;
import com.nyzs.achieve.service.IndexCoopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/11/3 9:12
 */

@Service
public class IndexCoopeServiceImpl implements IndexCoopeService {

    @Autowired
    private IndexCoopeDao indexCoopeDao;

    @Override
    public List<IndexCoopeDto> getCoopes() throws Exception {
        return indexCoopeDao.getCoopes();
    }

    @Override
    public IndexCoopeDto getCoopeById(Integer id) throws Exception {
        return indexCoopeDao.getCoopeById(id);
    }

    @Override
    public void submitCoopeInfo(IndexCoopeVo indexCoopeVo) throws Exception {
        IndexCoopeDto indexCoopeDto = new IndexCoopeDto();
        indexCoopeDto.setTitle(indexCoopeVo.getTitle());
        indexCoopeDto.setContent(indexCoopeVo.getContent());
        indexCoopeDto.setStatusDate(indexCoopeVo.getStatusDate());
        indexCoopeDto.setImgName(indexCoopeVo.getImgName());
        indexCoopeDto.setImgStoragePath(indexCoopeVo.getImgStoragePath());

        if (indexCoopeDao.getCoopeById(indexCoopeVo.getId()) != null) {
            indexCoopeDto.setId(indexCoopeVo.getId());
            System.out.println("update:" + indexCoopeDto);
            indexCoopeDao.updateCoopeInfo(indexCoopeDto);
        } else {
            System.out.println("insert:" + indexCoopeDto);
            indexCoopeDao.insertCoopeInfo(indexCoopeDto);
        }
    }

    @Override
    public void deleteCoopeById(Integer id) throws Exception {
        indexCoopeDao.deleteCoopeById(id);
    }
}
