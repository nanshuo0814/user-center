package com.nanshuo.usercenter;

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
        String encryptPassword = DigestUtils.md5DigestAsHex(("ydg" + "nanshuo").getBytes());
        System.out.println(encryptPassword);
    }



}
