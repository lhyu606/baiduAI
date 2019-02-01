import java.io.File;
public class FileClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirname = "E:/javaTestFile";
		File fl = new File(dirname);
		if(fl.isDirectory()){
			System.out.println("Directory of " + dirname);
			String s[] = fl.list();
			for(int i=0;i < s.length;i++){
				File f = new File(dirname + "/" + s[i]);
				if(f.isDirectory()){
					System.out.println(s[i] + "is a dirctory.");
				}else{
					System.out.println(s[i] + "is a file.");
				}
			}
		}else{
			System.out.println(dirname + "is not a directory.");
		}
	}

}
