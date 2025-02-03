package training7_1;

public class Dog {
	private String name;
	int age;
	String kind;
	
	public Dog(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showProfile() {
		System.out.printf("名前 : %s%n",this.name);
		System.out.printf("年齢 : %s%n",this.age);
		System.out.printf("犬種 : %s%n",this.kind);
	}
	
}
