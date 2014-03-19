package entities;

import abilities.*;

public class CombinedPowerGem extends PowerGem 
{
	private Elements element2;
	public void setElement2(Elements e2){
		element2=e2;
	}
	public void setElement1(Elements e1){
		super.setElement(e1);
	}
	public Elements getElement1(){
		return super.getElement();
	}
	public Elements getElement2() {
		// TODO Auto-generated method stub
		return element2;
	}
	public String toString()
	{
		return "A powerful COMBINED ELEMENTAL GEM.";
	}
	
}
