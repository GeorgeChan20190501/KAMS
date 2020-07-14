package com.kams.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmGonggao;
import com.kams.bean.SmGonggaoExample;

public interface SmGonggaoMapper {
	long countByExample(SmGonggaoExample example);

	int deleteByExample(SmGonggaoExample example);

	int insert(SmGonggao record);

	int insertSelective(SmGonggao record);

	List<SmGonggao> selectByExampleWithBLOBs(SmGonggaoExample example);

	List<SmGonggao> selectByExample(SmGonggaoExample example);

	int updateByExampleSelective(@Param("record") SmGonggao record, @Param("example") SmGonggaoExample example);

	int updateByExampleWithBLOBs(@Param("record") SmGonggao record, @Param("example") SmGonggaoExample example);

	int updateByExample(@Param("record") SmGonggao record, @Param("example") SmGonggaoExample example);

	List<SmGonggao> fenyeQueryGongGao();

	int addGongGao(SmGonggao smGonggao);

	int deleteByPrimaryKey(int parseInt);
}