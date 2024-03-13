package com.xiaoyuer.usercenter.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoyuer.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户帐户
     * @param userPassword  用户密码
     * @param checkPassword 检查密码
     * @return long
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     *
     * @param userAccount  用户帐户
     * @param userPassword 用户密码
     * @param request      请求
     * @return {@code User}
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取安全用户
     *
     * @param originUser 原始用户
     * @return {@code User}
     */
    User getSafetyUser(User originUser);


}
