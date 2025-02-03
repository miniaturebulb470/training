package training8_1;

public class Main {

	public static void main(String[] args) {
		Cat[] pets = {new Cat(),new Cat(),new Cat(),new Cat()};
		
		pets[0].name = "a";
		pets[1].name = "s";
		pets[2].name = "d";
		pets[3].name = "f";
		
		pets[0].age = 5;
		pets[1].age = 16;
		pets[2].age = 49;
		pets[3].age = 234;
		
		for(Animal a : pets) {
			a.showProfile();
		}
		pets[0].compareAge(pets[1]);
		
		
		
	}
	

}
