package com.kams.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kams.bean.SysMenu;
import com.kams.bean.SysRole;
import com.kams.bean.SysRoleExample;
import com.kams.bean.SysRoleMenu;

public interface SysRoleMapper {
    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    List<SysRole> getUserRole();

 	int addRole(SysRole sysRole);

 	List<SysRole> queryRole(SysRole sysRole);

 	void deleteRole(List<String> list);

 	int updateRole(List<SysRole> list);

	String[] getRoleCode(List<String> listId);

	void roleGrant(List<SysRoleMenu> list);

	void deleteUserRole(String listId);

 
    
}