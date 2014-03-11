package abilities;

import backend.*;


public class AttackPower implements Power
{
	private Elements primaryElement;
	private Elements secondaryElement;
	public int level;
	private double strengthMod;
	private double[] elementDamageMod;
	private String description;
	private int maxPower;
	private double defenseMod;
	private ElementComparator comparator;
	private PowerType powerType;
	public int cooldown;
	public int drain;
	//private Entity user;
	
	
	
	public AttackPower()
	{
		primaryElement=Elements.NULL;
		secondaryElement=Elements.NULL;
		level=1;
		strengthMod=1.0;
		cooldown=1;
		drain=1;
		powerType=PowerType.NULL;
		defenseMod=0;
		comparator=new ElementComparator();
		maxPower=1;
		description="The default attack power";
		
	}
	@Override
	public Elements getPrimaryElement() {
		// TODO Auto-generated method stub
		return primaryElement;
	}

	@Override
	public Elements getSecondaryElement() {
		// TODO Auto-generated method stub
		return secondaryElement;
	}
	
	public int getLevel()
	{
		return level;
	}

	@Override
	public double getStrengthModifier() 
	{
		// TODO Auto-generated method stub
		return strengthMod;
	}

	@Override
	public double[] getElementDamageModifier() {
		// TODO Auto-generated method stub
		return elementDamageMod;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public int getMaxPower() {
		// TODO Auto-generated method stub
		return maxPower;
	}

	@Override
	public int computePrimaryDamage() 
	{
		
		return 0;
	}

	@Override
	public int computeSecondaryDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDefenseModifier() {
		// TODO Auto-generated method stub
		return defenseMod;
	}

	@Override
	public PowerType getPowerType() {
		// TODO Auto-generated method stub
		return powerType;
	}

	@Override
	public boolean priority(Power p)
	{
		
		
		
		return false;
	}

	@Override
	public int drainUse() {
		
		return drain;
	}

	@Override
	public int cooldown() 
	{
		// TODO Auto-generated method stub
		return cooldown;
	}

}
