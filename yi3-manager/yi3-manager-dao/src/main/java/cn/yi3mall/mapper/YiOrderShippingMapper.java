package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiOrderShipping;
import cn.yi3mall.pojo.YiOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiOrderShippingMapper {
    int countByExample(YiOrderShippingExample example);

    int deleteByExample(YiOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(YiOrderShipping record);

    int insertSelective(YiOrderShipping record);

    List<YiOrderShipping> selectByExample(YiOrderShippingExample example);

    YiOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") YiOrderShipping record, @Param("example") YiOrderShippingExample example);

    int updateByExample(@Param("record") YiOrderShipping record, @Param("example") YiOrderShippingExample example);

    int updateByPrimaryKeySelective(YiOrderShipping record);

    int updateByPrimaryKey(YiOrderShipping record);
}