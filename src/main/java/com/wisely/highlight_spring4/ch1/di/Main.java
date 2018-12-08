package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 通过Java配置文件启动spring环境
 * @author zhuzc
 * @createDate 2018年12月2日
 */
public class Main {
	public static void main(String[] args) {
		//注解配置应用上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("竹枝词"));
		
		//关闭应用上下文
		context.close();
	}
}
