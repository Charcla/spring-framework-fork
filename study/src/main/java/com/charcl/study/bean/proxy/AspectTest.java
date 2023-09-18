package com.charcl.study.bean.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest {

	@Before("execution(public void org.springframework.bean.proxy.UserService.test())")
	public void before(JoinPoint joinPoint){
		System.out.println("before .....");
	}

}
