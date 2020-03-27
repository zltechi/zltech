package com.lohtech.swarm.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SwarmPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwarmPortalApplication.class, args);
    }

}
