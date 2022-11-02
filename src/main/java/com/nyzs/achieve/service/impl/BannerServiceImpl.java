package com.nyzs.achieve.service.impl;

import com.alibaba.fastjson.JSON;
import com.nyzs.achieve.bean.dto.BannerDto;
import com.nyzs.achieve.bean.dto.File;
import com.nyzs.achieve.bean.dto.ImgFile;
import com.nyzs.achieve.dao.BannerDao;
import com.nyzs.achieve.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：轮播图 Service
 * @date ：2022/11/2 9:40
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerDao bannerDao;

    @Override
    public List<BannerDto> getBanners() throws Exception {
        return bannerDao.getBanners();
    }

    @Override
    public void submitBannerInfo(String uploadListJson) throws Exception {
        List<ImgFile> uploadList = JSON.parseArray(uploadListJson, ImgFile.class);
        for (int i = 0; i < uploadList.size(); i++) {
            String imgName = uploadList.get(i).getAlt();
            String imgStoragePath = uploadList.get(i).getUrl();
            bannerDao.insertBannerInfo(imgName, imgStoragePath);
        }
    }

    @Override
    public void deleteBannerById(Integer id) throws Exception {
        bannerDao.deleteBannerById(id);
    }
}
