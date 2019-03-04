package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Right;

public interface RightMapper {
    int deleteByPrimaryKey(Integer rightId);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(Integer rightId);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);
    
    public List<Right> findAllByRoleId(Integer roleId);
    
    public List<Right> findAllRight();
    
    public void deleteRight(Integer id);
    
    public List<Right> findByRoleId(Integer roleId);
}