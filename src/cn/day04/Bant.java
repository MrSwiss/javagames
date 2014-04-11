package cn.day04;

public class Bant extends data{
	private boolean isFire;
	private boolean isType;
	private int PNGnumber;
	public Bant(int x,int y){
		this.x=x;
		this.y=y;
		this.sizex=UtilWork.bantsizey;
		this.sizey=UtilWork.bantsizey;
		dirurl="images/bang.PNG";
		isType=true;
		PNGnumber=6;
	}
	
	
	public int getPNGnumber() {
		return PNGnumber;
	}


	public void setPNGnumber(int pNGnumber) {
		PNGnumber = pNGnumber;
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSizex() {
		return sizex;
	}
	public void setSizex(int sizex) {
		this.sizex = sizex;
	}
	public int getSizey() {
		return sizey;
	}
	public void setSizey(int sizey) {
		this.sizey = sizey;
	}
	public String getDirurl() {
		return dirurl;
	}
	public void setDirurl(String dirurl) {
		this.dirurl = dirurl;
	}
	public boolean isFire() {
		return isFire;
	}
	public void setFire(boolean isFire) {
		this.isFire = isFire;
	}
	public boolean isType() {
		return isType;
	}
	public void setType(boolean isType) {
		this.isType = isType;
	}
	
}
