package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Java配置类 等同于 xml配置 @Configuration
 * 通过@Import({AspectJAutoProxyRegistrar.class})导入AspectJ的默认配置
 * @author zhuzc
 * @createDate 2018年12月2日
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy //使能AspectJ自动代理
public class AopConfig {

}
