package com.kams.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kams.bean.SmConfig;
import com.kams.bean.SmConfigExample;

public interface SmConfigMapper {
    long countByExample(SmConfigExample example);

    int deleteByExample(SmConfigExample example);

    int insert(SmConfig record);

    int insertSelective(SmConfig record);

    List<SmConfig> selectByExampleWithBLOBs(SmConfigExample example);

    List<SmConfig> selectByExample(SmConfigExample example);

    int updateByExampleSelective(@Param("record") SmConfig record, @Param("example") SmConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") SmConfig record, @Param("example") SmConfigExample example);

    int updateByExample(@Param("record") SmConfig record, @Param("example") SmConfigExample example);

	List<SmConfig> getEmailConfigInfo();

	List<SmConfig> getScheduleConfigInfo();

	List<SmConfig>  getSLAStandard(SmConfig smConfig);

	void deleteByPrimaryKey(int parseInt);
}