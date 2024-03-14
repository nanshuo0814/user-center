package com.nanshuo.usercenter.contant;

/**
 * 用户常量
 */
public interface UserConstant {

    /**
     * 盐值，混淆密码
     */
    String SALT = "ydg";

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "userLoginState";

    //  ------- 权限 --------

    /**
     * 默认权限
     */
    int DEFAULT_ROLE = 0;

    /**
     * 管理员权限
     */
    int ADMIN_ROLE = 1;

}
