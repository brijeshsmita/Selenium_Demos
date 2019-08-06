/**
 * 
 */
package com.cg.mvc.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cg.mvc.model.Item;

/**
 * @author Brijesh
 *
 */
public class ItemRowMapper implements RowMapper {
    @Override
    public Item mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        ItemExtracter itemExtracter = new ItemExtracter();
        return itemExtracter.extractData(resultSet);
    }
}