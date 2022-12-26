package org.springframework.bean.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

//@Component
public class UserService {

//	@Autowired
//	private OrderService orderService;

//	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void test(){

		//这时候从事务管理器的map中去拿datesource，如果拿不到，那么这里就会自己创建连接，autocommite是true，所以直接提交
		//所以事物失效
		jdbcTemplate.execute("insert into t1(id,k) values (10,10)");
//		throw new NullPointerException();
	}

}
