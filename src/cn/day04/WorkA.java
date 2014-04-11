package cn.day04;
/*keep keyboard status*/
public class WorkA extends data{
	private boolean up;
	public boolean isUp() {
		return up;
	}
	public void setUp(boolean up) {
		this.up = up;
	}
	public boolean isDown() {
		return down;
	}
	public void setDown(boolean down) {
		this.down = down;
	}
	public boolean isLeft() {
		return left;
	}
	public void setLeft(boolean left) {
		this.left = left;
	}
	public boolean isRight() {
		return right;
	}
	public void setRight(boolean right) {
		this.right = right;
	}
	private boolean down;
	private boolean left;
	private boolean right;
	public static int waNumber;
	private boolean isFire;
	public boolean isFire() {
		return isFire;
	}
	public void setFire(boolean isFire) {
		this.isFire = isFire;
	}
	private  int workMoveNumber;
	/**
	 * @param args
	 */
public WorkA(){
	isFire=false;
	this.x=100;
	this.y=500;
	this.sizex=UtilWork.Workasizex;
	this.sizey=UtilWork.workasizey;
	this.dirurl=UtilWork.workaurl;
	 up=false;
	down=false;
     left=false;
	right=false;
	workMoveNumber=2;
	waNumber=0;
}
	public void up() {
		// TODO Auto-generated method stub
		if(y>=30)
		y-=workMoveNumber;
		
	}
	public void down() {
		// TODO Auto-generated method stub
		if(y<=560)
		y+=workMoveNumber;
		
	}
	public void left() {
		// TODO Auto-generated method stub
		if(x>30)
		x-=workMoveNumber;
		
	}
	
	public void right() {
		// TODO Auto-generated method stub
		if(x<380)
		x+=workMoveNumber;
		
	}
	

}
