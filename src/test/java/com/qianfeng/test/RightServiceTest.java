package com.qianfeng.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qianfeng.dao.RightMapper;
import com.qianfeng.dao.RoleMapper;
import com.qianfeng.pojo.Right;
import com.qianfeng.service.RightService;
import com.qianfeng.vo.Role_Rights;

public class RightServiceTest extends BaseTest{

	@Autowired
	private RightService rightService;
	
	@Autowired
	private RightMapper rightMapper;
	@Autowired
	private RoleMapper roleMapper;
	
	@Test
	public void findAllRight() {
		Map<String, Object> map = rightService.findRightByPage(1, 5);
		
	}
	
	
	
	@Test
	public void test() {
		List<Role_Rights> list = roleMapper.findRR(5);
		for (Role_Rights role_Rights : list) {
			System.out.println(role_Rights);
		}
	}
}
