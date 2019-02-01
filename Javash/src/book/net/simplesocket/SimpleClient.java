package book.net.simplesocket;

import java.io.*;
import java.net.Socket;

/*
 * 简单客户端，能够网服务器发送socket请求
 * */
public class SimpleClient {

	//客户端输入/输出流
	PrintStream out ;
	BufferedReader in;
	//构造方法
	public SimpleClient(String serverName, int port){
		try{
			//根据服务器名和端口号，链接服务器
			Socket clientSocket = new Socket(serverName, port);
			//获取 socket 的输入输出流
			out = new PrintStream(clientSocket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		}catch(Exception e){
			System.out.println("无法连接服务器！");
		}
	}
	//发送请求
	public void sendRequest(String request){
		out.println(request);
		System.out.println("Client 发送请求："+request);
		
	}
	//获取响应
	public String getResponse(){
		String str = new String();
		try{
			str = in.readLine();
			System.out.println("Client 收到 server 返回：" + str);
		}catch(IOException e ){
			
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
