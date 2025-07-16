package com.hy.mapper;

import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.ActivityAnalysisExample;
import java.util.List;

import com.hy.pojo.Alog;
import org.apache.ibatis.annotations.Param;

public interface ActivityAnalysisMapper {
    Alog getAlog(@Param("cid") String cid);

    int countByExample(ActivityAnalysisExample example);

    int deleteByExample(ActivityAnalysisExample example);

    int insert(ActivityAnalysis record);

    int insertSelective(ActivityAnalysis record);

    List<ActivityAnalysis> selectByExample(ActivityAnalysisExample example);

    int updateByExampleSelective(@Param("record") ActivityAnalysis record, @Param("example") ActivityAnalysisExample example);

    int updateByExample(@Param("record") ActivityAnalysis record, @Param("example") ActivityAnalysisExample example);

    List<ActivityAnalysis> findNewAnListRJX();

    ActivityAnalysis selectAnByCid(@Param("cid") String cid);

    List<ActivityAnalysis> findNewAnList();
}