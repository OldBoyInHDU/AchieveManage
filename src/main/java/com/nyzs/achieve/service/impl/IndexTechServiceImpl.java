package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.IndexTechDto;
import com.nyzs.achieve.bean.vo.IndexTechVo;
import com.nyzs.achieve.dao.IndexTechDao;
import com.nyzs.achieve.service.IndexTechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：index 科技创新Service
 * @date ：2022/11/3 8:27
 */
@Service
public class IndexTechServiceImpl implements IndexTechService {

    @Autowired
    private IndexTechDao indexTechDao;

    @Override
    public List<IndexTechDto> getTechs() throws Exception {
        return indexTechDao.getTechs();
    }

    @Override
    public IndexTechDto getTechById(Integer id) throws Exception {
        return indexTechDao.getTechById(id);
    }

    @Override
    public void submitTechInfo(IndexTechVo indexTechVo) throws Exception {
        IndexTechDto indexTechDto = new IndexTechDto();
        indexTechDto.setProject(indexTechVo.getProject());
        indexTechDto.setContent(indexTechVo.getContent());
        indexTechDto.setType(indexTechVo.getType());
        indexTechDto.setStatusDate(indexTechVo.getStatusDate());

        if (indexTechDao.getTechById(indexTechVo.getId()) != null) {
            indexTechDto.setId(indexTechVo.getId());
            System.out.println("update:" + indexTechDto);
            indexTechDao.updateTechInfo(indexTechDto);
        } else {
            System.out.println("insert:" + indexTechDto);
            indexTechDao.insertTechInfo(indexTechDto);
        }
    }

    @Override
    public void deleteTechById(Integer id) throws Exception {
        indexTechDao.deleteTechById(id);
    }
}
