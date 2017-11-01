package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiContent;
import cn.yi3mall.pojo.YiContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiContentMapper {
    int countByExample(YiContentExample example);

    int deleteByExample(YiContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YiContent record);

    int insertSelective(YiContent record);

    List<YiContent> selectByExampleWithBLOBs(YiContentExample example);

    List<YiContent> selectByExample(YiContentExample example);

    YiContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YiContent record, @Param("example") YiContentExample example);

    int updateByExampleWithBLOBs(@Param("record") YiContent record, @Param("example") YiContentExample example);

    int updateByExample(@Param("record") YiContent record, @Param("example") YiContentExample example);

    int updateByPrimaryKeySelective(YiContent record);

    int updateByPrimaryKeyWithBLOBs(YiContent record);

    int updateByPrimaryKey(YiContent record);
}