package com.qianfeng.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qianfeng.dao.RoleMapper;
import com.qianfeng.dao.UserMapper;
import com.qianfeng.pojo.Right;
import com.qianfeng.pojo.Role;
import com.qianfeng.service.RoleService;
import com.qianfeng.service.UserService;
import com.qianfeng.vo.MenuInfo;
import com.qianfeng.vo.VUser;


public class UserServiceTest extends BaseTest{

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private RoleMapper roleMapper;
	
	
	@Test
	public void menuTest() {
		List<MenuInfo> list = userService.findByRoleId(4);
//		for (MenuInfo menuInfo : list) {
//			System.out.println(menuInfo.getpMenuName());
//			for(Right right : menuInfo.getcMenuList()) {
//				System.out.println(right.getRightName());
//			}
//		}
		for (MenuInfo menuInfo : list) {
			System.out.println(menuInfo.getpMenuName());
			for(Right right : menuInfo.getcMenuList()) {
				System.out.println(right.getRightName());
			}
		}
//		User user = userMapper.findByName("admin");
//		System.out.println(user);
//		System.out.println(user.getUserName());
//		System.out.println(user.getUserPassword());
//		Role role = new Role();
//		role.setRoleName("dd");
//		role.setRoleDesc("ddddd");
//		roleService.addRole(role);
		}
//	
		@Test
		public void test2() {
			List<VUser> list = userService.findAllVUser();
			for (VUser vUser : list) {
				System.out.println(vUser);
			}
		}
		
	}
	

