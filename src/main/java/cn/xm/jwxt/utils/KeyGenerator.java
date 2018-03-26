package cn.xm.jwxt.utils;

import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: qlq
 * @Description
 * @Date: 22:49 2018/3/25
 */
public class KeyGenerator implements org.springframework.cache.interceptor.KeyGenerator {
    @Override
    public Object generate(Object o, Method method, Object... params) {
        //规定  本类名+方法名+参数名 为key
        StringBuilder sb = new StringBuilder();
        sb.append(o.getClass().getName());
        sb.append(method.getName());
        for (Object param : params) {
            sb.append(param.toString());
        }
        return sb.toString();
    }
}
