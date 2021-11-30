package com.chancetop.qa.mappers;

import com.chancetop.qa.examples.TEnvironmentExample;
import com.chancetop.qa.model.TEnvironment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEnvironmentMapper {
    long countByExample(TEnvironmentExample example);

    int deleteByExample(TEnvironmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEnvironment record);

    int insertSelective(TEnvironment record);

    List<TEnvironment> selectByExample(TEnvironmentExample example);

    TEnvironment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEnvironment record, @Param("example") TEnvironmentExample example);

    int updateByExample(@Param("record") TEnvironment record, @Param("example") TEnvironmentExample example);

    int updateByPrimaryKeySelective(TEnvironment record);

    int updateByPrimaryKey(TEnvironment record);
}