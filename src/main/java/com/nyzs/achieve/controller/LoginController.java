package com.nyzs.achieve.controller;

import com.nyzs.achieve.Utils.JwtUtils;
import com.nyzs.achieve.bean.dto.User;
import com.nyzs.achieve.bean.vo.HttpEnum;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：RukiHuang
 * @description：UserController
 * @date ：2022/9/20 8:17
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserService userService;

    @Autowired
    JwtUtils jwtUtils;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseResult login(String account, String password) {
        User user = null;
        try {
            user = userService.getByAccount(account);
            if (user == null || !user.getPassword().equals(password)) {
                return ResponseResult.failed(HttpEnum.ERROR_600, "账号密码错误");
            } else {
                User responseUser = new User(user.getId(), user.getAccount(), user.getUsername());
                return ResponseResult.ok(responseUser, "登陆成功");
            }
        } catch (Exception e) {
            logger.error("登陆失败", e);
            return ResponseResult.failed(HttpEnum.ERROR_500, "程序内部错误");
        }

    }
}
