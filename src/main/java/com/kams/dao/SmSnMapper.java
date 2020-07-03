package com.kams.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmSn;
import com.kams.bean.SmSnExample;
@Mapper
public interface SmSnMapper {
	long countByExample(SmSnExample example);

	int deleteByExample(SmSnExample example);

	int insert(SmSn record);

	int insertSelective(SmSn record);

	List<SmSn> selectByExample(SmSnExample example);

	int updateByExampleSelective(@Param("record") SmSn record, @Param("example") SmSnExample example);

	int updateByExample(@Param("record") SmSn record, @Param("example") SmSnExample example);

	List<SmSn> getSNByTicketNo(List<SmSn> snList);

	void insertNewSN(List<SmSn> snList);

	void updateSN(List<SmSn> listUpdate);

	List<SmSn> queryFenyeSN(SmSn smSntlist);
}