package com.qianfeng.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qianfeng.pojo.User;
import com.qianfeng.vo.MenuInfo;
import com.qianfeng.vo.VUser;

@Service
public interface UserService {
	
	public User login(String name, String password);
	
	public List<MenuInfo> findByRoleId(Integer roleId);
	
	public List<VUser> findAllVUser();
	
	
}
