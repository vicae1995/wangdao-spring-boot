package com.example.demo04.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

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
