package com.lewis.mapper;

import com.lewis.pojo.PosName;
import com.lewis.pojo.PosNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PosNameMapper {
    int countByExample(PosNameExample example);

    int deleteByExample(PosNameExample example);

    int deleteByPrimaryKey(Integer positionId);

    int insert(PosName record);

    int insertSelective(PosName record);

    List<PosName> selectByExample(PosNameExample example);

    PosName selectByPrimaryKey(Integer positionId);

    int updateByExampleSelective(@Param("record") PosName record, @Param("example") PosNameExample example);

    int updateByExample(@Param("record") PosName record, @Param("example") PosNameExample example);

    int updateByPrimaryKeySelective(PosName record);

    int updateByPrimaryKey(PosName record);
}