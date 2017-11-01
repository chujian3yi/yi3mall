package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiOrderItem;
import cn.yi3mall.pojo.YiOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiOrderItemMapper {
    int countByExample(YiOrderItemExample example);

    int deleteByExample(YiOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(YiOrderItem record);

    int insertSelective(YiOrderItem record);

    List<YiOrderItem> selectByExample(YiOrderItemExample example);

    YiOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YiOrderItem record, @Param("example") YiOrderItemExample example);

    int updateByExample(@Param("record") YiOrderItem record, @Param("example") YiOrderItemExample example);

    int updateByPrimaryKeySelective(YiOrderItem record);

    int updateByPrimaryKey(YiOrderItem record);
}