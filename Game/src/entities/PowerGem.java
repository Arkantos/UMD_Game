package entities;

import backend.*;
import abilities.*;


public class PowerGem implements Power, Item {

	private String itemID;
	private Elements element;
	private int damageMod;
	private int cost;
	private int cooldown;
	private static int levelReq;
	@Override
	public String getItemID() {
		// TODO Auto-generated method stub
		return itemID;
	}

	@Override
	public String generateItemID() {
		
		itemID=""+element+damageMod+cost+cooldown+levelReq;
		return itemID;
	}

	@Override
	public ItemType itemType() 
	{
		// TODO Auto-generated method stub
		return ItemType.GEM;
	}

	@Override
	public Elements getElement() {
		// TODO Auto-generated method stub
		return element;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return damageMod;
	}

	@Override
	public int drainMana() {
		// TODO Auto-generated method stub
		return cost;
	}

	@Override
	public int cooldownTime() {
		// TODO Auto-generated method stub
		return cooldown;
	}

	@Override
	public int levelReq() {
		// TODO Auto-generated method stub
		return levelReq;
	}

}
