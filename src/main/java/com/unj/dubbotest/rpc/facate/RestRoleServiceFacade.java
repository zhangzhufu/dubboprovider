package com.unj.dubbotest.rpc.facate;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.unj.dubbotest.model.TRole;
import com.unj.dubbotest.rpc.impl.RestRoleServiceImpl;
import com.unj.dubbotest.service.RoleService;

@Service
public class RestRoleServiceFacade implements RoleService {

	public List<TRole> getRoles() {
		return new RestRoleServiceImpl().getRoles();
	}
}
