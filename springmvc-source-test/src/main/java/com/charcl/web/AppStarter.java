package com.charcl.web;

import com.charcl.web.config.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 只要写了这个，就相当于配置了SpringMVC的DispatcherServlet
 * 1.tomcat已启动就加载他
 * 	 a.创建了容器，制定了配置类（所有ioc，aop等spring的功能就ok）
 * 	 b.注册了Servlet，dispatcherServlet
 * 	 c.以后所有的请求都交给了DispatcherServlet
 * 	 DispatcherServlet
 * Servlet3.0是javaEE的web的规范标准，Tomcat是Servlet3.0的规范的一个实现
 */
public class AppStarter implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);

		//配置了DispatcherServlet
		DispatcherServlet servlet=new DispatcherServlet(context);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/"); //映射路径
	}
}
