package com.xuecx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EruekaClientApplication {
    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(EruekaClientApplication.class, args);
    }

    @RequestMapping("/hi")
    public String hi(String name) {
        return "hi " + name + ",i am port " + port;
    }
}
