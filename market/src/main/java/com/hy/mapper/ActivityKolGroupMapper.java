package com.hy.mapper;

import com.hy.pojo.ActivityKolGroup;
import com.hy.pojo.ActivityKolGroupExample;
import java.util.List;

import com.hy.result.PageResultQuery;
import org.apache.ibatis.annotations.Param;

public interface ActivityKolGroupMapper {
    int countByExample(ActivityKolGroupExample example);

    int deleteByExample(ActivityKolGroupExample example);

    int insert(ActivityKolGroup record);

    int insertSelective(ActivityKolGroup record);

    List<ActivityKolGroup> selectByExample(ActivityKolGroupExample example);

    int updateByExampleSelective(@Param("record") ActivityKolGroup record, @Param("example") ActivityKolGroupExample example);

    int updateByExample(@Param("record") ActivityKolGroup record, @Param("example") ActivityKolGroupExample example);

    List<ActivityKolGroup> findActivityKolGroup(@Param("query") PageResultQuery query);
}