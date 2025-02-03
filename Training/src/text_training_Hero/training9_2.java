package text_training_Hero;

public class training9_2 {
	public static void heal(int hp) {  //引数と仮引数が値渡しにより独立しているため
		hp += 10;
	}
	public static void heal(Thief thief) {//アドレスの参照渡しのため連動して動く
		thief.hp += 10;
	}

	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("hose",baseHp);
		heal(baseHp);                     
		System.out.printf("%d : %d%n",baseHp,t.hp);
		heal(t);                           
		System.out.printf("%d : %d",baseHp,t.hp);
		
		
	}

}
