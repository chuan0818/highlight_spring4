package com.wisely.highlight_spring4.ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		DemoSingletonService demoSingletonService01 = context.getBean(DemoSingletonService.class);
		DemoSingletonService demoSingletonSerivce02 = context.getBean(DemoSingletonService.class);
		
		DemoPrototypeService demoPrototypeService01 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService dmeoPrototypeService02 = context.getBean(DemoPrototypeService.class);
		
		System.out.println("demoSingletonService01与demoSingletonSerivce02是否相等:" +demoSingletonService01.equals(demoSingletonSerivce02));
		System.out.println("demoPrototypeService01与dmeoPrototypeService02是否相等:" +demoPrototypeService01.equals(dmeoPrototypeService02));
	}
}
