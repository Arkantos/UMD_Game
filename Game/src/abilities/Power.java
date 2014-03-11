package abilities;

public interface Power 
{
	public Elements getPrimaryElement();
	
	public int getLevel();
	public Elements getSecondaryElement();
	
	public double getStrengthModifier();
	
	public double[] getElementDamageModifier();
	
	public String getDescription();
	
	public String toString();
	
	public int getMaxPower();
	
	public int computePrimaryDamage();
	
	public int computeSecondaryDamage();
	
	public double getDefenseModifier();
	
	public PowerType getPowerType();
	
	public boolean priority(Power p);

	public int drainUse();
	
	public int cooldown();
	
}
