package jrJava.multi_threading_8_networkChat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JScrollPane displayPane, typingPane;
	private JTextArea displayArea, typingArea;
	private JButton send;
	
	private MessageSender sender;
	
	public GUI(String title){
		frame = new JFrame(title);
		if(title.startsWith("S"))frame.setBounds(500, 0, 380, 550);
		else frame.setBounds(100, 0, 380, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		displayPane = new JScrollPane();
		displayPane.setBounds(30, 20, 300, 200);
		displayArea = new JTextArea();
		displayPane.setViewportView(displayArea); //put display area inside of display pane
		panel.add(displayPane);
		
		typingPane = new JScrollPane();
		typingPane.setBounds(30, 240, 300, 200);
		typingArea = new JTextArea();
		typingPane.setViewportView(typingArea); 
		panel.add(typingPane);
		
		send = new JButton("Send");
		send.setBounds(260, 450, 70, 20);
		panel.add(send);
		send.addActionListener(this);
		
		frame.setVisible(true);
		
		
	}
	public void addMessage(String msg){
		displayArea.setText(displayArea.getText() + "\n" + msg);
	}
	public void setMessageSender(MessageSender sender){
		this.sender = sender;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String msg = typingArea.getText();
		sender.send(msg);
		addMessage(msg);
		typingArea.setText("");
	}
	
}
