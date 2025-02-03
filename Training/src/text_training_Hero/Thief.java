package text_training_Hero;

public class Thief {
	private String name;
	int hp;
	int mp;

	public Thief() {
		this("ダミー", 40, 5);
	}

	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Thief(String name, int hp) {
		this(name,hp,5);
	}

	public Thief(String name) {
		this(name,40);
	}

	public void info() {
			System.out.println("インスタンスメソッド「Info()」が呼び出されました");
			System.out.printf("名前 : %s%n",this.name);
			System.out.printf("HP : %d%n",this.hp);
			System.out.printf("MP : %d%n",this.mp);

	}
}
