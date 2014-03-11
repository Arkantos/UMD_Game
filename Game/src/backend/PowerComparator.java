package backend;

import java.util.Comparator;


import abilities.*;

public class PowerComparator implements Comparator<Power> 
{
	
	private ElementComparator comparator=new ElementComparator();
	@Override
	public int compare(Power p1, Power p2)
	{
		int compare=0, comp1=0,comp2=0;
		
		Elements p1e1=p1.getPrimaryElement(), p1e2=p1.getSecondaryElement(),
				p2e1=p2.getPrimaryElement(),p2e2=p2.getSecondaryElement();
		int mod1=(int)(Math.pow(1.05, p1.getLevel())),mod2=(int)(Math.pow(1.05, p2.getLevel()));
		comp1=comparator.compare(p1e1,p2e1);
		comp2=comparator.compare(p1e2,p2e2);
		switch(comp1)
		{
		case 0:
			break;
		case -1:
			break;
		case 1:
			break;
		case 2:
			break;
		case -2:
			break;
		default:
			
			break;
		}
		
		
		return compare;
	}

}
