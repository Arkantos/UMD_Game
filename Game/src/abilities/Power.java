package abilities;

/**
 * power can be passive or not
 * 
 * @author Michael
 *
 */
public interface Power 
{
	/**
	 * 
	 * @return the element of the power
	 */
	public Elements getElement();
	
	/**
	 * 
	 * @return a flavorful description of the power
	 * 
	 */
	public String getDescription();
	
	/**
	 * 
	 * @return the damage multiplier that the power has
	 */
	public int getDamage();
	
	/**
	 * 
	 * @return a description of the power
	 */
	public String toString();

	/**
	 * 
	 * @return the mana cost of the power
	 */
	public int drainMana();
	
	/**
	 * 
	 * @return a cooldown, if any
	 */
	public int cooldownTime();
	
	/**
	 * 
	 * @return the level needed to use the power
	 */
	public int levelReq();
	
}
