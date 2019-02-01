package Spider;
import java.io.*;
import java.net.*;

public class Pachong {

	public static void main(String[] args) {
		// TODO 定义即时访问的链接
		String url = "http://www.baidu.com";
		//定义一个字符串用来缓存网页内容
		String result = "";
		//定义一个缓冲字符输入流
		BufferedReader in = null;
		try{
			//将 string 转成 url 对象
			URL realUrl = new URL(url);
			//初始化一个链接到那个 url 的链接
			URLConnection connection = realUrl.openConnection();
			//开始实际的链接
			connection.connect();
			//初始化  BufferedReader 输入流来读取  URL 的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			//用来临时存储抓到的每一行数据
			String line ;
			while((line = in.readLine()) != null){
				//遍历抓取到的每一行并将其存储到 result 里面
				result += line;
			}
		}catch(Exception e){
			System.out.println("发送  GET 请求出现异常.");
			e.printStackTrace();
		}finally{
			try{
				if(in != null){
					in.close();
				}
			}catch (Exception e2){
				e2.printStackTrace();
			}
		}
		System.out.println(result);
	}

}
