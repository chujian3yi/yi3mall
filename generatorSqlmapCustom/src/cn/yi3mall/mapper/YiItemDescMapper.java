package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiItemDesc;
import cn.yi3mall.pojo.YiItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiItemDescMapper {
    int countByExample(YiItemDescExample example);

    int deleteByExample(YiItemDescExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(YiItemDesc record);

    int insertSelective(YiItemDesc record);

    List<YiItemDesc> selectByExampleWithBLOBs(YiItemDescExample example);

    List<YiItemDesc> selectByExample(YiItemDescExample example);

    YiItemDesc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") YiItemDesc record, @Param("example") YiItemDescExample example);

    int updateByExampleWithBLOBs(@Param("record") YiItemDesc record, @Param("example") YiItemDescExample example);

    int updateByExample(@Param("record") YiItemDesc record, @Param("example") YiItemDescExample example);

    int updateByPrimaryKeySelective(YiItemDesc record);

    int updateByPrimaryKeyWithBLOBs(YiItemDesc record);

    int updateByPrimaryKey(YiItemDesc record);
}