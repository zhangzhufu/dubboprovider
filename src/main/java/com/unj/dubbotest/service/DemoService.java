package com.unj.dubbotest.service;

import java.util.List;

import com.unj.dubbotest.service.impl.User;

public interface DemoService {

	String sayHello(String name);

	public List<User> getUsers();

}