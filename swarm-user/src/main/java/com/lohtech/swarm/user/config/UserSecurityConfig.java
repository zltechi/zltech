package com.lohtech.swarm.user.config;

import com.lohtech.swarm.security.config.SecurityConfig;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@EnableWebSecurity  // 启用 Web 安全，否则不生效
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UserSecurityConfig extends SecurityConfig {
}
