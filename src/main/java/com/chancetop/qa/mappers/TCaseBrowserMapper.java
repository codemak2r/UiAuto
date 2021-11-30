package com.chancetop.qa.mappers;

import com.chancetop.qa.examples.TCaseBrowserExample;
import com.chancetop.qa.model.TCaseBrowser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCaseBrowserMapper {
    long countByExample(TCaseBrowserExample example);

    int deleteByExample(TCaseBrowserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCaseBrowser record);

    int insertSelective(TCaseBrowser record);

    List<TCaseBrowser> selectByExample(TCaseBrowserExample example);

    TCaseBrowser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCaseBrowser record, @Param("example") TCaseBrowserExample example);

    int updateByExample(@Param("record") TCaseBrowser record, @Param("example") TCaseBrowserExample example);

    int updateByPrimaryKeySelective(TCaseBrowser record);

    int updateByPrimaryKey(TCaseBrowser record);
}