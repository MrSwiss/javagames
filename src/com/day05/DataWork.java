package com.day05;


import java.util.Vector;
import java.awt.Rectangle;
import java.awt.datatransfer.*;

import javax.swing.JPanel;

import cn.day04.Bant;
/*��ҵ��ÿ�ν����϶���5���л�����һ�ٳ�һ��*/
//320566303
//���ݵ��ܿ�  ͬʱ�Ƕ����ݵ��޸ĺͽ�����ٴ�ˢ�¿���
public class DataWork extends Thread{
//	���ڼ�¼ʱ���*********
	public static int numvers=0;
	public static int paopaoNum=10;
//	��¼��ǰ��Jpanel��������ˢ�¿���
	private JPanel jPanel;
//	1.���������Ҫ��Ԫ������(����Ԫ�ص���)����set��get����
	private BodyA ba;
	public Vector<paopao> getVecPaopao() {
		return vecPaopao;
	}

	public void setVecPaopao(Vector<paopao> vecPaopao) {
		this.vecPaopao = vecPaopao;
	}

	private Vector<paopao> vecPaopao=new Vector<paopao>();
//	���췽����ר�����ڽ���Ԫ�صĳ�ʼ��
	public DataWork(JPanel jPanel){
		this.jPanel=jPanel;
//	2.�Խ���Ԫ�ؽ��г�ʼ������֤ÿ�������ʵ����
		ba=new BodyA();
	}
	
//	�̵߳ķ�����дrun����    ר�����ڶ�ʱ�Ľ���ˢ��
//	ͬʱ������Ԫ���������й��ɵ��޸ģ���ȡԪ�ص�״̬�����ݲ�ͬ״̬��Ԫ�������޸ģ�
	public void run(){
		while(true){
//			4.�������̣߳��������ݵ��޸�
			bodyType();
			ba.move();
			addPaopao();
			movePao();
			collisionPao();
			try {
				sleep(10);//����10����	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			numvers++;
//			�����ǿ��ˢ�� ��jpanel�������� paint����
			jPanel.repaint();//��������ٴ�ˢ��
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
	private void collisionPao() {//������ײ
		for(paopao en:vecPaopao){
//			����һ���Դ���Ĳ���Ϊ��������ֵ�����ռ�
			Rectangle r1=new Rectangle(
					en.getX()-en.getSizex()/2, en.getY()-en.getSizey()/2, 
					en.getSizex(), en.getSizey()); 
			
				Rectangle r2=new Rectangle(
						ba.getBaX()-ba.getBaSizeX()/2, ba.getBaY()-ba.getBaSizeY()/2, 
						ba.getBaSizeX(), ba.getBaSizeY());
				if(r1.intersects(r2)&&ba.isDeltepao()){//����2����������Ƿ��н���
				en.setState(false);//paopao��״̬�ı�
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
