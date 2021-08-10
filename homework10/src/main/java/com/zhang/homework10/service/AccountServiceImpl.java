package com.zhang.homework10.service;

import com.zhang.homework10.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-23:17
 */

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountMapper accountMapper;

    @Transactional(isolation = Isolation.REPEATABLE_READ,rollbackFor = Exception.class)
    @Override
    public Integer transfer(String fromUsername, String destUsername, Integer money) {
        Integer fromMoney = accountMapper.selectMoney(fromUsername);
        Integer destMoney = accountMapper.selectMoney(destUsername);

        fromMoney -= money;
        destMoney += money;

        Integer update1 = accountMapper.update(fromUsername, fromMoney);
//        int i = 1 / 0;
        Integer update2 = accountMapper.update(destUsername, destMoney);

        if(update1 == 1 && update2 == 1){
            return 200;
        }
        else {
            return 404;
        }

    }
}
