package com.day05;

import javax.swing.JFrame;
import javax.swing.JPanel;
//��ļ̳У��Լ������Լ���Frame
public class MyFrame extends JFrame{
	/**
	 * @���洰��
	 */
	private int w;
	private int h;
	private JPanel jPanel;
//	���췽�� �������Ĵ�С�� ���� ������ļ���
	public MyFrame(){//���췽��
		UtilWork.fireup();//����������ص��ڴ棬Ҫʹ������
		this.w=UtilWork.jframex;
		this.h=UtilWork.jframey;
		jPanel=new MyJPanel();
	}
//	���ô��壨���棩�Ĵ�С�������ϵ����ļ��غͲ���
	public void showFrame(){
//		���ô���Ĺر�״̬���رղ�ͬʱ��������
		setDefaultCloseOperation(3);
//		���ô���Ĵ�С
		setSize(w, h);
//		���ô����title����
		setTitle("���ǵ��->������->����ײ����->���ȵ���");
//		����JPanel���
		add(jPanel);
//		���ô���ɼ���������ʾ��
		setVisible(true);
//		�������Ѿ���̭
//		show();
		
//		���̵ļ���
		if(jPanel instanceof MyJPanel){
			MThread mth=((MyJPanel)jPanel).getMth();//����
			addKeyListener(mth);
		}
	}
	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.showFrame();
	}
}
