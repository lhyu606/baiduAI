import java.io.*;
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empOne = new Employee("tom");
		Employee empTwo = new Employee("jane");
		
		//��������������ĳ�Ա����
		empOne.empAge(10);
		empOne.empDesignation("�߼�����Ա");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(2);
		empTwo.empDesignation("�������Ա");
		empTwo.empSalary(2);
		empTwo.printEmployee();
	}

}
