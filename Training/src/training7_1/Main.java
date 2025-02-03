package training7_1;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog("柴犬");
		d.setName("Pochi");
		d.setAge(4);
		d.showProfile();

		Dog d1 = new Dog("チワワ");
		d1.setName("Pota");
		d1.setAge(2);
		d1.showProfile();
	}

}
