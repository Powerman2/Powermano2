package jrJava.multi_threading_7_twoWayNetworking;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.1.44", 5454);
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		MessageSender sender = new MessageSender(os);
		MessageReceiver receiver = new MessageReceiver(is);
		
		Thread t1 = new Thread(receiver);
		t1.start();
		sender.send();
		
	}

}
