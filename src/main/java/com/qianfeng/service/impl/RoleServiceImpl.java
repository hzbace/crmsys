package com.qianfeng.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.RoleMapper;
import com.qianfeng.pojo.Role;
import com.qianfeng.service.RoleService;
import com.qianfeng.vo.Role_Rights;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<Role> findAllRole() {
		// TODO Auto-generated method stub
		
		
		List<Role> list = roleMapper.findAllRole();
		return list;
	}

	@Override
	public void deleteRoleById(Integer id) {
		// TODO Auto-generated method stub
		roleMapper.deleteRoleById(id);
	}

	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		roleMapper.insertSelective(role);
	}

	@Override
	public Role findRoleById(Integer roleId) {
		// TODO Auto-generated method stub
		Role role = roleMapper.selectByPrimaryKey(roleId);
		return role;
	}

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		roleMapper.updateByPrimaryKeySelective(role);
	}

	@Override
	public Map<String,Object> findAllRoleByPage(Integer page, Integer size) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		Page<Object> pageInfo = PageHelper.startPage(page, size);
		List<Role> list = roleMapper.findAllRole();
		 
		map.put("total", pageInfo.getTotal());
		map.put("rows", list);
		
		return map;
	}

	@Override
	public List<Role> findByPage(Integer page, Integer size) {
		// TODO Auto-generated method stub
		Page<Object> pageInfo = PageHelper.startPage(page, size);
		List<Role> list = roleMapper.findAllRole();
		long total = pageInfo.getTotal();
		System.out.println(total);
		return list;
	}

	@Override
	public List<Role_Rights> findAllRR() {
		// TODO Auto-generated method stub
		
		List<Role_Rights> list = roleMapper.findAllRR();
		return list;
	}

}
