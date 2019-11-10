package game.thing;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class BlockManager {
	public ArrayList<Block> blocks;
	private static int h, w, currX, currY, spaceX, spaceY, col, row;
	static{
		h = 30;
		w = 50;
		currX = 0;
		currY = 0;
		spaceX = 50;
		spaceY = 0;
		row= 8;
		col = 4;
	}
	public BlockManager(){
		blocks = new ArrayList<Block>();
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
			blocks.add(new Block(currX, currY , w, h));
			currX += w + spaceX;
			}
			currY += h + spaceY;
			currX = 0;
		}
	}
	

}
