package backend;

public class Location {
	private int xLoc;
	private int yLoc;
	
	public Location(int x, int y){
		xLoc=x;
		yLoc=y;
	}
	public Location(){
		xLoc=100;
		yLoc=100;
	}
	public int getX() {
		return xLoc;
	}
	public void setX(int xLoc) {
		this.xLoc = xLoc;
	}
	public int getY() {
		return yLoc;
	}
	public void setY(int yLoc) {
		this.yLoc = yLoc;
	}
	

}
