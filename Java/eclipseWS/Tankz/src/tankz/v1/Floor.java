package tankz.v1;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

import javax.swing.*;
public class Floor extends JPanel implements KeyListener{
	JFrame frame;
	MyTank me;
	public static void main(String[] args) {
		new Floor();
	}
	public Floor(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0,0,500,400);
		frame.getContentPane().add(this);
		
		frame.setVisible(true);
	}
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		//g2.addRenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setColor(Color.black);
		g2.drawLine(0, 0, 10, 100);
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}

}