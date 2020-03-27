package com.lohtech.swarm.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SwarmUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwarmUserApplication.class, args);
    }

}
