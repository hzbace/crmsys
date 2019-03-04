package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Linkman;
import com.qianfeng.service.LinkmanService;
import com.qianfeng.vo.JsonBean;

@Controller
public class LinkmanController {

	@Autowired
	private LinkmanService linkmanService;
	
	@RequestMapping("/linkman.do")
	@ResponseBody
	public JsonBean findMan(String custNo) {
		JsonBean bean = new JsonBean();
		
		try {
			Linkman linkman = linkmanService.findByNo(custNo);
			bean.setCode(1);
			bean.setInfo(linkman);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
}
