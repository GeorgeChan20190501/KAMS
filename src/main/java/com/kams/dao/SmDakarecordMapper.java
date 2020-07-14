package com.kams.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmDakarecord;
import com.kams.bean.SmDakarecordExample;

public interface SmDakarecordMapper {
	long countByExample(SmDakarecordExample example);

	int deleteByExample(SmDakarecordExample example);

	int insert(SmDakarecord record);

	int insertSelective(SmDakarecord record);

	List<SmDakarecord> selectByExample(SmDakarecordExample example);

	int updateByExampleSelective(@Param("record") SmDakarecord record, @Param("example") SmDakarecordExample example);

	int updateByExample(@Param("record") SmDakarecord record, @Param("example") SmDakarecordExample example);

	String getCurrentStep();

	void setStep(SmDakarecord smDakarecord);

	void resetDaka();

}