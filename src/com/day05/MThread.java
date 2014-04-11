package com.day05;

//��Ϸ����space���������ݵķ���      ����Ҫɾ����paopao����D������ɾ��
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//��Ҫ���¼��ļ��� 
public class MThread implements MouseMotionListener, MouseListener, KeyListener {
	private DataWork dw;// ע��datawork����

	public MThread(DataWork dw) {
		this.dw = dw;
	}

	// mouseDragged mouseMoved �� MouseMotionListener
	@Override
	public void mouseDragged(MouseEvent e) {
		// dw.getWa().setX(e.getX());
		// dw.getWa().setY(e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// System.out.println(e.getX()+":"+e.getY());
		// dw.getWa().setX(e.getX());
		// dw.getWa().setY(e.getY());
	}

	// �� MouseListener �����
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		// if(e.getButton()==MouseEvent.BUTTON1){
		// dw.getWa().setFire(true);
		// }
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
	// ���İ����¼�
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println(e.getButton());
		// if(e.getButton()==MouseEvent.BUTTON1){
		// dw.getWa().setFire(true);
		// }
	}

	@Override
	// �ɿ���갴�����¼�
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		// if(e.getButton()==MouseEvent.BUTTON1){
		// dw.getWa().setFire(false);
		// }
	}

	// KeyListener ����ķ���
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// �ڼ���������ֻ����ά�����ݵ�״̬���ݵ�״̬
		int key = e.getKeyCode();
		BodyA bA = dw.getBa();

		switch (key) {
		case KeyEvent.VK_UP:
			bA.setUp(true);
			bA.setMovey(3);
			break;
		case KeyEvent.VK_DOWN:
			bA.setDown(true);
			bA.setMovey(0);
			break;
		case KeyEvent.VK_LEFT:
			bA.setLeft(true);
			bA.setMovey(1);
			break;
		case KeyEvent.VK_RIGHT:
			bA.setRight(true);
			bA.setMovey(2);
			break;
		case KeyEvent.VK_SPACE:
			bA.setAddPao(true);
			break;
		case KeyEvent.VK_D:
			bA.setDeltepao(true);

			break;
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		BodyA bA = dw.getBa();
		switch (key) {
		case KeyEvent.VK_UP:
			bA.setUp(false);
			break;
		case KeyEvent.VK_DOWN:
			bA.setDown(false);
			break;
		case KeyEvent.VK_LEFT:
			bA.setLeft(false);
			break;
		case KeyEvent.VK_RIGHT:
			bA.setRight(false);
			break;
		case KeyEvent.VK_SPACE:
			bA.setAddPao(false);
			break;
		case KeyEvent.VK_D:
			bA.setDeltepao(false);

			break;
		default:
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
