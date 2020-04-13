package com.sk.yiqingmvc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class YiqingmvcApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testDate(){
        Date date = new Date("Wed Apr 08 2020 17:16:19 GMT+0800 (中国标准时间)");
    }
}
