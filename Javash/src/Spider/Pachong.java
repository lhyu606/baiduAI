package Spider;
import java.io.*;
import java.net.*;

public class Pachong {

	public static void main(String[] args) {
		// TODO ���弴ʱ���ʵ�����
		String url = "http://www.baidu.com";
		//����һ���ַ�������������ҳ����
		String result = "";
		//����һ�������ַ�������
		BufferedReader in = null;
		try{
			//�� string ת�� url ����
			URL realUrl = new URL(url);
			//��ʼ��һ�����ӵ��Ǹ� url ������
			URLConnection connection = realUrl.openConnection();
			//��ʼʵ�ʵ�����
			connection.connect();
			//��ʼ��  BufferedReader ����������ȡ  URL ����Ӧ
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			//������ʱ�洢ץ����ÿһ������
			String line ;
			while((line = in.readLine()) != null){
				//����ץȡ����ÿһ�в�����洢�� result ����
				result += line;
			}
		}catch(Exception e){
			System.out.println("����  GET ��������쳣.");
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
