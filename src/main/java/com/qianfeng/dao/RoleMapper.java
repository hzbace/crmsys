package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Role;
import com.qianfeng.vo.Role_Rights;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    public List<Role> findAllRole();
    
    public void deleteRoleById(Integer roleId);
    
    public void addRole(Role role);
    
    public List<Role_Rights> findRR(Integer id);
    
    public List<Role_Rights> findAllRR();
}