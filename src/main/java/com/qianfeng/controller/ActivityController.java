package com.qianfeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Activity;
import com.qianfeng.service.ActivityService;
import com.qianfeng.vo.JsonBean;

@Controller
public class ActivityController {

	@Autowired
	private ActivityService activityService;
	
	
	@RequestMapping("/findAct.do")
	@ResponseBody
	public JsonBean findActByCustNo(String custNo) {
		
		JsonBean bean =  new JsonBean();
		
		try {
			List<Activity> list = activityService.findActByCustNo(custNo);
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
	
	@RequestMapping("/deleteAct.do")
	@ResponseBody
	public JsonBean deleteAct(Integer atvId) {
		JsonBean bean = new JsonBean();
		try {
			activityService.deleteActById(atvId);
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
