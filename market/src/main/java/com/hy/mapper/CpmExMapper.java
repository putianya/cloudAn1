package com.hy.mapper;

import com.hy.pojo.CpmEx;
import com.hy.pojo.CpmExExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpmExMapper {
    int countByExample(CpmExExample example);

    int deleteByExample(CpmExExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CpmEx record);

    int insertSelective(CpmEx record);

    List<CpmEx> selectByExample(CpmExExample example);

    CpmEx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CpmEx record, @Param("example") CpmExExample example);

    int updateByExample(@Param("record") CpmEx record, @Param("example") CpmExExample example);

    int updateByPrimaryKeySelective(CpmEx record);

    int updateByPrimaryKey(CpmEx record);
}