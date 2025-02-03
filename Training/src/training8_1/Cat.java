package training8_1;

public class Cat extends Animal{
	public void sleep() {
		System.out.printf("スースー%n");
	}
	public void speak() {
		System.out.printf("にゃー%n");
	}
	public void compareAge(Cat a) {
		if(this.age == a.age) {
			System.out.printf("同じ年齢%n");
		}else if(this.age > a.age) {
			System.out.printf("%sは%sより%d歳年上%n",this.name,a.name,this.age-a.age);
		}else {
			System.out.printf("%sは%sより%d歳年上%n",a.name,this.name,a.age-this.age);
		}
	}
}
