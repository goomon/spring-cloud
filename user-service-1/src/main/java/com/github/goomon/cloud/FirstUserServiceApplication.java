package com.github.goomon.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstUserServiceApplication.class, args);
    }

}
