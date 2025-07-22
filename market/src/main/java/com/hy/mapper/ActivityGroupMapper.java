package com.hy.mapper;

import com.hy.pojo.ActivityGroup;
import com.hy.pojo.ActivityGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityGroupMapper {
    int countByExample(ActivityGroupExample example);

    int deleteByExample(ActivityGroupExample example);

    int insert(ActivityGroup record);

    int insertSelective(ActivityGroup record);

    List<ActivityGroup> selectByExample(ActivityGroupExample example);

    int updateByExampleSelective(@Param("record") ActivityGroup record, @Param("example") ActivityGroupExample example);

    int updateByExample(@Param("record") ActivityGroup record, @Param("example") ActivityGroupExample example);


    List<ActivityGroup> findActivityGroup(@Param("cname") String cname);
}