package com.day05;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//工具类,作用是用于对游戏的启动基本数据的读取
//还可以用于延迟加载
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
//	UtilWork.class 反射获取类对象（类本身的对象 不是类的实体对象）
	static{
//		Class.forName("");//反射
//		System.out.println(String.class.getName());
//		1.输入流 字节流  可以读取文件 
		InputStream in=UtilWork.class
		.getResourceAsStream("/com/day05/a.pro");
//		System.out.println(in);
//		2.获取键值对对象  专门用于读取键和值。  工具类
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
//		System.out.println("游戏启动加载");
	}
	public static void 某某15级副本加载(){
		System.out.println("游戏启动加载");
	}
	public static void 某某25级副本加载(){
		System.out.println("游戏启动加载");
	}
	
	
	
	
	
	
	
	
	
}
