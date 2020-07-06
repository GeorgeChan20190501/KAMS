package com.kams.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmFun;
import com.kams.bean.SmFunExample;

public interface SmFunMapper {
	long countByExample(SmFunExample example);

	int deleteByExample(SmFunExample example);

	int insert(SmFun record);

	int insertSelective(SmFun record);

	List<SmFun> selectByExample(SmFunExample example);

	int updateByExampleSelective(@Param("record") SmFun record, @Param("example") SmFunExample example);

	int updateByExample(@Param("record") SmFun record, @Param("example") SmFunExample example);

	List<SmFun> getPrePeriod(SmFun smFun);

	void touzhu(List<SmFun> list);

	void kaiJiang(SmFun smFun);

	String getQiHao(String string);

	void updatePaiJiang(SmFun smFun2);

	List<SmFun> shengyaToSys(SmFun smFun);

	String maxFkey(SmFun smFun);

	void nextFkey(SmFun smFun);
}