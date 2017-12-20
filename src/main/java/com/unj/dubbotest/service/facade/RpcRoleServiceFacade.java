package com.unj.dubbotest.service.facade;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.config.annotation.Service;
import com.unj.dubbotest.model.TRole;
import com.unj.dubbotest.service.RpcRoleService;
import com.unj.dubbotest.service.impl.RpcRoleServiceImpl;

/**
 * 测试dubbo中rpc restful服务（待续）
 * 
 * @author zhangzhufu
 *
 */
@Service
@Path("roles")
public class RpcRoleServiceFacade implements RpcRoleService {
	@POST
	@Path("getAll")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Override
	public List<TRole> getRoles() {
		System.out.println(1111111);
		return new RpcRoleServiceImpl().getRoles();
	}

	@POST
	@Path("getid")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Override
	public TRole getTRoleById(Integer id) {
		return new RpcRoleServiceImpl().getTRoleById(id);
	}

}