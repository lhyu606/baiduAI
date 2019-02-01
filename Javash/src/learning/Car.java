
class Vehicle {}
public class Car extends Vehicle{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle a = new Car();
		boolean result = a instanceof Car;
		System.out.println(result);
	}

}
