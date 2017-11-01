package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiItemParam;
import cn.yi3mall.pojo.YiItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiItemParamMapper {
    int countByExample(YiItemParamExample example);

    int deleteByExample(YiItemParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YiItemParam record);

    int insertSelective(YiItemParam record);

    List<YiItemParam> selectByExampleWithBLOBs(YiItemParamExample example);

    List<YiItemParam> selectByExample(YiItemParamExample example);

    YiItemParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YiItemParam record, @Param("example") YiItemParamExample example);

    int updateByExampleWithBLOBs(@Param("record") YiItemParam record, @Param("example") YiItemParamExample example);

    int updateByExample(@Param("record") YiItemParam record, @Param("example") YiItemParamExample example);

    int updateByPrimaryKeySelective(YiItemParam record);

    int updateByPrimaryKeyWithBLOBs(YiItemParam record);

    int updateByPrimaryKey(YiItemParam record);
}