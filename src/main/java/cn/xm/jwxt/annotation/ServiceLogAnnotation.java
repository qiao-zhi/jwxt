package cn.xm.jwxt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: qlq
 * @Description 日志注解，将来有需要的话使用
 * @Date: 20:08 2018/4/9
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceLogAnnotation {
}
