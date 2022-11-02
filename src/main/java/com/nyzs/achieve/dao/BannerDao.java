package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.BannerDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BannerDao {
    List<BannerDto> getBanners() throws Exception;

    void insertBannerInfo(String imgName, String imgStoragePath) throws Exception;

    void deleteBannerById(Integer id) throws Exception;
}
