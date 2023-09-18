package com.charcl.study.bean.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	public LogAspect(){
		System.out.println("LogAspect...");
	}

	@Before("execution(* org.springframework.bean.aop.HelloService.sayHello(..))")
	public void logStart(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println("logStart()==>"+name+"....[args]");
	}

//	@AfterReturning(value = "execution(* org.springframework.bean.aop.HelloService.sayHello(..))",returning = )
	public void logReturn(JoinPoint joinPoint,Object result){
		String name = joinPoint.getSignature().getName();
		System.out.println("logReturn==>"+name+"...args");
	}
}
