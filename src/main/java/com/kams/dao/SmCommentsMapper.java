package com.kams.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmComments;
import com.kams.bean.SmCommentsExample;
import com.kams.bean.SmUseraction;

public interface SmCommentsMapper {
	long countByExample(SmCommentsExample example);

	int deleteByExample(SmCommentsExample example);

	int insert(SmComments record);

	int insertSelective(SmComments record);

	List<SmComments> selectByExample(SmCommentsExample example);

	int updateByExampleSelective(@Param("record") SmComments record, @Param("example") SmCommentsExample example);

	int updateByExample(@Param("record") SmComments record, @Param("example") SmCommentsExample example);

	int deployComm(SmComments smComments);

	List<SmComments> getComms(SmComments smComments);

	int addView(SmUseraction smUseraction);

	int addFavo(Map<String, Object> map);

	int delComm(int parseInt);

}