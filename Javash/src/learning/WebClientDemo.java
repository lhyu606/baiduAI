import java.io.*;
import java.net.*;
public class WebClientDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket client = new Socket("www.sina.com",80);
		System.out.println("������ IP �ǣ�"+client.getInetAddress());
		System.out.println("�������˿ں��ǣ�"+client.getPort());
		System.out.println("�ͻ��� IP �ǣ�"+client.getLocalAddress());
		System.out.println("�ͻ����˿ں��ǣ�"+client.getLocalPort());
		client.close();
	}

}
