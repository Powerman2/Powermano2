package jrJava.abstractType_3_generics;

public class Test1_2 {

	public static void main(String[] args) {
		Storage1 s = new Storage1();
		s.setData("aaa");
		
		String data = s.getData();
		
		
		Storage2 s2 = new Storage2();
		s2.setData(45);
		Integer data2 = s2.getData();
	}

}
