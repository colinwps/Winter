package com.colinapp.winter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(scanBasePackages = {"com.colinapp.winter"})
@MapperScan(value = "com.colinapp.winter.mapper")
public class WinterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WinterApplication.class, args);
    }

}
