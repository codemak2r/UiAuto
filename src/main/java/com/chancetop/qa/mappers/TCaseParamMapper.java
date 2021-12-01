package com.chancetop.qa.mappers;

import com.chancetop.qa.examples.TCaseParamExample;
import com.chancetop.qa.model.TCaseParam;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCaseParamMapper {
    long countByExample(TCaseParamExample example);

    int deleteByExample(TCaseParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCaseParam record);

    int insertSelective(TCaseParam record);

    List<TCaseParam> selectByExample(TCaseParamExample example);

    TCaseParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCaseParam record, @Param("example") TCaseParamExample example);

    int updateByExample(@Param("record") TCaseParam record, @Param("example") TCaseParamExample example);

    int updateByPrimaryKeySelective(TCaseParam record);

    int updateByPrimaryKey(TCaseParam record);

    int batchInsert(@Param("list") List<TCaseParam> list);

    int batchInsertSelective(@Param("list") List<TCaseParam> list, @Param("selective") TCaseParam.Column ... selective);
}