package com.chancetop.qa.mappers;

import com.chancetop.qa.examples.TProjectExample;
import com.chancetop.qa.model.TProject;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProjectMapper {
    long countByExample(TProjectExample example);

    int deleteByExample(TProjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TProject record);

    int insertSelective(TProject record);

    List<TProject> selectByExample(TProjectExample example);

    TProject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByExample(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByPrimaryKeySelective(TProject record);

    int updateByPrimaryKey(TProject record);

    int batchInsert(@Param("list") List<TProject> list);

    int batchInsertSelective(@Param("list") List<TProject> list, @Param("selective") TProject.Column ... selective);
}