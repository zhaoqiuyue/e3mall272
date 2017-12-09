package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
@Service
public class ItemServiceImpl implements ItemService {
	//注入商品mapper接口代理对象
	@Autowired
	private TbItemMapper itemMapper;

	//根据id查询商品
	public TbItem findItemByID(Long itemId) {
		TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		
		
		return tbItem;
	}

}
