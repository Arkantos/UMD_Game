package entities;

import backend.*;
import abilities.*;


public class PowerGem implements Power, Item {

	@Override
	public String getItemID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateItemID() {
		
		return null;
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
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int drainMana() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cooldownTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int levelReq() {
		// TODO Auto-generated method stub
		return 0;
	}

}
