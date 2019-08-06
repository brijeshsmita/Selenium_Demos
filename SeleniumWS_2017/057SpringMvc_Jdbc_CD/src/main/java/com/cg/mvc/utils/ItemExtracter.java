package com.cg.mvc.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.cg.mvc.model.Item;

/**
 * @author Smita Brijesh
 *
 */
public class ItemExtracter implements ResultSetExtractor {
    @Override
    public Item extractData(ResultSet resultSet) 
    		throws SQLException,DataAccessException {
        Item item = new Item();
        item.setItemId(resultSet.getLong(1));
        item.setItemName(resultSet.getString(2));
        item.setItemPrice(resultSet.getDouble(3));
        return item;
    }
}