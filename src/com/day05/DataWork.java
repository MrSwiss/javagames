package com.day05;


import java.util.Vector;
import java.awt.Rectangle;
import java.awt.datatransfer.*;

import javax.swing.JPanel;

import cn.day04.Bant;
/*作业：每次界面上都有5个敌机，打一再出一个*/
//320566303
//数据的总控  同时是对数据的修改和界面的再次刷新控制
public class DataWork extends Thread{
//	用于记录时间的*********
	public static int numvers=0;
	public static int paopaoNum=10;
//	记录当前的Jpanel对象，用于刷新控制
	private JPanel jPanel;
//	1.定义界面需要的元素类型(建立元素的类)产生set和get方法
	private BodyA ba;
	public Vector<paopao> getVecPaopao() {
		return vecPaopao;
	}

	public void setVecPaopao(Vector<paopao> vecPaopao) {
		this.vecPaopao = vecPaopao;
	}

	private Vector<paopao> vecPaopao=new Vector<paopao>();
//	构造方法，专门用于界面元素的初始化
	public DataWork(JPanel jPanel){
		this.jPanel=jPanel;
//	2.对界面元素进行初始化，保证每个对象的实例化
		ba=new BodyA();
	}
	
//	线程的方法重写run方法    专门用于定时的界面刷新
//	同时，还对元素数据做有规律的修改（获取元素的状态，依据不同状态做元素数据修改）
	public void run(){
		while(true){
//			4.开启多线程，进行数据的修改
			bodyType();
			ba.move();
			addPaopao();
			movePao();
			collisionPao();
			try {
				sleep(10);//休眠10毫秒	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			numvers++;
//			界面的强制刷新 让jpanel重新运行 paint方法
			jPanel.repaint();//请求面板再次刷新
		}
	}
	private void bodyType() {
		if(numvers%10!=0){
			return;
		}
		if(ba.getMovex()>=3){
			ba.setMovex(0);
			return;
		}
		ba.setMovex(ba.getMovex()+1);
	}
	
	private  void addPaopao(){
		if(ba.isAddPao()){
			//int ranx=(int)(Math.random()*UtilWork.jframex);
			//int rany=(int)(Math.random()*UtilWork.jframex);
			vecPaopao.add(new paopao(ba.getBaX(),ba.getBaY()));
			ba.setAddPao(false);
		}
		
	}
	private void movePao(){
		if(numvers%10!=0){
			return;
		}
		for(int i=vecPaopao.size()-1;i>=0;i--){
			paopao b1=vecPaopao.get(i);
			if(!b1.isState()){
				vecPaopao.remove(b1);
				return ;
			}
				
			if (b1.getFrame()>3){
				b1.setFrame(0);
			}
			b1.setFrame(b1.getFrame()+1);
			
		}
	}
	private void collisionPao() {//计算碰撞
		for(paopao en:vecPaopao){
//			产生一个以传输的参数为坐标而划分的区域空间
			Rectangle r1=new Rectangle(
					en.getX()-en.getSizex()/2, en.getY()-en.getSizey()/2, 
					en.getSizex(), en.getSizey()); 
			
				Rectangle r2=new Rectangle(
						ba.getBaX()-ba.getBaSizeX()/2, ba.getBaY()-ba.getBaSizeY()/2, 
						ba.getBaSizeX(), ba.getBaSizeY());
				if(r1.intersects(r2)&&ba.isDeltepao()){//计算2个区域对象是否有交集
				en.setState(false);//paopao的状态改变
				}
				
			
		}
	}

	public JPanel getjPanel() {
		return jPanel;
	}

	public void setjPanel(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	public BodyA getBa() {
		return ba;
	}

	public void setBa(BodyA ba) {
		this.ba = ba;
	}
	
	
}
