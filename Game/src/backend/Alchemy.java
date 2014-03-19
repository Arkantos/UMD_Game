package backend;

import entities.*;
import abilities.*;

public class Alchemy {
	public PowerGem combineGems(PowerGem gem1, PowerGem gem2)
	{
		CombinedPowerGem cGem=new CombinedPowerGem();
		Elements e1,e2;
		if(gem1 instanceof CombinedPowerGem)
		{
			int rand=(int)(Math.random()*2);
			if(rand==1)
				e1=gem1.getElement();
			else e1=((CombinedPowerGem)gem1).getElement2();
		}
		if(gem2 instanceof CombinedPowerGem)
		{
			int rand=(int)(Math.random()*2);
			if(rand==1)
				e1=gem2.getElement();
			else e1=((CombinedPowerGem)gem2).getElement2();
		}
		cGem.setCooldown(levelup(gem1.getCooldown(),gem2.getCooldown()));
		cGem.setCost(levelup(gem1.getCost(),gem2.getCost()));
		cGem.setDamageMod(levelup(gem1.getDamageMod(),gem2.getDamageMod()));
		
		
		return cGem;
	}
	public int levelup(int one, int two){
		double lev=one+two;
		lev*=2.2;
		lev=lev/2;
		return (int)lev;
	}

}
