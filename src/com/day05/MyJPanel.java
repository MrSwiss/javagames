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
//	���ӽ����ϵ�Ԫ�غͽ������֮�������
	private DataWork dw;
//	���������ģ��ͼ��̵ģ�
	private MThread mth;
//	���췽��  
//	1.���б������������
//	2.������ص����ݺͼ�����ʵ����
//	3.�����ݿ��ƣ��������а�
	public MyJPanel(){
//		���ñ�����ɫ
		setBackground(Color.BLACK);
//		ʵ���������ݵ��ܿ�(���̣߳�Ԫ�ص��ƶ�����)
		dw=new DataWork(this);
		dw.start();//�߳�����
//		������ʵ����
		mth=new MThread(dw);
//		������¼��ļ��ص�JPanel
		addMouseListener(mth);//������������¼�
//		����ƶ��¼��ļ��ص�JPanel
		addMouseMotionListener(mth);//������������¼�
//		���̵ļ����ļ��ص�JPanel 
//		addKeyListener(mth);
	}
//	��ȡԪ�ص����ݣ�������Ԫ�����ݽ��н������Ⱦ,ֻ����Ⱦһ��
	@Override  //��д ����   ���Ǹ���ķ��� ʵ�ֶ�̬��һ�ַ�ʽ
	public void paint(Graphics g) {//Graphics�൱��һ������
//		���ø����paint����
		super.paint(g);
//		3.��ȡԪ�����ݣ�����ʾ������(���鿪���µķ���)
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








