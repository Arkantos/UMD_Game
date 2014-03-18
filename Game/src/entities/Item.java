package entities;

import backend.ItemType;

public interface Item 
{
	public String getItemID();
	
	
	public String generateItemID();
	
	
	public ItemType itemType();
	
}
