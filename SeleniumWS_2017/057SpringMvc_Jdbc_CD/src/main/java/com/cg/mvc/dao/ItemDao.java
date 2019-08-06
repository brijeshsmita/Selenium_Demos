/**
 * 
 */
package com.cg.mvc.dao;

/**
 * @author Brijesh
 *
 */
import java.util.List;

import com.cg.mvc.model.Item;
public interface ItemDao {
    List getItems();
    void addItem(Item item);
}
