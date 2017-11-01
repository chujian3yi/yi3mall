package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiItemParamItem;
import cn.yi3mall.pojo.YiItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiItemParamItemMapper {
    int countByExample(YiItemParamItemExample example);

    int deleteByExample(YiItemParamItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YiItemParamItem record);

    int insertSelective(YiItemParamItem record);

    List<YiItemParamItem> selectByExampleWithBLOBs(YiItemParamItemExample example);

    List<YiItemParamItem> selectByExample(YiItemParamItemExample example);

    YiItemParamItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YiItemParamItem record, @Param("example") YiItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") YiItemParamItem record, @Param("example") YiItemParamItemExample example);

    int updateByExample(@Param("record") YiItemParamItem record, @Param("example") YiItemParamItemExample example);

    int updateByPrimaryKeySelective(YiItemParamItem record);

    int updateByPrimaryKeyWithBLOBs(YiItemParamItem record);

    int updateByPrimaryKey(YiItemParamItem record);
}