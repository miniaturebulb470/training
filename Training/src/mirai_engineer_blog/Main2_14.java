package mirai_engineer_blog;

public class Main2_14 {

	public static void main(String[] args) {
		Bird[] birds = {new Swallow(), new Penguin(), new Atthis()};
		for(Bird bird : birds) {
			bird.eat();
			if(bird instanceof Flyable f) {
				f.fly();
			}
			if(bird instanceof Swimable) {
				((Swimable)bird).swim();
			}
		}
	}

}

interface Flyable{
	void fly();
}
interface Swimable{
	void swim();
}
interface Eatable{
	void eat();
}
abstract class Bird implements Eatable{}

class Swallow extends Bird implements Flyable{
	public void fly() {
		System.out.println("つばめがスイスイ飛んでいます");
	}
	public void eat() {
		System.out.println("つばめが虫を食べました");		
	}
}
class Penguin extends Bird implements Swimable{
	public void  eat() {
		System.out.println("ペンギンが魚を食べました");				
	}
	public void swim() {
		System.out.println("ペンギンがスイスイ泳いでいます");						
	}
	
}
class Atthis extends Bird implements Flyable,Swimable{
	public void  eat() {
		System.out.println("カワセミが小魚を食べました");				
	}
	public void fly() {
		System.out.println("カワセミがスイスイ飛んでいます");
	}
	public void swim() {
		System.out.println("カワセミがスイスイ泳いでいます");						
	}
	
}