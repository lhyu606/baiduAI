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
		
		
		//使用 simpleDateFormat 格式化日期
		SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' HH:mm:ss a zzz");
		//SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date:"+ft.format(date));
	}

}
