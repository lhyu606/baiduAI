import java.io.*;
public class BRRead {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����ַ�������'q'���˳���");
		do{
			c = (char) br.read();
			System.out.print(c);
		}while(c != 'q');
		System.out.println("\n���������");
	}

}
