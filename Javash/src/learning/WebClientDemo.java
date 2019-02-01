import java.io.*;
import java.net.*;
public class WebClientDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket client = new Socket("www.sina.com",80);
		System.out.println("服务器 IP 是："+client.getInetAddress());
		System.out.println("服务器端口号是："+client.getPort());
		System.out.println("客户机 IP 是："+client.getLocalAddress());
		System.out.println("客户机端口号是："+client.getLocalPort());
		client.close();
	}

}
