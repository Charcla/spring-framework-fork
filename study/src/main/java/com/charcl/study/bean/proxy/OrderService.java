package com.charcl.study.bean.proxy;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

	public void order(){
		System.out.println("order....");
	}
}
