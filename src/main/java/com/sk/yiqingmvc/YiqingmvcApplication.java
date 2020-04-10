package com.sk.yiqingmvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sk.**.dao")
public class YiqingmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiqingmvcApplication.class, args);
    }

}
