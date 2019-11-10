package jrJava.sorting_selection;

import jrJava.sorting_bubble.Utility;

public class MinFinder {

	public static void main(String[] args) {
		int[] values = Utility.fileToArray("jrJava/sorting_bubble/myData.txt");
	}
	public static int min(int[] data){
		int min = data[0];
		for (int i = 0; i < data.length; i++) {
			if(data[i]<min)min = data[i];
		}
		return min;
	}
	public static int minIndex(int[] data, int small){
		int index = small;
		for (int i = small; i < data.length; i++) {
			if(data[i]<data[index])index = i;
		}
		return index;
	}
}