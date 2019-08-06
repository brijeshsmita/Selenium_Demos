package com.cg.mvc.model;
/**
 * @author Brijesh
 *
 */
public class Item {
	private Long itemId;
    private String itemName;
    private Double itemPrice;
    public Item(){
    	
    }
    public Long getItemId() {
        return itemId;
    }
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemPrice=" + itemPrice + "]";
	}
    
}
