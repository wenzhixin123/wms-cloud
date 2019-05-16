package com.xc.wms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.xc.wms.mapper")
@EnableTransactionManagement
public class WmsSysWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsSysWebApplication.class, args);
    }

}
