package com.lohtech.swarm.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SwarmGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwarmGatewayApplication.class, args);
    }

}
