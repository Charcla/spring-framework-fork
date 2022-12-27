package com.charcl.study.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@ComponentScan("com.charcl.study.bean")
@EnableAspectJAutoProxy
@EnableTransactionManagement
//下面这个注解会生成代理类，目的判断下面这些方法上执行返回的对象是不是在ioc中已经有了，
//有的话，就从ioc中拿，所以下面两个datasource（）方法返回的是一个对象
@Configuration
public class AppConfig {

	@Bean
	public JdbcTemplate jdbcTemplate(){
		//会传入一个datasource
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public PlatformTransactionManager transactionManager(){
		//事务管理器新建一个数据库连接
		//有个Threadlocla对象，是一个map<DataSource,conn>，为了支持多数据源，比如一个线程里面执行了两个数据库操作
		//这两个操作是操作两个不同数据库，所以得根据数据源找到对应的连接
		DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://192.168.1.3:3306/mysqlstudy?characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai");
		dataSource.setUsername("root");
		dataSource.setPassword("abcd1234");
		return dataSource;
	}
}
