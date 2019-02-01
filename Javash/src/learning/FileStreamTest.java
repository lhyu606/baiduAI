import java.io.*;
public class FileStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("E:/javaTestFile/123.txt");
		FileOutputStream fop = new FileOutputStream(f);
		//构建 FileOutputStream 对象，文件不存在会自动新建
		OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
		//构建OutputStreamWriter 对象，指定参数，默认为GBK
		writer.append("中文输入！");
		//写入到缓存
		writer.append("\r\n");
		//换行
		writer.append("English");
		
		writer.close();
		//关闭写入流，同时吧缓存区内容写到文件中
		fop.close();
		//关闭输出流，释放系统资源
		
		FileInputStream fip = new FileInputStream(f);
		//构建FileInputStream 对象
		InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
		//构建InputStreamReader 对象，指定编码格式
		StringBuffer sb = new StringBuffer();
		while (reader.ready()){
			sb.append((char) reader.read());
		}
		System.out.println(sb.toString());
		reader.close();
		//关闭读取流
		fip.close();
		//关闭输入流，释放系统资源
	}

}
