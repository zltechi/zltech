package com.lohtech.swarm.portal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.lohtech.swarm.model.portal.mapper", "com.lohtech.swarm.portal.dao"})
public class MyBatisConfig {
}
