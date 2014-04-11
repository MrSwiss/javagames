package com.day05;

import javax.swing.JFrame;
import javax.swing.JPanel;
//类的继承，自己定义自己的Frame
public class MyFrame extends JFrame{
	/**
	 * @界面窗口
	 */
	private int w;
	private int h;
	private JPanel jPanel;
//	构造方法 定义界面的大小和 布局 多个面板的加载
	public MyFrame(){//构造方法
		UtilWork.fireup();//将工具类加载到内存，要使用数据
		this.w=UtilWork.jframex;
		this.h=UtilWork.jframey;
		jPanel=new MyJPanel();
	}
//	设置窗体（界面）的大小，界面上的面板的加载和布局
	public void showFrame(){
//		设置窗体的关闭状态，关闭并同时结束程序
		setDefaultCloseOperation(3);
//		设置窗体的大小
		setSize(w, h);
//		设置窗体的title名字
		setTitle("星星点灯->亮晶晶->彗星撞地球->拯救地球");
//		加载JPanel面板
		add(jPanel);
//		设置窗体可见（窗体显示）
		setVisible(true);
//		本方法已经淘汰
//		show();
		
//		键盘的监听
		if(jPanel instanceof MyJPanel){
			MThread mth=((MyJPanel)jPanel).getMth();//出错
			addKeyListener(mth);
		}
	}
	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.showFrame();
	}
}
