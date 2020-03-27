package com.lohtech.swarm.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.lohtech.swarm.model.user.mapper", "com.lohtech.swarm.user.dao"})
public class MybatisConfig {
}
