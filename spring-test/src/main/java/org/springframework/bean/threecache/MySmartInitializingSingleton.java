package org.springframework.bean.threecache;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MySmartInitializingSingleton implements SmartInitializingSingleton {

	@PostConstruct
	public void invokePostConstruct(){
		System.out.println("invokePostConstruct");
	}

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("SmartInitializingSingleton");
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("InitializingBean");
//	}
}
