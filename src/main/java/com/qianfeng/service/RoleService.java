package com.qianfeng.service;

import java.util.List;
import java.util.Map;

import com.qianfeng.pojo.Role;
import com.qianfeng.vo.Role_Rights;

public interface RoleService {
	
	public List<Role> findAllRole();
	
	public void deleteRoleById(Integer id);
	
	public void addRole(Role role);
	
	public Role findRoleById(Integer roleId);
	
	public void updateRole(Role role);
	
	public Map<String,Object> findAllRoleByPage(Integer page,Integer size);
	
	public List<Role> findByPage(Integer page,Integer size);
	
	public List<Role_Rights> findAllRR();
}
