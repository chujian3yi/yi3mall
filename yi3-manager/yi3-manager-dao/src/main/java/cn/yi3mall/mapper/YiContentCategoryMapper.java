package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiContentCategory;
import cn.yi3mall.pojo.YiContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiContentCategoryMapper {
    int countByExample(YiContentCategoryExample example);

    int deleteByExample(YiContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YiContentCategory record);

    int insertSelective(YiContentCategory record);

    List<YiContentCategory> selectByExample(YiContentCategoryExample example);

    YiContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YiContentCategory record, @Param("example") YiContentCategoryExample example);

    int updateByExample(@Param("record") YiContentCategory record, @Param("example") YiContentCategoryExample example);

    int updateByPrimaryKeySelective(YiContentCategory record);

    int updateByPrimaryKey(YiContentCategory record);
}