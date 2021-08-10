package com.zhang.demo02.bean;

import lombok.Data;

/**
 * @author ：vicae
 * @description：
 * @create ：2021-08-09-19:42
 */
@Data
public class BaseRespVo<T> {
    T data;
    String msg;//告诉前端请求的消息
    long errno;//自己的前后端应用 ： 自定义的状态码 → 通常前端根据该状态码做不同的处理

    public static BaseRespVo ok(){
        BaseRespVo<Object> baseRespVo = new BaseRespVo<>();
        baseRespVo.setErrno(0);
        baseRespVo.setMsg("成功");
        return baseRespVo;
    }
    public static BaseRespVo ok(Object data){
        BaseRespVo<Object> baseRespVo = new BaseRespVo<>();
        baseRespVo.setData(data);
        baseRespVo.setErrno(0);
        baseRespVo.setMsg("成功");
        return baseRespVo;
    }
    public static BaseRespVo ok(Object data, String msg){
        BaseRespVo<Object> baseRespVo = new BaseRespVo<>();
        baseRespVo.setData(data);
        baseRespVo.setErrno(0);
        baseRespVo.setMsg(msg);
        return baseRespVo;
    }
    public static BaseRespVo fail(){
        BaseRespVo<Object> baseRespVo = new BaseRespVo<>();
        baseRespVo.setErrno(500);
        baseRespVo.setMsg("失败");
        return baseRespVo;
    }
    public static BaseRespVo fail(String msg){
        BaseRespVo<Object> baseRespVo = new BaseRespVo<>();
        baseRespVo.setErrno(500);
        baseRespVo.setMsg(msg);
        return baseRespVo;
    }
}
