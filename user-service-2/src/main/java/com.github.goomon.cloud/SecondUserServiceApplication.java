package com.github.goomon.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecondUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondUserServiceApplication.class, args);
    }

}
