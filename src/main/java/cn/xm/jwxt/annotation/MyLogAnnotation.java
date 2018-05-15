package cn.xm.jwxt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: qlq
 * @Description 日志注解(自定义注解实现日志功能)
 * @Date: 20:08 2018/4/9
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLogAnnotation {
    String operateDescription();// 记录日志的操作类型，不写默认值就是一个必须填的注解
}
