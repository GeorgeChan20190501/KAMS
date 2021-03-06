package com.kams.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmUserjf;
import com.kams.bean.SmUserjfExample;

public interface SmUserjfMapper {
    long countByExample(SmUserjfExample example);

    int deleteByExample(SmUserjfExample example);

    int insert(SmUserjf record);

    int insertSelective(SmUserjf record);

    List<SmUserjf> selectByExample(SmUserjfExample example);

    int updateByExampleSelective(@Param("record") SmUserjf record, @Param("example") SmUserjfExample example);

    int updateByExample(@Param("record") SmUserjf record, @Param("example") SmUserjfExample example);

	List<SmUserjf> getUserJF(SmUserjf smUserjf);

	void updateJiFen(SmUserjf smUserjf);

	void addJiFen(SmUserjf smUserjf);

}