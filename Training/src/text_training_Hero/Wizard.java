package text_training_Hero;

import java.util.Random;

public class Wizard {
	private String name;
	int hp = 50;
	int MAX_HP = 50;
	int mp = 10;
	int MAX_MP = 10;

	public Wizard(String name){    //コンストラクタ
		this.name = name;
		
		System.out.printf("Wizardの%sが生まれました%n",name);
		System.out.printf("HP : %d%n",this.hp);
		System.out.printf("MP : %d%n",this.mp);
	}
	public Wizard() {//名前の引数がなかった時のコンストラクタを設定する
		this("ダミー");//引数を「ダミー」としてコンストラクタを呼びなおす
	}
	
	public void info() {
		System.out.println("インスタンスメソッド「info()」が呼び出されました");
		System.out.printf("名前 : %s%n", this.name);
		System.out.printf("HP : %d%n", this.hp);
		System.out.printf("MP : %d%n", this.mp);
	}
	public void heal(Hero h) {//Hero型のクラス型を引数に使いどのHeroをターゲットにしているかを取得している
		h.hp += 10;
		System.out.printf("%sはヒールを唱えた！%n%sのHPが10回復した%n",this.name,h.getName());
		
	}
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.printf("%sはセルフエイドを唱えた！%n%sのHPが全回復した%n",this.name,this.name);
		System.out.printf("HP : %d%n",this.hp);
		System.out.printf("MP : %d%n",this.mp);
	}

	public void pray(int sec) {
		Random rand = new Random();
		int addMp = sec + rand.nextInt(3);
		this.hp += addMp;
		if(this.mp > MAX_MP) {
			this.mp = MAX_MP;
		}
		System.out.printf("%sは%d秒間、天に祈った！%n%sのMPが%d回復した%n",this.name,sec,this.name,addMp);
		System.out.printf("HP : %d%n",this.hp);
		System.out.printf("MP : %d%n",this.mp);
	}
	
	
	public void slip(){
		this.hp -= 5;
		System.out.printf("%sは転んだ！%n%sは5のダメージを受けた%n",this.name,this.name);
		System.out.printf("HP : %d%n",this.hp);
		System.out.printf("MP : %d%n",this.mp);
	}

	
}
