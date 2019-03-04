package com.qianfeng.dao;

import com.qianfeng.pojo.Linkman;

public interface LinkmanMapper {
    int deleteByPrimaryKey(Integer lkmId);

    int insert(Linkman record);

    int insertSelective(Linkman record);

    Linkman selectByPrimaryKey(Integer lkmId);

    int updateByPrimaryKeySelective(Linkman record);

    int updateByPrimaryKey(Linkman record);
    
    public Linkman findByCustNo(String custNo);
    
    public void deleteByCustNo(String custNo);
}