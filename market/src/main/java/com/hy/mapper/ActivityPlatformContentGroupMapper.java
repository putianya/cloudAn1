package com.hy.mapper;

import com.hy.pojo.ActivityPlatformContentGroup;
import com.hy.pojo.ActivityPlatformContentGroupExample;
import java.util.List;

import com.hy.result.PageResultQuery;
import org.apache.ibatis.annotations.Param;

public interface ActivityPlatformContentGroupMapper {
    int countByExample(ActivityPlatformContentGroupExample example);

    int deleteByExample(ActivityPlatformContentGroupExample example);

    int insert(ActivityPlatformContentGroup record);

    int insertSelective(ActivityPlatformContentGroup record);

    List<ActivityPlatformContentGroup> selectByExample(ActivityPlatformContentGroupExample example);

    int updateByExampleSelective(@Param("record") ActivityPlatformContentGroup record, @Param("example") ActivityPlatformContentGroupExample example);

    int updateByExample(@Param("record") ActivityPlatformContentGroup record, @Param("example") ActivityPlatformContentGroupExample example);

    List<ActivityPlatformContentGroup> findActivityPlatformContentGroup(@Param("query") PageResultQuery query);
}