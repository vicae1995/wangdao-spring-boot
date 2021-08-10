package com.zhang.homework10.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-23:17
 */
public interface AccountMapper {

    Integer selectMoney(@Param("username") String username);

    Integer update(@Param("username") String username,
               @Param("money") Integer money);
}
