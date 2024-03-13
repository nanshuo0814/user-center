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
    long userRegister(String userAccount, String userPassword, String checkPassword);

}
