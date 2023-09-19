package com.charcl.study.bean.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

	public HelloService(){
		System.out.println();
	}

	public String sayHello(){
		String result="hello,world";
		System.out.println(result);
		return result+"---"+result.length();
	}
}
