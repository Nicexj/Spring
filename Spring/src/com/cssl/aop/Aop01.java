package com.cssl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//定义切面
//注入Spring容器
@Aspect
@Component
public class Aop01 {
	
	@Pointcut("execution(public * com.spring.service..*.*(..))")   //切入点
	public void cut() {}
	
	//前置通知
	@Before("cut()")
	public void bean() {
		System.out.println("前置通知");
	}
	
	//后置增强
	@After("cut()")
	public void after() {
		System.out.println("后置通知");
	}
	
	//运行通知
		@AfterReturning("cut()")
		public void afterReturning() {
			System.out.println("运行通知");
		}
		
		//运行通知
		@AfterThrowing("cut()")
		public void afterThrowing() {
			System.out.println("异常通知");
		}
		
		//环绕通知
		@Around("cut()")
		public void around(ProceedingJoinPoint p) throws Throwable {
			System.out.println("环绕通知前***************");
			//不调用该方法  则不走关注点方法
			p.proceed();
			System.out.println("***************环绕通知后");
		}
}
