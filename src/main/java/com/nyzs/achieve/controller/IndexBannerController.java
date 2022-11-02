package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.BannerDto;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.BannerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：轮播图 Controller
 * @date ：2022/11/2 9:39
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/index")
@RestController
public class IndexBannerController {

    private static Logger logger = LoggerFactory.getLogger(IndexBannerController.class);

    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/getBanners", method = RequestMethod.GET)
    public ResponseResult getBanners() {
        try {
            List<BannerDto> fileList = bannerService.getBanners();
            System.out.println(fileList);
            return ResponseResult.ok(fileList, "轮播图查询成功");
        } catch (Exception e) {
            logger.error("轮播图查询错误", e);
            return ResponseResult.failed(e.getMessage(), "轮播图查询失败");
        }
    }

    @RequestMapping(value = "/submitBannerInfo", method = RequestMethod.POST)
    public ResponseResult submitBannerInfo(
            String uploadListJson
    ) {
        try {
//            System.out.println("qiVo:" + qiVo);
            bannerService.submitBannerInfo(uploadListJson);
            return ResponseResult.ok("轮播图登记成功");
        } catch (Exception e) {
            logger.error("轮播图提交错误", e);
            return ResponseResult.failed(e.getMessage(), "轮播图登记失败");
        }
    }

    @RequestMapping(value = "/deleteBannerById", method = RequestMethod.DELETE)
    public ResponseResult deleteBannerById(Integer id) {
        try {
            bannerService.deleteBannerById(id);
        } catch (Exception e) {
            logger.error("轮播图删除错误", e);
            return ResponseResult.failed(e.getMessage(), "轮播图删除失败");
        }
        return ResponseResult.ok("轮播图删除成功");
    }
}
