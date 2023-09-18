package com.charcl.study.bean;

import com.charcl.study.bean.config.AopConfig;
import com.charcl.study.bean.config.AppConfig5;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	@Test
	public void testAop(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
//		BeanDefinition bookService = context.getBeanDefinition("lalala");
		System.out.println();
		System.out.println(111);
	}
}
