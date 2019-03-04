package com.qianfeng.service;

import java.util.List;

import com.qianfeng.pojo.Notice;

public interface NoticeService {

	public List<Notice> findAllNotice();
	
	public void addNotice(Notice notice);
	
	public List<Notice> findNoticeById(Integer userId);
	
	public void deleteById(Integer notId);
}
