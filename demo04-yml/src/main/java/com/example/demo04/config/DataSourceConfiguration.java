package com.example.demo04.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-20:12
 */
@Configuration
@EnableConfigurationProperties({DataSourceProperties.class,FileProperties.class})
public class DataSourceConfiguration {

    DataSourceProperties dataSourceProperties;
    FileProperties fileProperties;

    public DataSourceConfiguration(DataSourceProperties dataSourceProperties, FileProperties fileProperties) {
        this.dataSourceProperties = dataSourceProperties;
        this.fileProperties = fileProperties;
    }

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        dataSource.setUrl(dataSourceProperties.getUrl());
        dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());
        return dataSource;
    }
}
