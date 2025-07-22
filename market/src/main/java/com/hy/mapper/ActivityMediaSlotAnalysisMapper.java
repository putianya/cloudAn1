package com.hy.mapper;

import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.ActivityMediaSlotAnalysis;
import com.hy.pojo.ActivityMediaSlotAnalysisExample;
import java.util.List;

import com.hy.pojo.MediaSlot;
import com.hy.result.PageResult;
import org.apache.ibatis.annotations.Param;

public interface ActivityMediaSlotAnalysisMapper {
    int countByExample(ActivityMediaSlotAnalysisExample example);

    int deleteByExample(ActivityMediaSlotAnalysisExample example);

    int insert(ActivityMediaSlotAnalysis record);

    int insertSelective(ActivityMediaSlotAnalysis record);

    List<ActivityMediaSlotAnalysis> selectByExample(ActivityMediaSlotAnalysisExample example);

    int updateByExampleSelective(@Param("record") ActivityMediaSlotAnalysis record, @Param("example") ActivityMediaSlotAnalysisExample example);

    int updateByExample(@Param("record") ActivityMediaSlotAnalysis record, @Param("example") ActivityMediaSlotAnalysisExample example);

    List<String> findContactPoint();

    List<MediaSlot> findMediaSlot(@Param("cid") String cid, @Param("point") String point,
                                        @Param("orderfield") String orderfield, @Param("ordertype") String ordertype,@Param("media") String media);

    List<String> findAllMedia();
}