
public class CharTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character a = 'a',b = 'b',c= 'b',d = 'f';
		int r1 = a.compareTo(b);
		int r2 = b.compareTo(c);
		int r3 = d.compareTo(a);
		char r5 = a.charValue();
		String r6 = a.toString();
		Boolean r4 = c.equals(b);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
		//
	}

}
