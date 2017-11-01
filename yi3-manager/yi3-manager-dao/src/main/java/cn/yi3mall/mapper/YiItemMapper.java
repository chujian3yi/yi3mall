package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiItem;
import cn.yi3mall.pojo.YiItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiItemMapper {
    int countByExample(YiItemExample example);

    int deleteByExample(YiItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YiItem record);

    int insertSelective(YiItem record);

    List<YiItem> selectByExample(YiItemExample example);

    YiItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YiItem record, @Param("example") YiItemExample example);

    int updateByExample(@Param("record") YiItem record, @Param("example") YiItemExample example);

    int updateByPrimaryKeySelective(YiItem record);

    int updateByPrimaryKey(YiItem record);
}