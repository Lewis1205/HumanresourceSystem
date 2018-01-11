package com.lewis.mapper;

import com.lewis.pojo.PosCategory;
import com.lewis.pojo.PosCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PosCategoryMapper {
    int countByExample(PosCategoryExample example);

    int deleteByExample(PosCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(PosCategory record);

    int insertSelective(PosCategory record);

    List<PosCategory> selectByExample(PosCategoryExample example);

    PosCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") PosCategory record, @Param("example") PosCategoryExample example);

    int updateByExample(@Param("record") PosCategory record, @Param("example") PosCategoryExample example);

    int updateByPrimaryKeySelective(PosCategory record);

    int updateByPrimaryKey(PosCategory record);
}