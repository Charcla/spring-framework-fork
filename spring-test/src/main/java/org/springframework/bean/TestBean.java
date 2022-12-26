package org.springframework.bean;

import org.junit.Test;
import org.springframework.bean.aop.HelloService;
import org.springframework.bean.config.*;
import org.springframework.bean.proxy.UserService;
import org.springframework.bean.beanPost.CService;
import org.springframework.bean.selector.Bee;
import org.springframework.bean.selector.Dog;
import org.springframework.bean.threecache.Cat;
import org.springframework.bean.threecache.HelloFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

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
