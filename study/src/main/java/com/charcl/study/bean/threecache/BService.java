package com.charcl.study.bean.threecache;

import org.springframework.beans.factory.FactoryBean;

//@Component
public class BService implements FactoryBean<DService> {
	@Override
	public DService getObject() throws Exception {
		System.out.println("????");
		return new DService();
	}

	@Override
	public Class<DService> getObjectType() {
		return DService.class;
	}

//	@Autowired
//	private AService aService;
}
