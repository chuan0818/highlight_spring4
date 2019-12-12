package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 编写拦截规则的注解(自定义注解)
 * @author zhuzc
 * @createDate 2018年12月2日
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) //Retention保留
@Documented
public @interface Action {
	String name();
}
