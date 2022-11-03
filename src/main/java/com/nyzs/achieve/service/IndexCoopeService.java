package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.IndexCoopeDto;
import com.nyzs.achieve.bean.vo.IndexCoopeVo;

import java.util.List;

public interface IndexCoopeService {
    List<IndexCoopeDto> getCoopes() throws Exception;

    IndexCoopeDto getCoopeById(Integer id) throws Exception;

    void submitCoopeInfo(IndexCoopeVo indexCoopeVo) throws Exception;

    void deleteCoopeById(Integer id) throws Exception;
}
