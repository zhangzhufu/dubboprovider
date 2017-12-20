package com.unj.dubbotest.service;

import java.util.List;

import com.unj.dubbotest.model.TRole;

public interface RpcRoleService {

	List<TRole> getRoles();

	TRole getTRoleById(Integer id);
}