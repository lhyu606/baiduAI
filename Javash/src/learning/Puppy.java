
public class Puppy {
	Boolean Walk;
	int puppyAge;
	public Puppy(String name,Boolean walk){
		//�������������һ������name
		this.Walk = walk;
		System.out.println("С���������ǣ�"+name);
	}
	
	public void setAge(int age){
		puppyAge = age;
	}
	
	public int getAge(){
		System.out.println("С��������Ϊ��"+puppyAge);
		return puppyAge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy = new Puppy("tommy",true);
		myPuppy.setAge(3);
		myPuppy.getAge();
		System.out.println("����ֵ��"+myPuppy.puppyAge);
		if(myPuppy.Walk){
			System.out.println("�ù�����·�ˣ�");
		}else{
			System.out.println("�ù���������·��");
		}
	}

}
