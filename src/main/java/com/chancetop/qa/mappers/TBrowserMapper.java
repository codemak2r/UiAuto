package com.chancetop.qa.mappers;

import com.chancetop.qa.examples.TBrowserExample;
import com.chancetop.qa.model.TBrowser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBrowserMapper {
    long countByExample(TBrowserExample example);

    int deleteByExample(TBrowserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBrowser record);

    int insertSelective(TBrowser record);

    List<TBrowser> selectByExample(TBrowserExample example);

    TBrowser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBrowser record, @Param("example") TBrowserExample example);

    int updateByExample(@Param("record") TBrowser record, @Param("example") TBrowserExample example);

    int updateByPrimaryKeySelective(TBrowser record);

    int updateByPrimaryKey(TBrowser record);

    int batchInsert(@Param("list") List<TBrowser> list);

    int batchInsertSelective(@Param("list") List<TBrowser> list, @Param("selective") TBrowser.Column ... selective);
}