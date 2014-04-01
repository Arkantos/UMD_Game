package entities;

import backend.Location;

public class Player implements Creature {

	public int experience;
	public int experienceToLevel;
	public static final int EXP_PER_LEVEL=100;
	//public Item[] equippedItems;
	public Inventory inventory;
	public int level;
	public int curr_hp;
	public int MAX_HP;
	public int curr_mp;
	public int MAX_MP;
	public int attack;
	public int defense;
	private Location location;
	
	
	@Override
	public String getCreatureID() {
		// TODO Auto-generated method stub
		return "1";
	}

	
	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxHP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxMP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int attackValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defendValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Item[] getItems() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Inventory getInventory() {
		// TODO Auto-generated method stub
		return inventory;
	}


	public Location getLocation()
	{
		return location;
	}
	@Override
	public Location moveBy(int x, int y) {
		int currX=location.getX(), currY=location.getY();
		location.setX(currX+x);
		location.setY(currY+y);
		return location;
	}

}
