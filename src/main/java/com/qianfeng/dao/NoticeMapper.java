package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Notice;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer notId);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer notId);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
    
    public List<Notice> findAllNotice();
    
    public List<Notice> findAllNotice2(Integer Id);
}