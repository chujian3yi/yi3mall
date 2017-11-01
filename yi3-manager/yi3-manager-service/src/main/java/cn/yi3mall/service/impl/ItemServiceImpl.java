package cn.yi3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yi3mall.mapper.YiItemMapper;
import cn.yi3mall.pojo.YiItem;
import cn.yi3mall.pojo.YiItemExample;
import cn.yi3mall.pojo.YiItemExample.Criteria;
import cn.yi3mall.service.ItemService;


 /**
  * @ClassName: ItemServiceImpl
  * @title: 商品管理Service
  * @Description: TODO
  * @author: Administrator
  * @company:www.yi3.cn
  * @date: 2017年10月31日 下午5:39:22 
  * @version:1.0
  */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private YiItemMapper itemMapper;
	@Override
	public YiItem getItemById(long itemId) {
		// TODO 根据主键查询
		//YiItem item = itemMapper.selectByPrimaryKey(itemId);
		//根据条件查询
		YiItemExample example = new YiItemExample();
		Criteria criteria = example.createCriteria();
		//设置条件
		criteria.andIdEqualTo(itemId);
		//执行查询
		List<YiItem> list = itemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
