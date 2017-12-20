package com.unj.dubbotest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unj.dubbotest.dao.TRoleMapper;
import com.unj.dubbotest.model.TRole;
import com.unj.dubbotest.model.TRoleExample;
import com.unj.dubbotest.service.RpcRoleService;

public class RpcRoleServiceImpl implements RpcRoleService {

	@Autowired
	private TRoleMapper tRoleMapper;

	public List<TRole> getRoles() {
		TRoleExample example = new TRoleExample();
		List<TRole> roles = tRoleMapper.selectByExample(example);
		return roles;
	}

	@Override
	public TRole getTRoleById(Integer id) {
		TRoleExample example = new TRoleExample();
		example.or().andIdEqualTo(id);
		List<TRole> role = tRoleMapper.selectByExample(example);
		return role.get(0);
	}
}
