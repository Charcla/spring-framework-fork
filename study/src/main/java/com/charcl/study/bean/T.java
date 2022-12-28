package com.charcl.study.bean;

import com.charcl.study.bean.config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class T {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
		System.out.println(context);
	}
}
