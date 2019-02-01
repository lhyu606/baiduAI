
public class ForTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {10,20,30,40,50};
		int a = 1;
		double b = 4.5;
		for(int x :number){
			System.out.print(x);
			System.out.print(",");
		}
		
		System.out.print("\n");
		String [] names  = {"James","Larry","TOM","Lacy"};
		for(String name : names){
			System.out.print(name);
			System.out.print(",");
		}
		System.out.println(Math.min(a,b));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.toDegrees(Math.PI));
	}
}
