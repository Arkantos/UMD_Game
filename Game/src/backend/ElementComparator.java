package backend;

import java.util.Comparator;

import abilities.Elements;

public class ElementComparator implements Comparator<Elements> {

	@Override
	public int compare(Elements arg0, Elements arg1) 
	{
		int comp=0;
		
		switch(arg0)
		{
		case DARK:
			if(arg1==Elements.DARK||arg1==Elements.POISON)
				comp=-1;
			if(arg1==Elements.LIGHT)
				comp=1;
			break;
		case LIGHT:
			if(arg1==Elements.DARK||arg1==Elements.EARTH)
				comp=1;
			if(arg1==Elements.LIGHTNING)
				comp=-1;
			break;
		case POISON:
			break;
		case WATER:
			break;
		case WIND:
			break;
		case VOID:
			break;
		case FLAME:
			break;
		case EARTH:
			break;
		case LIGHTNING:
			break;
		case METAL:
			break;
		case SPIRIT:
			break;
		default:
			break;
		}
		
		
		
		
		
		
		return comp;
	}

}
