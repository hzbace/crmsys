package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Activity;

public interface ActivityMapper {
    int deleteByPrimaryKey(Integer atvId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer atvId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
    
    public List<Activity> findByCustNo(String custNo);
}