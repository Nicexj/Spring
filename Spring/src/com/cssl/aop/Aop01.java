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

//��������
//ע��Spring����
@Aspect
@Component
public class Aop01 {
	
	@Pointcut("execution(public * com.spring.service..*.*(..))")   //�����
	public void cut() {}
	
	//ǰ��֪ͨ
	@Before("cut()")
	public void bean() {
		System.out.println("ǰ��֪ͨ");
	}
	
	//������ǿ
	@After("cut()")
	public void after() {
		System.out.println("����֪ͨ");
	}
	
	//����֪ͨ
		@AfterReturning("cut()")
		public void afterReturning() {
			System.out.println("����֪ͨ");
		}
		
		//����֪ͨ
		@AfterThrowing("cut()")
		public void afterThrowing() {
			System.out.println("�쳣֪ͨ");
		}
		
		//����֪ͨ
		@Around("cut()")
		public void around(ProceedingJoinPoint p) throws Throwable {
			System.out.println("����֪ͨǰ***************");
			//�����ø÷���  ���߹�ע�㷽��
			p.proceed();
			System.out.println("***************����֪ͨ��");
		}
}
