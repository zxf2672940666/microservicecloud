package com.pa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.pa"})
public class DeptConsumer80_Fegin_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Fegin_App.class,args);
    }
}
