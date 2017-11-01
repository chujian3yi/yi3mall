package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiItemCat;
import cn.yi3mall.pojo.YiItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiItemCatMapper {
    int countByExample(YiItemCatExample example);

    int deleteByExample(YiItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YiItemCat record);

    int insertSelective(YiItemCat record);

    List<YiItemCat> selectByExample(YiItemCatExample example);

    YiItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YiItemCat record, @Param("example") YiItemCatExample example);

    int updateByExample(@Param("record") YiItemCat record, @Param("example") YiItemCatExample example);

    int updateByPrimaryKeySelective(YiItemCat record);

    int updateByPrimaryKey(YiItemCat record);
}