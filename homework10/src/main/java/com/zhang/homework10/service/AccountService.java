package com.zhang.homework10.service;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-23:15
 */
public interface AccountService {
    Integer transfer(String fromUsername,String destUsername,Integer money);
}
