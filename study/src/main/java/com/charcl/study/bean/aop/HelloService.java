package com.charcl.study.bean.aop;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

	public String sayHello(){
		String result="hello,world";
		System.out.println(result);
		return result+"---"+result.length();
	}
}
