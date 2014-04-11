package cn.day04;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//ÊÂ¼þµÄ¼àÌý£»add all kind Listener in this class
public class MThread implements MouseMotionListener,MouseListener,KeyListener{
	/*through (Datawork) dw's status to control the game*/
     private Datawork dw;
     public MThread(Datawork dw){
    	 this.dw=dw;
    	 
     
     }
     @Override
    public void mouseDragged(MouseEvent e) {
    	// TODO Auto-generated method stub
    	
    }
     

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getButton());
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1){
			dw.getWa().setFire(false);
		}
		System.out.println(e.getButton());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	//	System.out.println(e.getButton());
		if(e.getButton()==MouseEvent.BUTTON1){
			dw.getWa().setFire(true);
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		dw.getWa().setX(e.getX());
		dw.getWa().setY(e.getY());
	//System.out.println(dw.getWa().getX());
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(KeyEvent.VK_LEFT);
		int key=e.getKeyCode();
		switch(key){
		case KeyEvent.VK_UP:
			if(!dw.getWa().isDown())
			//System.out.println("shang");
			dw.getWa().setUp(true);
			break;
		case KeyEvent.VK_LEFT:
			if(!dw.getWa().isRight())
			dw.getWa().setLeft(true);
			break;
		case KeyEvent.VK_RIGHT:
			if(!dw.getWa().isLeft())
			dw.getWa().setRight(true);
			break;
		case KeyEvent.VK_DOWN:
			if(!dw.getWa().isUp())
			dw.getWa().setDown(true);
			//System.out.println("xia");
			break;
		case KeyEvent.VK_X:
			if(!dw.getWa().isFire())
				dw.getWa().setFire(true);
			break;
		}
		
//		if(e.getKeyChar()=='x'&&dw.getWa().isFire()==true){
//			dw.getWa().setFire(true);
//		}
//		System.out.println(e.getKeyChar());
//		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int key=e.getKeyCode();
		switch(key){
		case KeyEvent.VK_UP:
			//if(!dw.getWa().isDown())
			dw.getWa().setUp(false);
			break;
		case KeyEvent.VK_LEFT:
			dw.getWa().setLeft(false);
			break;
		case KeyEvent.VK_RIGHT:
			dw.getWa().setRight(false);
			break;
		case KeyEvent.VK_DOWN:
			dw.getWa().setDown(false);
			break;
		case KeyEvent.VK_X:
			if(dw.getWa().isFire())
				dw.getWa().setFire(false);
			break;
		}
		
	}

}
