package com.kams.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmUseraction;
import com.kams.bean.SmUseractionExample;

public interface SmUseractionMapper {
	long countByExample(SmUseractionExample example);

	int deleteByExample(SmUseractionExample example);

	int insert(SmUseraction record);

	int insertSelective(SmUseraction record);

	List<SmUseraction> selectByExample(SmUseractionExample example);

	int updateByExampleSelective(@Param("record") SmUseraction record, @Param("example") SmUseractionExample example);

	int updateByExample(@Param("record") SmUseraction record, @Param("example") SmUseractionExample example);

	SmUseraction isRepeatView(SmUseraction smUseraction);

	void newView(SmUseraction smUseraction);

	SmUseraction getgetIsDZ(Map<String, Object> map);
}