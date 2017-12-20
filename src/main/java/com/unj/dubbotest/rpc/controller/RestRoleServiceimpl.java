package com.unj.dubbotest.rpc.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.unj.dubbotest.rpc.facate.RestRoleServiceFacade;

@Service(protocol = "rest")
@Path("/restService")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class RestRoleServiceimpl {

	@Autowired
	private RestRoleServiceFacade roleService;

	@Path("/getMsg")
	@GET
	public String rest() {
		String str = roleService.getRoles().get(0).getRolename();
		System.out.println(str);
		return str;
	}
}
