package com.day05;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//������,���������ڶ���Ϸ�������������ݵĶ�ȡ
//�����������ӳټ���
public class UtilWork {
	public static int jframex;
	public static int jframey;
	public static String workaurl;
	public static int workasizex;
	public static int workasizey;
	public static int bodyx;
	public static int bodyy;
	public static String paopao;
	public static int paosizex;
	public static int paosizey;
//	UtilWork.class �����ȡ������౾��Ķ��� �������ʵ�����
	static{
//		Class.forName("");//����
//		System.out.println(String.class.getName());
//		1.������ �ֽ���  ���Զ�ȡ�ļ� 
		InputStream in=UtilWork.class
		.getResourceAsStream("/com/day05/a.pro");
//		System.out.println(in);
//		2.��ȡ��ֵ�Զ���  ר�����ڶ�ȡ����ֵ��  ������
		Properties ps=new Properties();
		try {
			ps.load(in);
			jframex=Integer.parseInt(
				ps.getProperty("jframex"));
			jframey=Integer.parseInt(ps.getProperty("jframey"));
			workaurl=ps.getProperty("workaurl");
			paopao=ps.getProperty("paopao");
			workasizex=Integer.parseInt(ps.getProperty("workasizex"));
			workasizey=Integer.parseInt(ps.getProperty("workasizey"));
			bodyx=Integer.parseInt(ps.getProperty("bodyx"));
			bodyy=Integer.parseInt(ps.getProperty("bodyy"));
			paosizex=Integer.parseInt(ps.getProperty("paosizex"));
			paosizey=Integer.parseInt(ps.getProperty("paosizey"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void fireup(){
//		System.out.println("��Ϸ��������");
	}
	public static void ĳĳ15����������(){
		System.out.println("��Ϸ��������");
	}
	public static void ĳĳ25����������(){
		System.out.println("��Ϸ��������");
	}
	
	
	
	
	
	
	
	
	
}
