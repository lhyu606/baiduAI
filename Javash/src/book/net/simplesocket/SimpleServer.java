package book.net.simplesocket;

/**------文件名：SimpleServer.java------*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*简单服务器*/

public class SimpleServer {

	ServerSocket serverSkt = null;//服务端监听Socket
	Socket clientSkt = null;//客户端
	BufferedReader in = null;//客户端输入流
	PrintStream out = null;// 客户端输出流
	
	//构造方法
	public SimpleServer(int port){
		System.out.println("服务器代理正在监听，端口："+port);
		try{
			serverSkt = new ServerSocket(port);
		}catch(IOException e){
			System.out.println("监听端口"+ port + "失败！");
		}
		try{
			clientSkt = serverSkt.accept();
		}catch(IOException e){
			System.out.println("连接失败！");
		}
		try{
			in = new BufferedReader(new InputStreamReader(clientSkt.getInputStream()));
			out = new PrintStream(clientSkt.getOutputStream());
		}catch(IOException e){
			System.out.println("in out 失败");
		}
	}
	//收到客户端请求
	public String getRequest(){
		String frmClt = null;
		try{
			frmClt = in.readLine();
			System.out.println("Server 收到请求：" + frmClt);
		}catch(Exception e){
			System.out.println("无法读取端口....");
			System.exit(0);
		}
		return frmClt;
	}
	//发送响应给客户端
	public void sendResponse(String response){
		try{
			out.println(response);
			System.out.println("Server 响应请求：" + response);
		}catch(Exception e){
			System.out.println("写端口失败....");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleServer sa = new SimpleServer(5666);//启动服务器
		while(true){
			//读取客户端的输入并返回给客户端
			sa.sendResponse(sa.getRequest() + "我回来了");
		}
	}

}

































