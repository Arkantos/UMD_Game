package entities;

import backend.ItemType;

public interface Item<ItemType> 
{
	public String getItemID();
	
	
	public String generateItemID();
	
	
	public ItemType itemType();
	
	public int itemLevel();
	
	public int itemValue();
	
	
	
}
