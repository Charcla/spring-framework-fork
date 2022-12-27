package com.charcl.study.bean;

import com.charcl.study.bean.aop.HelloService;
import com.charcl.study.bean.beanPost.CService;
import com.charcl.study.bean.config.*;
import com.charcl.study.bean.proxy.UserService;
import com.charcl.study.bean.selector.Bee;
import com.charcl.study.bean.selector.Dog;
import com.charcl.study.bean.threecache.Cat;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBean {

	@Test
	public void test(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig5.class);
//		BeanDefinition bookService = context.getBeanDefinition("lalala");
		System.out.println();
	}

	@Test
	public void beanDefinitionTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		BeanDefinition bookService = context.getBeanDefinition("lalala");
		UserService userService=context.getBean(UserService.class);
		userService.test();
		System.out.println(userService);
	}

	@Test
	public void jdbcTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService=context.getBean(UserService.class);
		userService.test();
		System.out.println(userService);
	}

	@Test
	public void threeCacheTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
//		CService cService = context.getBean(CService.class);
//		System.out.println(cService);

		Object helloFactory1 = context.getBean("helloFactory");
		Object helloFactory = context.getBean("&helloFactory");
		Cat cat = context.getBean(Cat.class);

		System.out.println(cat);
		System.out.println(helloFactory);

	}

	@Test
	public void beanPostTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig4.class);

		CService bean = context.getBean(CService.class);
		System.out.println();

	}

	@Test
	public void selectorTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Selector.class);

		Dog bean = context.getBean(Dog.class);
		Bee bee = context.getBean(Bee.class);
		System.out.println();

	}

	@Test
	public void aopTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopOpenConfig.class);

		HelloService bean = context.getBean(HelloService.class);
		bean.sayHello();
		System.out.println();

	}
}
