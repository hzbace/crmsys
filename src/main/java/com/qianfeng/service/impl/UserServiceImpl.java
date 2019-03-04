package com.qianfeng.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.RightMapper;
import com.qianfeng.dao.UserMapper;
import com.qianfeng.pojo.Right;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.vo.MenuInfo;
import com.qianfeng.vo.VUser;




@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private RightMapper rightMapper;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public User login(String name, String password) {
		User user = userMapper.findByName(name);
		if (user == null) {
			throw new RuntimeException("用户名输入不正确");
		}else {
			if (!password.equals(user.getUserPassword())) {
				throw new RuntimeException("密码错误");
			}
		}
		
		return user;
	}

	public List<MenuInfo> findByRoleId(Integer roleId) {
		// TODO Auto-generated method stub
		
		List<Right> rightList = rightMapper.findAllByRoleId(roleId);
		
		List<MenuInfo> infos = new ArrayList<MenuInfo>();
		
		if (rightList != null) {
			for (Right right : rightList) {
				if (right.getRightParentId() == null || right.getRightParentId() == 0) {
					MenuInfo menuInfo = new MenuInfo();
					menuInfo.setId(right.getRightId());
					menuInfo.setpMenuName(right.getRightName());
					menuInfo.setcMenuList(new ArrayList<Right>());
					infos.add(menuInfo);
				}else {
					for(MenuInfo menuInfo : infos) {
						if (menuInfo.getId() == right.getRightParentId()) {
							menuInfo.getcMenuList().add(right);
							break;
						}
					}
				}
			}
		}
		
		
		return infos;
	}

	@Override
	public List<VUser> findAllVUser() {
		// TODO Auto-generated method stub
		
		String sql = "select u.user_id userId,u.user_name userName,u.user_password userPassword,r.role_name roleName,u.user_flag userFlag from sys_user u inner join sys_role r on u.user_role_id = r.role_id";
		
		List<VUser> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<VUser>(VUser.class));
	
		return list;
	}



}
