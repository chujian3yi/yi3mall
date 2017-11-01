package cn.yi3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yi3mall.pojo.YiItem;
import cn.yi3mall.service.ItemService;

/**
 * @ClassName: ItemController
 * @title: 商品管理Controller
 * @Description: TODO
 * @author: Administrator
 * @company:www.yi3.cn
 * @date: 2017年10月31日 下午6:21:06 
 * @version:1.0
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public YiItem getItemById(@PathVariable Long itemId){
		//http://localhost/item/605616
		YiItem item = itemService.getItemById(itemId);
		return item;
	}
}
