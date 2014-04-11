package com.day05;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import cn.day04.Bant;

public class MyJPanel extends JPanel{
//	连接界面上的元素和界面面板之间的桥梁
	private DataWork dw;
//	监听（鼠标的，和键盘的）
	private MThread mth;
//	构造方法  
//	1.进行本身的属性设置
//	2.进行相关的数据和监听的实例化
//	3.和数据控制，监听进行绑定
	public MyJPanel(){
//		设置背景颜色
		setBackground(Color.BLACK);
//		实例化出数据的总控(多线程，元素的移动控制)
		dw=new DataWork(this);
		dw.start();//线程启动
//		监听的实例化
		mth=new MThread(dw);
//		鼠标点击事件的加载到JPanel
		addMouseListener(mth);//是添加鼠标监听事件
//		鼠标移动事件的加载到JPanel
		addMouseMotionListener(mth);//是添加鼠标监听事件
//		键盘的监听的加载到JPanel 
//		addKeyListener(mth);
	}
//	获取元素的数据，并依据元素数据进行界面的渲染,只能渲染一次
	@Override  //重写 覆盖   覆盖父类的方法 实现多态的一种方式
	public void paint(Graphics g) {//Graphics相当于一个画笔
//		调用父类的paint方法
		super.paint(g);
//		3.获取元素数据，并显示到界面(建议开起新的方法)
		showBodyA(g);
		showAllPao(g);
	}
	private void showAllPao(Graphics g){
		Vector<paopao> vb=dw.getVecPaopao();
		for(int i=vb.size()-1;i>=0;i--){
			paopao pao=vb.get(i);
			int x=pao.getX()-pao.getSizex()/2;
			int y=pao.getY()-pao.getSizey()/2;
			Image img=new ImageIcon(pao.getDirurl()).getImage();
			g.drawImage(img, x, y, x+pao.getSizex(),y+pao.getSizey(),
					32*pao.getFrame(),0,32*(pao.getFrame()+1),50,this);

		}
	}
	private void showBodyA(Graphics g) {
		BodyA ba=dw.getBa();
		int x=ba.getBaX()-ba.getBaSizeX()/2;
		int y=ba.getBaY()-ba.getBaSizeY()/2;
		int movex=ba.getMovex();
		int movey=ba.getMovey();
		Image img=new ImageIcon(ba.getBaUrl()).getImage();
		g.drawImage(img, x, y, x+ba.getBaSizeX(), y+ba.getBaSizeY(),
				100*movex, 100*movey, 
				100*(movex+1), 100*(movey+1), this);
	}
	public MThread getMth() {
		return mth;
	}
	public void setMth(MThread mth) {
		this.mth = mth;
	}

		
}








