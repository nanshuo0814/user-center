package com.xiaoyuer.usercenter.controller;

import com.xiaoyuer.usercenter.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户接口
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 你好
     * 测试接口
     *
     * @return {@code String}
     */
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
