package book.net.simplesocket;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ClientFrame extends JFrame implements ActionListener {
	JButton sendButton;
	JTextField inputField;
	JTextArea outputArea;
	SimpleClient client;
	
	//���캯�������ͼ�ν��滨�ĳ�ʼ��
	public ClientFrame(){
		JLabel label1 = new JLabel("���룺");
		inputField = new JTextField(20);
		JPanel panel1 = new JPanel();
		panel1.add(label1);
		panel1.add(inputField);
		
		JLabel label2 = new JLabel("���������أ�");
		outputArea = new JTextArea(6,20);
		JScrollPane crollPane = new JScrollPane(outputArea);
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(label2,BorderLayout.NORTH);
		panel2.add(crollPane,BorderLayout.CENTER);
		
		sendButton = new JButton("�� ��");
		sendButton.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(panel1,BorderLayout.NORTH);
		panel.add(sendButton,BorderLayout.CENTER);
		panel.add(panel2,BorderLayout.PAGE_END);
		
		setTitle("Socket �ͻ���");
		this.getContentPane().add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae){
		//�ж��¼�Դ�ؼ��Ƿ��ǡ����͡���ť
		if(ae.getSource() == sendButton){
			try{
				client.sendRequest(inputField.getText());
			}catch(Exception e ){				
				e.printStackTrace();
			}
			//���ܷ�������Ӧ��д���ı���
			outputArea.append(client.getResponse() + "\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientFrame frame = new ClientFrame();
		frame.pack();
		//���ӷ�����
		frame.client = new SimpleClient("127.0.0.1",5666);
		frame.setVisible(true);
	}

}
