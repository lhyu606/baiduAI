
public class ExceptionMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			throw new Exception("Here is my Exception.");
		}catch(Exception e){
			System.out.println("Caught Exception.");
			System.out.println("e.toString():" + e.toString());
			System.out.println("e.getMessage():" + e.getMessage());
			System.out.println("e.printStackTrace():");
			e.printStackTrace();
			
		}
	}

}
