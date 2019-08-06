/**
 * 
 */
package com.cg.mvc.service;

import java.util.List;

import com.cg.mvc.dao.ItemDao;
import com.cg.mvc.model.Item;

/**
 * @author Brijesh
 *
 */
public class ItemServiceImpl implements ItemService{
	ItemDao itemDao;
    public ItemDao getItemDao() {
        return itemDao;
    }
    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
    @Override
    public List getItems() {
        return itemDao.getItems();
    }
    @Override
    public void addItem(Item item) {
        itemDao.addItem(item);
    }
}
