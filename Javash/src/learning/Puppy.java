
public class Puppy {
	Boolean Walk;
	int puppyAge;
	public Puppy(String name,Boolean walk){
		//这个构造器仅有一个参数name
		this.Walk = walk;
		System.out.println("小狗的名字是："+name);
	}
	
	public void setAge(int age){
		puppyAge = age;
	}
	
	public int getAge(){
		System.out.println("小狗的年龄为："+puppyAge);
		return puppyAge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy = new Puppy("tommy",true);
		myPuppy.setAge(3);
		myPuppy.getAge();
		System.out.println("变量值："+myPuppy.puppyAge);
		if(myPuppy.Walk){
			System.out.println("该狗会走路了！");
		}else{
			System.out.println("该狗还不会走路！");
		}
	}

}
