package jrJava.multi_threading_1;

public class Task {

	public static void main(String[] args){
		
		
		SquareSumTask sst = new SquareSumTask();
		SquareRootSumTask srst = new SquareRootSumTask();
		Thread t2 = new Thread(sst);
		Thread t3 = new Thread(srst);

		t2.start();
		t3.start();
		
		
		int sum = 0;
		for (int i = 0; i <=10; i++) {
			
			sum+=i;
			System.out.println("In Task: sum = " + sum);
		}
	}
}