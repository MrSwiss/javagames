package cn.day04;

import java.util.Vector;

import javax.swing.JPanel;



public class Datawork extends Thread{
	/*
	 * //1.定义界面需要的元素类型  set get 方法
	 * 
*/	
	public static int numvers=0;
	public static int enemy_num=0;
	private JPanel jPanel;
	private WorkA wa;
	private Vector<Bant> vecBants=new Vector<Bant>();
	public Vector<Fire> getVectoreFire() {
		return vectoreFire;
	}
	public void setVectoreFire(Vector<Fire> vectoreFire) {
		this.vectoreFire = vectoreFire;
	}
	private Vector<Fire> vectoreFire=new Vector<Fire>();
	private Vector<workEnemy> VectorEnemy=new Vector<workEnemy>();
	public WorkA getWa() {
		return wa;
	}
	public void setWa(WorkA wa) {
		this.wa = wa;
	}
	public void run(){
		while(true){
			//addWorkEnemy();
			addFire();
			fireMove();
			addWorkEnemy();
			Enemy_Move();
			allBantMove();
			workAmove();
			collision();
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			numvers++;
			for(int i=0;i<VectorEnemy.size();i++){
				VectorEnemy.get(i).setEnemy_numvers(VectorEnemy.get(i).getEnemy_numvers()+1);
				VectorEnemy.get(i).addEnemyFire();
				//System.out.println(VectorEnemy.get(i).getEnemy_numvers()+"***");
			}
			jPanel.repaint();
		}
		
	}
	private void collision(){
		for(int i=vectoreFire.size()-1;i>=0;i--){
			for(int j=VectorEnemy.size()-1;j>=0;j--){
				if(((vectoreFire.get(i).getX()-VectorEnemy.get(j).getX()>-VectorEnemy.get(j).getSizex()/2))&&((vectoreFire.get(i).getX()-VectorEnemy.get(j).getX())<VectorEnemy.get(j).getSizex()/2)){
					if((vectoreFire.get(i).getY()-VectorEnemy.get(j).getY())<VectorEnemy.get(j).getSizey()/2){
						//vectoreFire.remove(i);
						//VectorEnemy.remove(j);
						VectorEnemy.get(j).setState(false);
						vectoreFire.get(i).setState(false);
						//System.out.println("unity");
					}
				}
			}
		}
	}
	private void fireMove() {
		// TODO Auto-generated method stub
		for(int k=vectoreFire.size()-1;k>=0;k--){
			vectoreFire.get(k).move();
			
			if(!vectoreFire.get(k).isState()){
			//	System.out.println(vectoreFire.get(k).isState()+"fire");
				vectoreFire.remove(k);
			}
			else if(vectoreFire.get(k).getY()<0){
				vectoreFire.remove(k);
			}
		}
		for(int i=0;i<VectorEnemy.size();i++){
			for(int j=0;j<VectorEnemy.get(i).getvectoreEnemyFire().size();j++){
				VectorEnemy.get(i).getvectoreEnemyFire().get(j).Enemy_move();
			if(VectorEnemy.get(i).getvectoreEnemyFire().get(j).getY()>Myframe.hh){
				VectorEnemy.get(i).getvectoreEnemyFire().remove(j);
			}
			}
			
			//System.out.println(VectorEnemy.get(i).getEnemy_numvers()+"***");
		}
	}
	private void Enemy_Move() {
		// TODO Auto-generated method stub
		for(int i=0;i<VectorEnemy.size();i++){
			workEnemy en=VectorEnemy.get(i);
			en.move();
			if(en.getY()>Myframe.hh){
				VectorEnemy.remove(i);
				enemy_num--;
				//System.out.println("sss"+i);
			}
			//System.out.println(VectorEnemy.get(i).isState());
			if(!en.isState()){
				enemy_num--;
				vecBants.add(new Bant(en.getX(), en.getY()));
				VectorEnemy.remove(i);
				WorkA.waNumber+=10;//计算分数
			}
		}
	}
	
	public void allBantMove(){
		if(numvers%10!=0){
			return;
		}
		for(int i=vecBants.size()-1;i>=0;i--){
			Bant b1=vecBants.get(i);
			if (b1.getPNGnumber()>7){
				vecBants.remove(i);
			}
			b1.setPNGnumber(b1.getPNGnumber()+1);
		}
	}
	
	public Datawork(JPanel jPanel ){
		//2初始化，对象初始化
		this.jPanel=jPanel;
		wa=new WorkA();
		//vectoreFire.add(new Fire(100,100));
}
	private void addFire(){
		if(wa.isFire()&&numvers%50==0){
			vectoreFire.add(new Fire(wa.getX(),wa.getY()));
			numvers=0;
			wa.setFire(false);
		}
	}
	

	private void addWorkEnemy(){
		if(enemy_num<5){
		int x=(int)(Math.random()*256);
		VectorEnemy.add(new workEnemy(x,0));
		System.out.println(enemy_num+"111");
		enemy_num++;
		}
	}
	
	private void workAmove(){
		if(wa.isUp()){
			wa.up();
		}
		if(wa.isDown()){
			wa.down();
		}
		if(wa.isLeft()){
			wa.left();
		}
		if(wa.isRight()){
			wa.right();
		}
	}
	public Vector<workEnemy> getVector() {
		return VectorEnemy;
	}
	public void setVector(Vector<workEnemy> vector) {
		VectorEnemy = vector;
	}
	public Vector<Bant> getVecBants() {
		return vecBants;
	}
	public void setVecBants(Vector<Bant> vecBants) {
		this.vecBants = vecBants;
	}
	
	
}
