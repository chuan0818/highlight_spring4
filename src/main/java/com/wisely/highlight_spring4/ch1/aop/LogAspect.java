package com.wisely.highlight_spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 配置切面 Aspect
 * @author zhuzc
 * @createDate 2018年12月2日
 */
@Aspect  //切面注解
@Component
public class LogAspect {
	
	
	//1.基于注解的切面配置(切面--将切点和通知绑定到一起)
	//1.1配置注解切点PointCut 【将自定义注解Action与切点绑定到一起。使用注解Action就会被拦截到】
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
	public void annotationPointCut() {}
	//1.2将切点PointCut与通知Advice绑定
	@After("annotationPointCut()") //配置了@PointCut注解的方法
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截:" + action.name());
	}
	
	
	//2.基于方法规则匹配的切面(execution拦截切点)
	@Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截," + method.getName());
	}
}
