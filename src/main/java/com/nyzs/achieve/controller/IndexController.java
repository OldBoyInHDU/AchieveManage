package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.BannerDto;
import com.nyzs.achieve.bean.dto.File;
import com.nyzs.achieve.bean.dto.QIDto;
import com.nyzs.achieve.bean.vo.QIVo;
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
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/getBanners", method = RequestMethod.GET)
    public ResponseResult getBanners() {
        try {
            List<BannerDto> fileList = bannerService.getBanners();
            System.out.println(fileList);
            return ResponseResult.ok(fileList, "项目查询成功");
        } catch (Exception e) {
            logger.error("项目查询错误", e);
            return ResponseResult.failed(e.getMessage(), "项目查询失败");
        }
    }
    @RequestMapping(value = "/submitBannerInfo", method = RequestMethod.POST)
    public ResponseResult submitBannerInfo(
            String uploadListJson
    ) {
        try {
//            System.out.println("qiVo:" + qiVo);
            bannerService.submitBannerInfo(uploadListJson);
            return ResponseResult.ok("项目登记成功");
        } catch (Exception e) {
            logger.error("项目提交错误", e);
            return ResponseResult.failed(e.getMessage(), "项目登记失败");
        }
    }

    @RequestMapping(value = "/deleteBannerById", method = RequestMethod.DELETE)
    public ResponseResult deleteBannerById(Integer id) {
        try {
            bannerService.deleteBannerById(id);
        } catch (Exception e) {
            logger.error("项目删除错误", e);
            return ResponseResult.failed(e.getMessage(), "项目删除失败");
        }
        return ResponseResult.ok("项目删除成功");
    }
}
