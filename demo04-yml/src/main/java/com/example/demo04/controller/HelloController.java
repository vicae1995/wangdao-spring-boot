package com.example.demo04.controller;

import com.example.demo04.bean.BaseRespVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-19:51
 */
@RestController
public class HelloController {

    @Autowired
    DataSource dataSource;

    @RequestMapping("hello")
    public BaseRespVo hello() {
        return BaseRespVo.ok("hello Ferrari");
    }

}
