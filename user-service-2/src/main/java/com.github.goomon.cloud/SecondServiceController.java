package com.github.goomon.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecondServiceController {
    @GetMapping("/second-service/welcome")
    public String welcome() {
        return "Welcome to second service.";
    }
}
