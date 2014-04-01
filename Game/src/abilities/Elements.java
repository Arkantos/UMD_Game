package abilities;

/**
 * @author Michael
 *
 */
public enum Elements 
{
	NONE, LIGHTNING, EARTH, VOID, FLAME, AIR, WATER, LIGHT, DARK, POISON;
	
	public Elements combine(Elements e)
	{
		Elements returnE=NONE;
		switch(this)
		{
		case NONE:
			returnE=e;
			break;
		case AIR:
			break;
		case EARTH:
			break;
			
		
		}
		return returnE;
	}
	
}

