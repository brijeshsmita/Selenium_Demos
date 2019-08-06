/**
 * 
 */
package com.cg.mvc.service;

import java.util.List;

import com.cg.mvc.model.Item;

/**
 * @author Brijesh
 *
 */
public interface ItemService {
    List getItems();
    void addItem(Item item);
}