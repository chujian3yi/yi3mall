package cn.yi3mall.mapper;

import cn.yi3mall.pojo.YiUser;
import cn.yi3mall.pojo.YiUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiUserMapper {
    int countByExample(YiUserExample example);

    int deleteByExample(YiUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YiUser record);

    int insertSelective(YiUser record);

    List<YiUser> selectByExample(YiUserExample example);

    YiUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YiUser record, @Param("example") YiUserExample example);

    int updateByExample(@Param("record") YiUser record, @Param("example") YiUserExample example);

    int updateByPrimaryKeySelective(YiUser record);

    int updateByPrimaryKey(YiUser record);
}