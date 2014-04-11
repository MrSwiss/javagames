package cn.day04;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilWork {
	public static int jframex;
	public static int jframey;
	public static String workaurl;
	public static int Workasizex;
	public static int workasizey;
	public static int bantsizey;
	public static int bantsizex;
	static {
		InputStream in=UtilWork.class.getResourceAsStream("/cn/day04/a.txt");
		Properties ps=new Properties();
		System.out.println(in);
		try {
			ps.load(in);
			jframex=Integer.parseInt(ps.getProperty("jframex"));
			jframey=Integer.parseInt(ps.getProperty("jframey"));
			workaurl=ps.getProperty("workaurl");
			Workasizex=Integer.parseInt(ps.getProperty("Workasizex"));
			workasizey=Integer.parseInt(ps.getProperty("Workasizey"));
			bantsizey=Integer.parseInt(ps.getProperty("bantsizey"));
			bantsizex=Integer.parseInt(ps.getProperty("bantsizex"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(in);
	}
	public static void fireup(){
		System.out.println("”Œœ∑∆Ù∂Øº”‘ÿ");
	}


}
