package com.qianfeng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.vo.JsonBean;
import com.qianfeng.vo.MenuInfo;
import com.qianfeng.vo.VUser;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.do")
	@ResponseBody
	public JsonBean login(String name,String password, HttpSession session) {
		JsonBean bean = new JsonBean();
		
		
		try {
			User user = userService.login(name,password);
			session.setAttribute("user", user);
			bean.setCode(1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}

		return bean;
	}
	
	@RequestMapping("findMenu.do")
	@ResponseBody
	public JsonBean findMenuInfo(HttpSession session) {
		JsonBean bean = new JsonBean();
		User user = (User)session.getAttribute("user");
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		
		if (user != null) {
			try {
				List<MenuInfo> list = userService.findByRoleId(user.getUserRoleId());
				map.put("list", list);
				map.put("user", user);
				bean.setCode(1);
				bean.setInfo(map);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				bean.setCode(0);
				bean.setInfo(e.getMessage());
			}
			
		}
		
		
		return bean;
		
	}
	
	@RequestMapping("findAllUser.do")
	@ResponseBody
	public JsonBean findAllUser() {
		JsonBean bean  = new JsonBean();
		
		try {
			List<VUser> list = userService.findAllVUser();
			bean.setCode(1);
			bean.setInfo(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		
		return bean;
	}
	
	
	
	
	
	
}
