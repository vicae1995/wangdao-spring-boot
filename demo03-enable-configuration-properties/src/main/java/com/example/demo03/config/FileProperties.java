package com.example.demo03.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-20:39
 */
@Data
@ConfigurationProperties(prefix = "file")
public class FileProperties {
    String path;
}
