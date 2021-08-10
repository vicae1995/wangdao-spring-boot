package com.zhang.homework10.controller;

import com.zhang.homework10.bean.BaseRespVo;
import com.zhang.homework10.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-23:23
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    AccountService accountService;
    @RequestMapping("transfer")
    public BaseRespVo transfer(String fromUsername,String destUsername,Integer money){
        Integer code = accountService.transfer(fromUsername, destUsername, money);

        if(code.equals(200)){
            return BaseRespVo.ok();
        }
        return BaseRespVo.fail();


    }


}
