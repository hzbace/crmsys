package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.NoticeMapper;
import com.qianfeng.pojo.Notice;
import com.qianfeng.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAllNotice() {
		// TODO Auto-generated method stub
		
		List<Notice> list = noticeMapper.findAllNotice();
		return list;
	}

	@Override
	public void addNotice(Notice notice) {
		// TODO Auto-generated method stub
		noticeMapper.insertSelective(notice);
		
	}

	@Override
	public List<Notice> findNoticeById(Integer userId) {
		// TODO Auto-generated method stub
		List<Notice> list = noticeMapper.findAllNotice2(userId);
		return list;
	}

	@Override
	public void deleteById(Integer notId) {
		// TODO Auto-generated method stub
		noticeMapper.deleteByPrimaryKey(notId);
		
	}

}
