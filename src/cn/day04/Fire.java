package cn.day04;

public class Fire extends data {
    
	/**
	 * @param args
	 */
	private boolean state;
   public Fire(int x,int y){
	    super(x,y);
		this.sizex=15;
		this.sizey=18;
		this.dirurl="images/fire_enemy.PNG";
		state=true;
   }
   public Fire(int x,int y,String dirurl){
	    super(x,y);
		this.sizex=15;
		this.sizey=18;
		this.dirurl=dirurl;
		state=true;
  }
   public void move(){
	   
	   y-=3.5;
   }
 public void Enemy_move(){
	   
	   y+=3;
   }
public boolean isState() {
	return state;
}
public void setState(boolean state) {
	this.state = state;
}

}
