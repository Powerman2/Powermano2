package jrJava.bits_and_bytes;

public class Practice3 {

	
	public static void main(String[] args) {
		
		int a = 4;
		int b = 4;
		//int c = a & b;
		int c = a & b;
		
		printBinary(a);
		printBinary(b);
		printBinary(c);
		
	}

	
	
	public static void printBinary(int value){
		String binaryString = Integer.toBinaryString(value);
		for(int i=0; i<32-binaryString.length(); i++){
			System.out.print('0');
		}
		System.out.println(binaryString); 
	}
	
}
