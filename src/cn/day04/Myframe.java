package cn.day04;
/*
 * create interface for use
 * */


import javax.swing.JFrame;
import javax.swing.JPanel;

import cn.day04.MyJPanel;
//��ļ̳У��Լ������Լ���frame
public class Myframe extends JFrame{
	

	/**
	 * @param args���洰��
	 */
	private int w;
	private int h;
	public static int hh;
	public int getH() {
		return h;
	}
	private JPanel jp;
	/*
	 * default construct for init window's width and height
	 * */
	public Myframe(){
		UtilWork.fireup();
		this.w=UtilWork.jframex;
		this.h=UtilWork.jframey;
		hh=this.h;
		jp=new MyJPanel();
	}
	public void showFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(w,h);
		setTitle("���ǵ��-��������-������ײ����-�����ε���");
		add(jp);
		setVisible(true);
		MThread mth=((MyJPanel)jp).getMth();
		addKeyListener(mth);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe mf=new Myframe();
		mf.showFrame();

	}

}
