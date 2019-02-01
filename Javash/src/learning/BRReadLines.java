import java.io.*;
public class BRReadLines {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			str = "hello world !";
			System.out.println("Enter lines of text!");
			System.out.println("Enter 'end' to quit.");
			/*do{
				str = br.readLine();
				System.out.println(str);
			}while(!str.equals("end"));*/
			System.out.println(str);
			InputStream f = new FileInputStream("E:/javaTestFile/123.txt");
			int fr = f.read();
			int fav = f.available();
			System.out.println(fr);
			System.out.println(fav);
	}

}
