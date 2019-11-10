package jrJava.fancyDrawingBoard;

import java.awt.Color;
import java.awt.Graphics;

public class Test2 {

	
	public static void main(String[] args) {
		
		FancyDrawingBoard fancy = new FancyDrawingBoard(200, 50, 800, 600);
		Graphics buferedG = fancy.getBufferedGraphics();
		
		CircleShape c = new CircleShape(100, 100, 80, Color.GREEN, 5, 3);
		SquareShape s = new SquareShape(400, 400, 120, Color.BLUE, -5, -3);
		
		for(int i=0; i<20; i++){
			c.move();
			s.move();
			c.draw(buferedG);
			s.draw(buferedG);
			System.out.println("Main: " + Thread.currentThread().getId());
			fancy.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) { }
		}
		
	}

}
