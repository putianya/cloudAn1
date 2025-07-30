package com.hy.mapper;

import com.hy.pojo.*;

import java.util.List;

import com.hy.result.PageResult;
import com.hy.result.ResultMediaSlot;
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

    List<MediaSlot> findMediaSlot(@Param("slot")ResultMediaSlot slot);

    List<String> findAllMedia();

    List<PlatBean> platformDeliveryComparison(@Param("cidA") String cidA, @Param("cidB")String cidB, @Param("filed")String filed);

    List<PlatBean> distributionOfSubMediaPlatforms(@Param("cidA") String cidA, @Param("cidB")String cidB, @Param("filed")String filed);

    List<PlatBean> contactTypeComposition(@Param("cidA") String cidA, @Param("cidB")String cidB, @Param("filed")String filed);

    List<PlatBean> contactDistribution(@Param("cidA") String cidA, @Param("cidB")String cidB, @Param("filed")String filed ,@Param("media") String media);
}