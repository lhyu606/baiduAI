import java.io.*;
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empOne = new Employee("tom");
		Employee empTwo = new Employee("jane");
		
		//调用这两个对象的成员方法
		empOne.empAge(10);
		empOne.empDesignation("高级程序员");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(2);
		empTwo.empDesignation("菜鸟程序员");
		empTwo.empSalary(2);
		empTwo.printEmployee();
	}

}
