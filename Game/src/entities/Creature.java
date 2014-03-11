package entities;

public interface Creature 
{
	/**
	 * 
	 * @return the id of the creature
	 */
	public String getCreatureID();
	
	/**
	 * generates an id for the creature based on level, name, max hp and mp, attack, and defense
	 * meant for monsters and npcs
	 * meant to only run once for a creature type, then be left alone
	 * @return a generated id
	 */
	public String generateCreatureID();
	
	/**
	 * 
	 * @return the level of the creature
	 */
	public int getLevel();
	
	/**
	 * 
	 * @return the current hp of the creature
	 */
	public int getHP();
	
	/**
	 * 
	 * @return the current mp of the creature
	 */
	public int getMP();
	
	/**
	 * 
	 * @return max hp of the creature
	 */
	public int getMaxHP();
	
	/**
	 * 
	 * @return max mp of the creature
	 */
	public int getMAXMP();
	
	/**
	 * 
	 * @return the attack value of the creature, minus elemental effects
	 */
	public int attackValue();
	
	/**
	 * 
	 * @return the defense value of the creature, minus elemental effects
	 */
	public int defendValue();
	
	public Item[] getItems();
	
}
