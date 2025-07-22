package com.hy.mapper;

import com.hy.pojo.ActivityPlatformContentDirectionGroup;
import com.hy.pojo.ActivityPlatformContentDirectionGroupExample;
import java.util.List;

import com.hy.result.PageResultQuery;
import org.apache.ibatis.annotations.Param;

public interface ActivityPlatformContentDirectionGroupMapper {
    int countByExample(ActivityPlatformContentDirectionGroupExample example);

    int deleteByExample(ActivityPlatformContentDirectionGroupExample example);

    int insert(ActivityPlatformContentDirectionGroup record);

    int insertSelective(ActivityPlatformContentDirectionGroup record);

    List<ActivityPlatformContentDirectionGroup> selectByExample(ActivityPlatformContentDirectionGroupExample example);

    int updateByExampleSelective(@Param("record") ActivityPlatformContentDirectionGroup record, @Param("example") ActivityPlatformContentDirectionGroupExample example);

    int updateByExample(@Param("record") ActivityPlatformContentDirectionGroup record, @Param("example") ActivityPlatformContentDirectionGroupExample example);

    List<ActivityPlatformContentDirectionGroup> findActivityDirectionGroup(@Param("query") PageResultQuery query);
}