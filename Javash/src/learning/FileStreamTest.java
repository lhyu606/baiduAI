import java.io.*;
public class FileStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("E:/javaTestFile/123.txt");
		FileOutputStream fop = new FileOutputStream(f);
		//���� FileOutputStream �����ļ������ڻ��Զ��½�
		OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
		//����OutputStreamWriter ����ָ��������Ĭ��ΪGBK
		writer.append("�������룡");
		//д�뵽����
		writer.append("\r\n");
		//����
		writer.append("English");
		
		writer.close();
		//�ر�д������ͬʱ�ɻ���������д���ļ���
		fop.close();
		//�ر���������ͷ�ϵͳ��Դ
		
		FileInputStream fip = new FileInputStream(f);
		//����FileInputStream ����
		InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
		//����InputStreamReader ����ָ�������ʽ
		StringBuffer sb = new StringBuffer();
		while (reader.ready()){
			sb.append((char) reader.read());
		}
		System.out.println(sb.toString());
		reader.close();
		//�رն�ȡ��
		fip.close();
		//�ر����������ͷ�ϵͳ��Դ
	}

}
