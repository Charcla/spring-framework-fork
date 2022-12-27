package com.charcl.study.bean.threecache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AService {

	public AService(){
		System.out.println("AService shilihua...");
	}

	private DService dService;

	@Autowired
	public void setDService(DService dService){
		this.dService=dService;
	}

	@PostConstruct
	public void test(){
		System.out.println("PostConstruct");
	}

//	@Resource
//	private BService bService1;

//	@Override
//	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//
//		System.out.println("这里进入到初始化前的操作");
//		return new AService();
//	}
}
