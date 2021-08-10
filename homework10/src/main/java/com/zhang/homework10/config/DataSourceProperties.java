package com.zhang.homework10.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-22:48
 */
@Data
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceProperties {

    String driverClassName;
    String url;
    String username;
    String password;
}
