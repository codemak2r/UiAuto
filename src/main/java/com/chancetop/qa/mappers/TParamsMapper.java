package com.chancetop.qa.mappers;

import com.chancetop.qa.examples.TParamsExample;
import com.chancetop.qa.model.TParams;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TParamsMapper {
    long countByExample(TParamsExample example);

    int deleteByExample(TParamsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TParams record);

    int insertSelective(TParams record);

    List<TParams> selectByExample(TParamsExample example);

    TParams selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TParams record, @Param("example") TParamsExample example);

    int updateByExample(@Param("record") TParams record, @Param("example") TParamsExample example);

    int updateByPrimaryKeySelective(TParams record);

    int updateByPrimaryKey(TParams record);

    int batchInsert(@Param("list") List<TParams> list);

    int batchInsertSelective(@Param("list") List<TParams> list, @Param("selective") TParams.Column ... selective);
}