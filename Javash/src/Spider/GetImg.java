package Spider;
import java.io.*;
import java.net.*;
import java.util.regex.*;

public class GetImg {

	static String sendGet(String url){
		//����һ���ַ��������洢��ҳ����
		String result = "";
		//����һ�������ַ�������
		BufferedReader in = null;
		try{
			//��  string תΪ  url ����
			URL realUrl = new URL(url);
			//��ʼ��һ�����ӵ��Ǹ�  url  ������
			URLConnection connection = realUrl.openConnection();
			//��ʼʵ�ʵ�����
			connection.connect();
			//��ʼ��  BufferedReader ����������ȡ  URL ����Ӧ
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			//����ץȡ��ʱ�洢ץ����ÿһ������
			String line ;
			while((line = in.readLine()) != null){
				result += line;
			}
		}catch (Exception e){
			System.out.println("���� GET ��������쳣. " + e);
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
		//����һ����ʽģ�壬����ʹ��������ʽ����������Ҫץȡ������
		Pattern pattern = Pattern.compile(patternStr);
		//����һ��  match ����ƥ��
		Matcher matcher = pattern.matcher(targetStr);
		if(matcher.find()){
			return matcher.group(1);
		}
		return "";
	}
	
	public static void main(String[] args) {
		// ���弴�����ʵ�����
		String url = "http://www.baidu.com";
		//�������Ӳ���ȡ��ҳ����
		String result = sendGet(url);
		System.out.println(result);
		String imgSrc = RegexString(result,"src=\"(.+?)g");
		System.out.println("imgSrc : " + imgSrc);

	}

}
