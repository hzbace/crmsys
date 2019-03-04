package com.qianfeng.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Notice;
import com.qianfeng.pojo.User;
import com.qianfeng.service.NoticeService;
import com.qianfeng.vo.JsonBean;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	
	@RequestMapping("/noticelist.do")
	@ResponseBody
	public JsonBean findAllNotice(HttpSession session) {
		JsonBean bean = new JsonBean();
		
		User user = (User)session.getAttribute("user");
		Map<String,Object> map = new HashMap<String,Object>();
		if(user != null) {
			map.put("user", user);
		}
		
		try {
			List<Notice> list = noticeService.findNoticeById(user.getUserId());
			map.put("list", list);
			bean.setCode(1);
			bean.setInfo(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
		
	}
	
	
	@RequestMapping("/addNotice.do")
	@ResponseBody
	public JsonBean addNotice(Notice notice, HttpSession session) {
		JsonBean bean = new JsonBean();
		
		User user = (User)session.getAttribute("user");
		notice.setNotUserId(user.getUserId());
		notice.setNotCreatedate(new Date());
		try {
			noticeService.addNotice(notice);
			bean.setCode(1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
	
	@RequestMapping("/deleteNotice.do")
	@ResponseBody
	public JsonBean deleteNotice(Integer notId) {
		
		JsonBean bean = new JsonBean();
		try {
			noticeService.deleteById(notId);
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








