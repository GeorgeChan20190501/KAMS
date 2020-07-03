package com.kams.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmEfforts;
import com.kams.bean.SmEffortsExample;

public interface SmEffortsMapper {
    long countByExample(SmEffortsExample example);

    int deleteByExample(SmEffortsExample example);

    int insert(SmEfforts record);

    int insertSelective(SmEfforts record);

    List<SmEfforts> selectByExample(SmEffortsExample example);

    int updateByExampleSelective(@Param("record") SmEfforts record, @Param("example") SmEffortsExample example);

    int updateByExample(@Param("record") SmEfforts record, @Param("example") SmEffortsExample example);
    
    int deleteEffort(List<String> list);

 	int updateEffort(List<SmEfforts> list);

	int saveOrUpdateEffort(List<SmEfforts> effortList);
}