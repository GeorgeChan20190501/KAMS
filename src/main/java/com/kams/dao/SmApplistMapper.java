package com.kams.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmApplist;
import com.kams.bean.SmApplistExample;

public interface SmApplistMapper {
    long countByExample(SmApplistExample example);

    int deleteByExample(SmApplistExample example);

    int insert(SmApplist record);

    int insertSelective(SmApplist record);

    List<SmApplist> selectByExample(SmApplistExample example);

    int updateByExampleSelective(@Param("record") SmApplist record, @Param("example") SmApplistExample example);

    int updateByExample(@Param("record") SmApplist record, @Param("example") SmApplistExample example);

	List<SmApplist> queryAppConfig(SmApplist smApplist);

	void addConfig(SmApplist smApplist);

	void updateConfig(List<SmApplist> list);

	void deleteConfig(List<String> list);
}