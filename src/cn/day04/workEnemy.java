package cn.day04;

import java.util.Vector;
/*manage enemy:all it attribute and behavior and enemy's fire*/
public class workEnemy extends data {
	private int enemy_numvers;
	private boolean isFire;
	private boolean state;
	private Vector<Fire> vectoreEnemyFire=new Vector<Fire>();
	public boolean isFire() {
		return isFire;
	}
	public void setFire(boolean isFire) {
		this.isFire = isFire;
	}
	/**
	 * @param args
	 */
public workEnemy(int x,int y){
		    super(x,y);
			this.sizex=25;
			this.sizey=25;
			this.dirurl="images/enemy.PNG";
			enemy_numvers=0;
			isFire=true;
			state=true;
	   }
public workEnemy(){
	isFire=false;
	this.x=100;
	this.y=500;
	this.sizex=50;
	this.sizey=50;
	this.dirurl="images/enemy.PNG";
	state=true;
}
	public Vector<Fire> getvectoreEnemyFire() {
		return vectoreEnemyFire;
	}
	public void setvectoreEnemyFire(Vector<Fire> vectoreEnemyFire) {
		this.vectoreEnemyFire = vectoreEnemyFire;
	}
	public void addEnemyFire(){
		//int x=(int)(Math.random()*256);
		
		if(isFire()&&enemy_numvers%150==0){
			vectoreEnemyFire.add(new Fire(x,y,"images/fire.PNG"));
			//System.out.println(E.getvectoreEnemyFire());
			enemy_numvers=0;
	//		E.setFire(false);
		}	
		
		
	}

	public  void move(){
		int x=(int)(Math.random()*100)/40;
		y=y+x;
		
	}
	public int getEnemy_numvers() {
		return enemy_numvers;
	}
	public void setEnemy_numvers(int enemy_numvers) {
		this.enemy_numvers = enemy_numvers;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
}
