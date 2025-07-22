package com.hy.mapper;

import com.hy.pojo.ActivityPlatformInfluencertypeGroup;
import com.hy.pojo.ActivityPlatformInfluencertypeGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityPlatformInfluencertypeGroupMapper {
    int countByExample(ActivityPlatformInfluencertypeGroupExample example);

    int deleteByExample(ActivityPlatformInfluencertypeGroupExample example);

    int insert(ActivityPlatformInfluencertypeGroup record);

    int insertSelective(ActivityPlatformInfluencertypeGroup record);

    List<ActivityPlatformInfluencertypeGroup> selectByExample(ActivityPlatformInfluencertypeGroupExample example);

    int updateByExampleSelective(@Param("record") ActivityPlatformInfluencertypeGroup record, @Param("example") ActivityPlatformInfluencertypeGroupExample example);

    int updateByExample(@Param("record") ActivityPlatformInfluencertypeGroup record, @Param("example") ActivityPlatformInfluencertypeGroupExample example);
}