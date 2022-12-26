package org.springframework.bean.threecache;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class DService {

	public DService(){
		System.out.println("Dservice shilihua....");
	}

	private AService aService;

	@Autowired
	public void setAService(AService aService){
		this.aService=aService;
	}

	public void test(){

	}
}
