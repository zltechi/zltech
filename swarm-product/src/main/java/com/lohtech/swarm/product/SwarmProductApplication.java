package com.lohtech.swarm.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SwarmProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwarmProductApplication.class, args);
    }

}
