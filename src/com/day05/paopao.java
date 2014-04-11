package com.day05;

public class paopao extends data {
	private boolean state;
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getFrame() {
		return frame;
	}
	public void setFrame(int frame) {
		this.frame = frame;
	}
	private int frame;
	public paopao(int x,int y){
	    super(x,y);
		this.sizex=UtilWork.paosizex;
		this.sizey=UtilWork.paosizey;
		this.dirurl=UtilWork.paopao;
		System.out.println(dirurl);
		state=true;
		frame=0;
   }

}
