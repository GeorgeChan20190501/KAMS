package com.kams.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmUserjfmx;
import com.kams.bean.SmUserjfmxExample;

public interface SmUserjfmxMapper {
    long countByExample(SmUserjfmxExample example);

    int deleteByExample(SmUserjfmxExample example);

    int insert(SmUserjfmx record);

    int insertSelective(SmUserjfmx record);

    List<SmUserjfmx> selectByExample(SmUserjfmxExample example);

    int updateByExampleSelective(@Param("record") SmUserjfmx record, @Param("example") SmUserjfmxExample example);

    int updateByExample(@Param("record") SmUserjfmx record, @Param("example") SmUserjfmxExample example);

	void addJiFenRecord(SmUserjfmx smUserjfmx);

	List<SmUserjfmx> jiFenMXQuery(SmUserjfmx smUserjfmx);
}