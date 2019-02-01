import java.io.*;
public class FileReaderClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Hello.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write("This is an example\n");
		writer.flush();
		writer.close();
		FileReader fr = new FileReader(file);
		char [] a = new char[30];
		fr.read(a);
		for(char c: a){
			System.out.print(c);
		}
		fr.close();
	}
}
