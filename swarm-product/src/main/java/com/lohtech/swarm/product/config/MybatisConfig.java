package com.lohtech.swarm.product.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"com.lohtech.swarm.model.product.mapper", "com.lohtech.swarm.product.dao"})
public class MybatisConfig {

//    @Bean
//    public SqlSessionFactory localhostSqlSessionFactory(@Qualifier("DataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//        // 因为 new 了一个 SqlSessionFactoryBean 所以 yml 的 mapper-locations 的配置没有用，需要手动配置扫描的包
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactory.setMapperLocations(resolver.getResources("classpath*:/dao/*.xml"));
//        // 设置扫描的实体包
//        sqlSessionFactory.setTypeAliasesPackage("com.lohtech.swarm.model.product.mapper");
//        sqlSessionFactory.setDataSource(dataSource);
//        return sqlSessionFactory.getObject();
//    }
}
