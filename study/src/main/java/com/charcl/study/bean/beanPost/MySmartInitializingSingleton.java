package com.charcl.study.bean.beanPost;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

//@Component
public class MySmartInitializingSingleton implements InitializingBean {

	public MySmartInitializingSingleton(){
		System.out.println();
	}

	@PostConstruct
	public void invokePostConstruct(){
		System.out.println("invokePostConstruct");
	}

//	@Override
//	public void afterSingletonsInstantiated() {
//		System.out.println("SmartInitializingSingleton");
//	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean");
	}
}
