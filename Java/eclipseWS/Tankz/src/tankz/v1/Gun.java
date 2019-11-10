package tankz.v1;
import java.awt.*;
public class Gun {
	private int x, y; //x and y should be on the middle of the body
	private int x2, y2; //slope?
	private Color color;
	
	public Gun(int x, int y, int x2, int y2, Color color){
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
	}
}
