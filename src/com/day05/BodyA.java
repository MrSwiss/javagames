package com.day05;


public class BodyA {//泡泡堂玩家A
	private int baX;
	private int baY;
	private String baUrl;
	private int baSizeX;
	private int baSizeY;
	
	private int movex;//用于计算图片的截取
	private int movey;//用于计算图片的截取
	
	private boolean up;//movey=3
	private boolean down;//movey=0
	private boolean left;//movey=1
	private boolean right;//movey=2
	private boolean deltepao;
	
	private boolean isAddPao;
	public BodyA(){
		baX=UtilWork.bodyx;
		baY=UtilWork.bodyy;
		baUrl=UtilWork.workaurl;
		baSizeX=UtilWork.workasizex;
		baSizeY=UtilWork.workasizey;
		up=false;
		down=false;
		left=false;
		right=false;
		movex=0;
		movey=0;
		isAddPao=false;
		deltepao=false;
	}
	public void move(){
		if(up)
			baY-=2;
		if(down)
			baY+=2;
		if(left)
			baX-=2;
		if(right)
			baX+=2;
		
	}
	public int getBaX() {
		return baX;
	}
	public void setBaX(int baX) {
		this.baX = baX;
	}
	public int getBaY() {
		return baY;
	}
	public void setBaY(int baY) {
		this.baY = baY;
	}
	public String getBaUrl() {
		return baUrl;
	}
	public void setBaUrl(String baUrl) {
		this.baUrl = baUrl;
	}
	public int getBaSizeX() {
		return baSizeX;
	}
	public void setBaSizeX(int baSizeX) {
		this.baSizeX = baSizeX;
	}
	public int getBaSizeY() {
		return baSizeY;
	}
	public void setBaSizeY(int baSizeY) {
		this.baSizeY = baSizeY;
	}
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
	public int getMovex() {
		return movex;
	}
	public void setMovex(int movex) {
		this.movex = movex;
	}
	public int getMovey() {
		return movey;
	}
	public void setMovey(int movey) {
		this.movey = movey;
	}
	public boolean isAddPao() {
		return isAddPao;
	}
	public void setAddPao(boolean isAddPao) {
		this.isAddPao = isAddPao;
	}
	public boolean isDeltepao() {
		return deltepao;
	}
	public void setDeltepao(boolean deltepao) {
		this.deltepao = deltepao;
	}
	
	
	
	
}
