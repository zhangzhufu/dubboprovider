package com.unj.dubbotest.service.facade;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.unj.dubbotest.model.TRole;
import com.unj.dubbotest.service.RoleService;
import com.unj.dubbotest.service.impl.RoleServiceImpl;

@Service
public class RoleServiceFacade implements RoleService {

	public List<TRole> getRoles() {
		return new RoleServiceImpl().getRoles();
	}
}
