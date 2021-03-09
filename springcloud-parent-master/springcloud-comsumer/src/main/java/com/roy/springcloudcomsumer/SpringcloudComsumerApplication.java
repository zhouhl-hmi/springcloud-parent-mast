package com.roy.springcloudcomsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan(basePackages = {"com.roy.springcloudcommons.fallback"})
@EnableFeignClients(basePackages={"com.roy.springcloudcommons.service"})
@SpringBootApplication
public class SpringcloudComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudComsumerApplication.class, args);
    }

}
