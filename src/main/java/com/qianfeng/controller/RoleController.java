package com.qianfeng.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Role;
import com.qianfeng.service.RoleService;
import com.qianfeng.vo.JsonBean;
import com.qianfeng.vo.Role_Rights;

@Controller
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	
	@RequestMapping("/roleList.do")
	@ResponseBody
	public JsonBean findAllRole() {
		JsonBean bean = new JsonBean();
		
		try {
			List<Role> list = roleService.findAllRole();
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
	
	@RequestMapping("/deleteRole.do")
	@ResponseBody
	public JsonBean deleteRole(Integer id) {
		JsonBean bean = new JsonBean();
		
		try {
			roleService.deleteRoleById(id);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);	
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
	
	
	
	@RequestMapping("/addRole.do")
	@ResponseBody
	public JsonBean addRole(@Valid Role role,BindingResult bindingResult) {
		JsonBean bean = new JsonBean();
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for (ObjectError objErr : allErrors) {
				FieldError err = (FieldError)objErr;
				// 获取验证不通过的属性
				System.out.println(err.getField());
				// 获取验证信息
				System.out.println(err.getDefaultMessage());
			}
			bean.setCode(0);
			
		}

		try {
			roleService.addRole(role);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
		
	}
	
	
	@RequestMapping("/findRole.do")
	@ResponseBody
	public JsonBean findRoleById(Integer id) {
		JsonBean bean = new JsonBean();
		try {
			Role role = roleService.findRoleById(id);
			bean.setCode(1);
			bean.setInfo(role);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);	
			bean.setInfo(e.getMessage());
		}
		return bean;
		
	}
	
	@RequestMapping("/updateRole.do")
	@ResponseBody
	public JsonBean updateRole(Role role) {
		JsonBean bean = new JsonBean();
		
		try {
			roleService.updateRole(role);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
		}
		
		
		
		return bean;
	}
	
	@RequestMapping("/pageRole.do")
	@ResponseBody
	public JsonBean findByPage(Integer page,Integer pageSize) {
		
		JsonBean bean = new JsonBean();
		
		Map<String, Object> map = roleService.findAllRoleByPage(page, pageSize);
		bean.setCode(1);
		bean.setInfo(map);
		
		return bean;
	}
	
	
	@RequestMapping("/findAllRR.do")
	@ResponseBody
	public JsonBean findAllRR() {
		
		JsonBean bean = new JsonBean();
		try {
			List<Role_Rights> list = roleService.findAllRR();
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
