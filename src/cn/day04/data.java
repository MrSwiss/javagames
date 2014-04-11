package cn.day04;

public class data implements dataInterface {
	protected int x;
	protected int y;
	protected String dirurl;
	protected int sizex;
	protected int sizey;
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x=x;
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y=y;
		
	}

	@Override
	public String getDirurl() {
		// TODO Auto-generated method stub
		return dirurl;
	}

	@Override
	public void setDirurl(String dirurl) {
		// TODO Auto-generated method stub
		this.dirurl=dirurl;
		
	}

	@Override
	public int getSizex() {
		// TODO Auto-generated method stub
		return sizex;
	}

	@Override
	public void setSizex(int sizex) {
		// TODO Auto-generated method stub
		this.sizex=sizex;
		
	}

	@Override
	public int getSizey() {
		// TODO Auto-generated method stub
		return sizey;
	}

	@Override
	public void setSizey(int sizey) {
		// TODO Auto-generated method stub
		this.sizey=sizey;
		
	}
	 public data(int x,int y){
		    this.x=x;
			this.y=y;
	   }
	 public data(){
		 
	 }
	

}
