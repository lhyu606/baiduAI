import java.util.Date;
import java.util.Properties;


public class Property {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("---Memory Usage :");
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory = "
							+ rt.totalMemory()
							+ " Free Memory = "
							+ rt.freeMemory());
		
	}

}
