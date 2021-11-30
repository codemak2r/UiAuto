package com.chancetop.qa.mappers;

import com.chancetop.qa.examples.TCaseStepExample;
import com.chancetop.qa.model.TCaseStep;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCaseStepMapper {
    long countByExample(TCaseStepExample example);

    int deleteByExample(TCaseStepExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCaseStep record);

    int insertSelective(TCaseStep record);

    List<TCaseStep> selectByExample(TCaseStepExample example);

    TCaseStep selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCaseStep record, @Param("example") TCaseStepExample example);

    int updateByExample(@Param("record") TCaseStep record, @Param("example") TCaseStepExample example);

    int updateByPrimaryKeySelective(TCaseStep record);

    int updateByPrimaryKey(TCaseStep record);
}