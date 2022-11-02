package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.BannerDto;

import java.util.List;

public interface BannerService {
    List<BannerDto> getBanners() throws Exception;

    void submitBannerInfo(String uploadListJson) throws Exception;

    void deleteBannerById(Integer id) throws Exception;
}
