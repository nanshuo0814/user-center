package com.xiaoyuer.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class UserCenterApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testDigestPassword() {
        String encryptPassword = DigestUtils.md5DigestAsHex(("ydg" + "xiaoyuer").getBytes());
        System.out.println(encryptPassword);
    }



}
