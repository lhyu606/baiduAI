package book.net.simplesocket;

import java.io.*;
import java.net.Socket;

/*
 * �򵥿ͻ��ˣ��ܹ�������������socket����
 * */
public class SimpleClient {

	//�ͻ�������/�����
	PrintStream out ;
	BufferedReader in;
	//���췽��
	public SimpleClient(String serverName, int port){
		try{
			//���ݷ��������Ͷ˿ںţ����ӷ�����
			Socket clientSocket = new Socket(serverName, port);
			//��ȡ socket �����������
			out = new PrintStream(clientSocket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		}catch(Exception e){
			System.out.println("�޷����ӷ�������");
		}
	}
	//��������
	public void sendRequest(String request){
		out.println(request);
		System.out.println("Client ��������"+request);
		
	}
	//��ȡ��Ӧ
	public String getResponse(){
		String str = new String();
		try{
			str = in.readLine();
			System.out.println("Client �յ� server ���أ�" + str);
		}catch(IOException e ){
			
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
