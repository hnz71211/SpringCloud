package com.mengxuegu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by xiaoxi on 2019/8/6.
 */
@EnableHystrix //开启 Hystrix 熔断机制的支持
@EnableEurekaClient
@MapperScan("com.mengxuegu.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001_Hystrix {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_Hystrix.class, args);
    }

}
