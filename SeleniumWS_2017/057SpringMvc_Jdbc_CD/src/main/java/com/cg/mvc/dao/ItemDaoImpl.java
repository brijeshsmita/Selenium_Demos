/**
 * 
 */
package com.cg.mvc.dao;

/**
 * @author Brijesh
 *
 */
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.mvc.model.Item;
import com.cg.mvc.utils.ItemRowMapper;
public class ItemDaoImpl implements ItemDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
    public List getItems() {
        String sql = "SELECT * FROM items";
        List items = new ArrayList();
        items = jdbcTemplate.query(sql, new ItemRowMapper());
        return items;
    }

	@Override
	public void addItem(Item item) {
		 String sql = "INSERT INTO items(item_name,item_price) VALUES (?,?)";
	        jdbcTemplate.update(sql,
	                new Object[] { item.getItemName(), 
	        		item.getItemPrice() });
		
	}
}