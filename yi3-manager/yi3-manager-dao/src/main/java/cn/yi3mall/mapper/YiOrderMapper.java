package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiOrder;
import cn.yi3mall.pojo.YiOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiOrderMapper {
    int countByExample(YiOrderExample example);

    int deleteByExample(YiOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(YiOrder record);

    int insertSelective(YiOrder record);

    List<YiOrder> selectByExample(YiOrderExample example);

    YiOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") YiOrder record, @Param("example") YiOrderExample example);

    int updateByExample(@Param("record") YiOrder record, @Param("example") YiOrderExample example);

    int updateByPrimaryKeySelective(YiOrder record);

    int updateByPrimaryKey(YiOrder record);
}