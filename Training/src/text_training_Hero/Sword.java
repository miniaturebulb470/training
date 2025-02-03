package text_training_Hero;

public class Sword {
	String name;
	int damage;
	
	public void info() {
		System.out.println("インスタンスメソッド「info()」が呼び出されました");
		System.out.printf("名前 : %s%n", this.name);
		System.out.printf("攻撃値 : %d%n", this.damage);
	}

}
