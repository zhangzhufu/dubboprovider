package com.unj.dubbotest.service.impl;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

import com.unj.dubbotest.dao.TRoleMapper;
import com.unj.dubbotest.model.TRole;
import com.unj.dubbotest.model.TRoleExample;
import com.unj.dubbotest.service.RoleService;


public class RoleServiceImpl implements RoleService {

	@Autowired
	private TRoleMapper tRoleMapper;

	@Async("logExecutor") 
	public List<TRole> getRoles() {
		TRoleExample example = new TRoleExample();
		List<TRole> roles = tRoleMapper.selectByExample(example);
		return roles;
	}
	
	@Async  
	public Future<String> asyncMethodWithReturnType() {  
	    System.out.println("Execute method asynchronously - "  
	      + Thread.currentThread().getName());  
	    try {  
	        Thread.sleep(5000);  
	        return new AsyncResult<String>("hello world !!!!");  
	    } catch (InterruptedException e) {  
	        //  
	    }  
	   
	    return null;  
	}
	
}
