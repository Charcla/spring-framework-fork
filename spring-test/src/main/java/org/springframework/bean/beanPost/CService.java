package org.springframework.bean.beanPost;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jmx.export.assembler.MetadataMBeanInfoAssembler;
import org.springframework.stereotype.Component;

@Component
public class CService implements ApplicationContextAware{

	private ApplicationContext applicationContext;

	private String name="zhangsan";

	public CService(){
		System.out.println("shilihua....");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}

//	@Override
//	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//
//		System.out.println("实例化前:"+beanName);
//
//		return null;
//	}


}
