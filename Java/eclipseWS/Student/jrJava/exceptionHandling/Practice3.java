package jrJava.exceptionHandling;

public class Practice3 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		int sum = 0;
		int i = 0;
		while(true){
			try{
				sum+= a[i++];
			}
			catch(IndexOutOfBoundsException e1){
				break;
			}
		}
		System.out.println(sum);
	}

}
