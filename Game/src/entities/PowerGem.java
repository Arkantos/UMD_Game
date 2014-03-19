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
	private final static ItemType GEMTYPE=ItemType.GEM;
	
	public String toString()
	{
		return "A powerful ELEMENTAL GEM";
	}
	public int getDamageMod() {
		return damageMod;
	}

	public void setDamageMod(int damageMod) {
		this.damageMod = damageMod;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

	public static int getLevelReq() {
		return levelReq;
	}

	public static void setLevelReq(int levelReq) {
		PowerGem.levelReq = levelReq;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public void setElement(Elements element) {
		this.element = element;
	}

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
		return GEMTYPE;
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
