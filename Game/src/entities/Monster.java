package entities;

import backend.Location;

public class Monster implements Creature {
	private Inventory inventory;
	private int level;
	private int curr_hp;
	private int MAX_HP;
	private int curr_mp;
	private int MAX_MP;
	private int attack;
	private int defense;
	private String id;
	private Location loc;
	public void setLevel(int level) {
		this.level = level;
	}

	public void setCurr_hp(int curr_hp) {
		this.curr_hp = curr_hp;
	}

	public void setMAX_HP(int mAX_HP) {
		MAX_HP = mAX_HP;
	}

	public void setCurr_mp(int curr_mp) {
		this.curr_mp = curr_mp;
	}

	public void setMAX_MP(int mAX_MP) {
		MAX_MP = mAX_MP;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getCreatureID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return level;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return curr_hp;
	}

	@Override
	public int getMP() {
		// TODO Auto-generated method stub
		return curr_mp;
	}

	@Override
	public int getMaxHP() {
		// TODO Auto-generated method stub
		return MAX_HP;
	}

	@Override
	public int getMaxMP() {
		// TODO Auto-generated method stub
		return MAX_MP;
	}

	@Override
	public int attackValue() {
		// TODO Auto-generated method stub
		return attack;
	}

	@Override
	public int defendValue() {
		// TODO Auto-generated method stub
		return defense;
	}

	@Override
	public Item[] getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory getInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Location getLocation()
	{
		return loc;
	}
	@Override
	public Location moveBy(int x, int y) {
		int currX=loc.getX(), currY=loc.getY();
		loc.setX(currX+x);
		loc.setY(currY+y);
		return loc;
	}

}
