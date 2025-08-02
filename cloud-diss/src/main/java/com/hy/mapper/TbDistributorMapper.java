package com.hy.mapper;

import com.hy.pojo.TbDistributor;
import com.hy.pojo.TbDistributorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDistributorMapper {
    int countByExample(TbDistributorExample example);

    int deleteByExample(TbDistributorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDistributor record);

    int insertSelective(TbDistributor record);

    List<TbDistributor> selectByExample(TbDistributorExample example);

    TbDistributor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDistributor record, @Param("example") TbDistributorExample example);

    int updateByExample(@Param("record") TbDistributor record, @Param("example") TbDistributorExample example);

    int updateByPrimaryKeySelective(TbDistributor record);

    int updateByPrimaryKey(TbDistributor record);
}