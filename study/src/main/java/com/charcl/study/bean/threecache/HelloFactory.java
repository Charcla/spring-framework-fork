package com.charcl.study.bean.threecache;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class HelloFactory implements SmartFactoryBean<Cat> {

	private String name="helloFactory";

	@Override
	public Cat getObject() throws Exception {
		return new Cat();
	}

	@Override
	public Class<?> getObjectType() {
		return Cat.class;
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}
}
