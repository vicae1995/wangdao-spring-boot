package com.example.demo04.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-20:11
 */
@Data
@Component
@ConfigurationProperties(prefix = "db")
public class DataSourceProperties {

    String driverClassName;
    String url;
    String username;
    String password;
}
