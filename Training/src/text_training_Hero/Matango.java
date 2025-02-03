package text_training_Hero;

public class Matango {
	String name;
	int hp;
	final int LEVEL = 10;
	char suffix;
	static int counter = 0;
	
	public Matango() {
		this("お化けキノコ");
	}
	public Matango(String name) {
		this.name = name;
		this.hp = 30;
		counter ++;
		this.suffix = Integer.toString(counter).charAt(0);
	}
	public void info(){
		System.out.printf("%n=====================%n");
		System.out.printf("名前 : %s %s%n",this.name,this.suffix);
		System.out.printf("HP : %d%n",this.hp);
		System.out.printf("=====================%n%n");
	}
	public void attack(Hero h) {
		System.out.printf("%s %sの攻撃%n",this.name,this.suffix);
		System.out.printf("%sに10のダメージ%n",h.getName());
		h.hp -= 10;
		
	}
}
