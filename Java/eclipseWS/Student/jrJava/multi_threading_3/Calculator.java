package jrJava.multi_threading_3;

public class Calculator {
	private int sum = 0;

	
	public void calculateSum(){
		for (int i = 0; i <= 10; i++) {
			sum+= i;
			System.out.println("Sum = " + sum);
		}
	}
	public void calculateSquareSum(){
		for (int i = 0; i <= 10; i++) {
			sum+= i*i;
			System.out.println("Sum = " + sum);
		}
	}
	
}
