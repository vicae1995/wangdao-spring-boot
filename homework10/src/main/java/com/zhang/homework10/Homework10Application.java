package com.zhang.homework10;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhang.homework10.mapper")
@SpringBootApplication
public class Homework10Application {

  public static void main(String[] args) {
    SpringApplication.run(Homework10Application.class, args);
  }
}
