package com.lohtech.swarm.portal.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients("com.lohtech.swarm.portal.feign")
public class FeignConfig {
}
