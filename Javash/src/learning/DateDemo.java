import java.util.Date;
import java.util.*;
import java.text.*;

public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
		
		
		//ʹ�� simpleDateFormat ��ʽ������
		SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' HH:mm:ss a zzz");
		//SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date:"+ft.format(date));
	}

}
