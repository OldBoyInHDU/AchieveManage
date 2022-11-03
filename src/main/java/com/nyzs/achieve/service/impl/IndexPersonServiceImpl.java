package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.IndexTrainingDto;
import com.nyzs.achieve.bean.vo.IndexTrainingVo;
import com.nyzs.achieve.dao.IndexPersonDao;
import com.nyzs.achieve.service.IndexPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：人才培养Service
 * @date ：2022/11/3 12:34
 */

@Service
public class IndexPersonServiceImpl implements IndexPersonService {

    @Autowired
    private IndexPersonDao indexPersonDao;

    @Override
    public List<IndexTrainingDto> getTrainings() throws Exception {
        return indexPersonDao.getTrainings();
    }

    @Override
    public IndexTrainingDto getTrainingById(Integer id) throws Exception {
        return indexPersonDao.getTrainingById(id);
    }

    @Override
    public void deleteTrainingById(Integer id) throws Exception {
        indexPersonDao.deleteTrainingById(id);
    }

    @Override
    public void submitTrainingInfo(IndexTrainingVo indexTrainingVo) throws Exception {
        IndexTrainingDto indexTrainingDto = new IndexTrainingDto();
        indexTrainingDto.setTitle(indexTrainingVo.getTitle());
        indexTrainingDto.setContent(indexTrainingVo.getContent());
        indexTrainingDto.setStatusDate(indexTrainingVo.getStatusDate());
        indexTrainingDto.setImgName(indexTrainingVo.getImgName());
        indexTrainingDto.setImgStoragePath(indexTrainingVo.getImgStoragePath());

        if (indexPersonDao.getTrainingById(indexTrainingVo.getId()) != null) {
            indexTrainingDto.setId(indexTrainingVo.getId());
            System.out.println("update:" + indexTrainingDto);
            indexPersonDao.updateTrainingInfo(indexTrainingDto);
        } else {
            System.out.println("insert:" + indexTrainingDto);
            indexPersonDao.insertTrainingInfo(indexTrainingDto);
        }
    }
}
