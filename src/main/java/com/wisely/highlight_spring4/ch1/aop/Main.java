package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试AOP  测试基于纯注解或方法规则配置方式AOP配置
 * @author zhuzc
 * @createDate 2018年12月2日
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
		
		demoAnnotationService.add();
		demoMethodService.add();
		context.close();
	}

}
