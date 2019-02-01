package book.net.simplesocket;

/**------�ļ�����SimpleServer.java------*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*�򵥷�����*/

public class SimpleServer {

	ServerSocket serverSkt = null;//����˼���Socket
	Socket clientSkt = null;//�ͻ���
	BufferedReader in = null;//�ͻ���������
	PrintStream out = null;// �ͻ��������
	
	//���췽��
	public SimpleServer(int port){
		System.out.println("�������������ڼ������˿ڣ�"+port);
		try{
			serverSkt = new ServerSocket(port);
		}catch(IOException e){
			System.out.println("�����˿�"+ port + "ʧ�ܣ�");
		}
		try{
			clientSkt = serverSkt.accept();
		}catch(IOException e){
			System.out.println("����ʧ�ܣ�");
		}
		try{
			in = new BufferedReader(new InputStreamReader(clientSkt.getInputStream()));
			out = new PrintStream(clientSkt.getOutputStream());
		}catch(IOException e){
			System.out.println("in out ʧ��");
		}
	}
	//�յ��ͻ�������
	public String getRequest(){
		String frmClt = null;
		try{
			frmClt = in.readLine();
			System.out.println("Server �յ�����" + frmClt);
		}catch(Exception e){
			System.out.println("�޷���ȡ�˿�....");
			System.exit(0);
		}
		return frmClt;
	}
	//������Ӧ���ͻ���
	public void sendResponse(String response){
		try{
			out.println(response);
			System.out.println("Server ��Ӧ����" + response);
		}catch(Exception e){
			System.out.println("д�˿�ʧ��....");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleServer sa = new SimpleServer(5666);//����������
		while(true){
			//��ȡ�ͻ��˵����벢���ظ��ͻ���
			sa.sendResponse(sa.getRequest() + "�һ�����");
		}
	}

}

































