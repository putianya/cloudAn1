package com.hy.mapper;

import com.hy.pojo.ActivityPlatformInfluencergradeGroup;
import com.hy.pojo.ActivityPlatformInfluencergradeGroupExample;
import java.util.List;

import com.hy.result.PageResultQuery;
import org.apache.ibatis.annotations.Param;

public interface ActivityPlatformInfluencergradeGroupMapper {
    int countByExample(ActivityPlatformInfluencergradeGroupExample example);

    int deleteByExample(ActivityPlatformInfluencergradeGroupExample example);

    int insert(ActivityPlatformInfluencergradeGroup record);

    int insertSelective(ActivityPlatformInfluencergradeGroup record);

    List<ActivityPlatformInfluencergradeGroup> selectByExample(ActivityPlatformInfluencergradeGroupExample example);

    int updateByExampleSelective(@Param("record") ActivityPlatformInfluencergradeGroup record, @Param("example") ActivityPlatformInfluencergradeGroupExample example);

    int updateByExample(@Param("record") ActivityPlatformInfluencergradeGroup record, @Param("example") ActivityPlatformInfluencergradeGroupExample example);

    List<ActivityPlatformInfluencergradeGroup> findActivityPlatformInfluencergradeGroup(@Param("query")PageResultQuery query);
}