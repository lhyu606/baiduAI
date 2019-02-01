package Spider;
import java.io.*;
import java.net.*;
import java.util.regex.*;

public class GetImg {

	static String sendGet(String url){
		//定义一个字符串用来存储网页内容
		String result = "";
		//定义一个缓冲字符输入流
		BufferedReader in = null;
		try{
			//将  string 转为  url 对象
			URL realUrl = new URL(url);
			//初始化一个链接到那个  url  的链接
			URLConnection connection = realUrl.openConnection();
			//开始实际的链接
			connection.connect();
			//初始化  BufferedReader 输入流来读取  URL 的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			//用来抓取临时存储抓到的每一行数据
			String line ;
			while((line = in.readLine()) != null){
				result += line;
			}
		}catch (Exception e){
			System.out.println("发送 GET 请求出现异常. " + e);
			e.printStackTrace();
		}finally{
			try{
				if(in != null){
					in.close();
				}
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	static String RegexString (String targetStr,String patternStr){
		//定义一个样式模板，此种使用正则表达式，括号中是要抓取的内容
		Pattern pattern = Pattern.compile(patternStr);
		//定义一个  match 用来匹配
		Matcher matcher = pattern.matcher(targetStr);
		if(matcher.find()){
			return matcher.group(1);
		}
		return "";
	}
	
	public static void main(String[] args) {
		// 定义即将访问的链接
		String url = "http://www.baidu.com";
		//访问链接并获取网页内容
		String result = sendGet(url);
		System.out.println(result);
		String imgSrc = RegexString(result,"src=\"(.+?)g");
		System.out.println("imgSrc : " + imgSrc);

	}

}
