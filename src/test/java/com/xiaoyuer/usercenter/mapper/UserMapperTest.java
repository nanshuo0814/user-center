package com.xiaoyuer.usercenter.mapper;


import com.xiaoyuer.usercenter.model.domain.User;
import com.xiaoyuer.usercenter.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserMapperTest {

    @Resource
    private UserService userService;

    @Test
    void test() {
        User user = new User();
        user.setUsername("小鱼儿");
        user.setUserAccount("xiaoyuer");
        user.setAvatarUrl("https://example.com/");
        user.setGender(0);
        user.setUserPassword("xiaoyuer");
        user.setPhone("123");
        user.setEmail("123@qq.com");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);

    }
}