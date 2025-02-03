package training8_1;

public class Animal {
	public String name;
	public int age;
	
	
	public void showProfile() {
		System.out.printf("名前 : %s%n",this.name);
		System.out.printf("年齢 : %s%n",this.age);
	}
	public void speak() {
		System.out.printf("........%n");
	}
}
