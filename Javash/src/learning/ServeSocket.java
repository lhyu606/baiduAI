import java.io.*;
import java.net.*;

public class ServeSocket {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		try{
			server = new ServerSocket(5656);
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("�����������������ڵȴ����ӡ���������");
		Socket client = null;
		try{
			client = server.accept();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("�ͻ��˽�������.");
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		OutputStream out = null;
		try{
			out = client.getOutputStream();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		DataOutputStream dos = new DataOutputStream(out);
		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String info;
		while(true){
			String str = in.readLine();
			System.out.println("~~" + str);
			//out.print("�ѽ���....");
			out.flush();
			if(str.equals("end")){
				break;
			}
			info = dis.readUTF();
			System.out.println("�Է�˵��" + info);
		}
		dis.close();
		dos.close();
		in.close();
		out.close();
		client.close();
		server.close();
	}

}
