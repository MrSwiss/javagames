package cn.day04;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import cn.day04.Datawork;

public class MyJPanel extends JPanel {
	private Datawork dw;
	private MThread mth;


	public MThread getMth() {
		return mth;
	}


	public void setMth(MThread mth) {
		this.mth = mth;
	}

/*init MyJPanel such as add listen, datawork,MThread*/
	public MyJPanel(){
		setBackground(Color.black);
		dw=new Datawork(this);
		dw.start();
		mth=new MThread(dw);
		addMouseListener(mth);
		addMouseMotionListener(mth);
		addKeyListener(mth);
	}
/*rewrite paint*/
	
	public void paint(Graphics g){
		super.paint(g);
		//3.获取元素数据并显示到界面（建议开启新的方法）
		showWorkA(g);
		showFire(g);
		showEnemy(g);
		showAllBant(g);
	}
	/*show Fire effect*/
	private void showFire(Graphics g) {
		// TODO Auto-generated method stub
		Vector<Fire> vFires=dw.getVectoreFire();
		for(Fire f:vFires){
			//Fire f=vFires.get(i);
			Image ima=new ImageIcon(f.getDirurl()).getImage();
			int x=f.getX()-f.getSizex()/2;
			int y=f.getY()-f.getSizey()/2;
			g.drawImage(ima,x,y,f.getSizex(),f.getSizey(),this);
		}
		
	}
	/*show Enemy effect*/
	private void showEnemy(Graphics g) {
		// TODO Auto-generated method stub
		Vector<workEnemy> Enemys=dw.getVector();
		for( int i=Enemys.size()-1;i>=0;i--){
			workEnemy f=Enemys.get(i);
			Image ima=new ImageIcon(f.getDirurl()).getImage();
			int x=f.getX()-f.getSizex()/2;
			int y=f.getY()-f.getSizey()/2;
			g.drawImage(ima,x,y,f.getSizex(),f.getSizey(),this);
			for( int j=f.getvectoreEnemyFire().size()-1;j>=0;j--){
				Fire f2=f.getvectoreEnemyFire().get(j);
				Image ima2=new ImageIcon(f2.getDirurl()).getImage();
				int x2=f2.getX()-f2.getSizex()/2;
				int y2=f2.getY()-f2.getSizey()/2;
				g.drawImage(ima2,x2,y2,f2.getSizex(),f2.getSizey(),this);
			}
		}
		
	}
	/*show  score*/
	public void showWorkA(Graphics g){
		WorkA wa=dw.getWa();
		Image ima=new ImageIcon(wa.getDirurl()).getImage();
		int x=wa.getX()-wa.getSizex()/2;
		int y=wa.getY()-wa.getSizey()/2;
		g.drawImage(ima,x,y,wa.getSizex(),wa.getSizey(),this);
		//System.out.println(wa.getX());
//		显示分数
		g.setColor(new Color(255,0,0));
		g.setFont(new Font("宋体",Font.BOLD,32));
		String num="分数:"+WorkA.waNumber;
		g.drawString(num, 10, 30);
	}
	/*show bant effect*/
	private void showAllBant(Graphics g) {
		Vector<Bant> vb=dw.getVecBants();
		for(int i=vb.size()-1;i>=0;i--){
			Bant bant=vb.get(i);
			int x=bant.getX()-bant.getSizex()/2;
			int y=bant.getY()-bant.getSizey()/2;
			Image img=new ImageIcon(bant.getDirurl()).getImage();
			g.drawImage(img, x, y, x+bant.getSizex(),y+bant.getSizey(),
					65*bant.getPNGnumber(),0,65*(bant.getPNGnumber()+1),65,this);

		}
	}

}
