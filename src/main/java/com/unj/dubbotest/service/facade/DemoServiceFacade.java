package com.unj.dubbotest.service.facade;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.unj.dubbotest.service.DemoService;
import com.unj.dubbotest.service.impl.DemoServiceImpl;
import com.unj.dubbotest.service.impl.User;

@Service
public class DemoServiceFacade implements DemoService {

	public String sayHello(String name) {
		return new DemoServiceImpl().sayHello(name);
	}

	public List<User> getUsers() {
		return new DemoServiceImpl().getUsers();
	}
}
