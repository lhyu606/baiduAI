import java.util.*;


public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "k1=val1&k2=val2";
		Map<String, String> map = new HashMap<String,String>();
		String [] item = str.split("&");
		System.out.println(item[0]);
		System.out.println(item[1]);
		for(int i =0;i<item.length;i++){
			String[] k = item[i].split("=");
			map.put(k[0], k[1]);
			System.out.println(item[i]);
			System.out.println(map);
		}
	}

}
