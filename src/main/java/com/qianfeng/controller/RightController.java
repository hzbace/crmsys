package com.qianfeng.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Right;
import com.qianfeng.service.RightService;
import com.qianfeng.vo.JsonBean;

@Controller
public class RightController {

	@Autowired
	private RightService rightService;
	
	
	@RequestMapping("/rightlist.do")
	@ResponseBody
	public JsonBean findAllRight() {
		
		JsonBean bean = new JsonBean();
		try {
			List<Right> list = rightService.findAllRight();
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
	
	@RequestMapping("/rightpage.do")
	@ResponseBody
	public JsonBean findAllRightByPage(Integer page, Integer pageSize) {
		JsonBean bean = new JsonBean();
		
		Map<String, Object> map = rightService.findRightByPage(page, pageSize);
		bean.setCode(1);
		bean.setInfo(map);
		return bean;
	}
	
	
	
	@RequestMapping("/deleteRight.do")
	@ResponseBody
	public JsonBean deleteRight(Integer id) {
		JsonBean bean = new JsonBean();
		
		try {
			rightService.deleteRight(id);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
	
	
	
}
