package com.hy.mapper;

import com.hy.pojo.ActivityPlatformGroup;
import com.hy.pojo.ActivityPlatformGroupExample;
import java.util.List;

import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import org.apache.ibatis.annotations.Param;

public interface ActivityPlatformGroupMapper {
    int countByExample(ActivityPlatformGroupExample example);

    int deleteByExample(ActivityPlatformGroupExample example);

    int insert(ActivityPlatformGroup record);

    int insertSelective(ActivityPlatformGroup record);

    List<ActivityPlatformGroup> selectByExample(ActivityPlatformGroupExample example);

    int updateByExampleSelective(@Param("record") ActivityPlatformGroup record, @Param("example") ActivityPlatformGroupExample example);

    int updateByExample(@Param("record") ActivityPlatformGroup record, @Param("example") ActivityPlatformGroupExample example);

    List<ActivityPlatformGroup> findActivityPlatformGroup(@Param("query") PageResultQuery query);
}