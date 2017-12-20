package com.unj.dubbotest.service.facade;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.unj.dubbotest.service.DemoAnnotationService;
import com.unj.dubbotest.service.impl.DemoAnnotationServiceImpl;
import com.unj.dubbotest.service.impl.User;

@Service(version = "1.0.0")
public class DemoAnnotationServiceFacade implements DemoAnnotationService {

	@Override
	public String sayHello(String name) {
		return new DemoAnnotationServiceImpl().sayHello(name);
	}
	@Override
	public List<User> getUsers() {
		return new DemoAnnotationServiceImpl().getUsers();
	}
}
