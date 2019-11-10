package jrJava.recursion2;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibo(47));
		long t2 = System.currentTimeMillis();
		System.out.println(fibonacci(47));
		long t1 = System.currentTimeMillis();
		System.out.println(t1-t2 + "h");

	}
	public static long fibonacci(long n){
		
		if(n == 2 || n == 1)return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static long fibo(long n){
		long first = 1, second = 1;
		if(n == 1)return first;
		if(n == 2)return second;
		long third = 0;
		for(int i = 3; i<=n; i++){
			
			third = first + second;
			first = second;
			second = third;
		}
		return third;
	}
}
