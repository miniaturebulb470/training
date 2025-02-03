package text_training_Hero;

import java.util.Random;

public class Cleric {
	private String name;
	int hp = 50;
	int MAX_HP = 50;
	int mp = 10;
	int MAX_MP = 10;

	public Cleric(String name){    //コンストラクタ
		this.name = name;
		
		System.out.printf("Clericの%sが生まれました%n",name);
		System.out.printf("HP : %d%n",this.hp);
		System.out.printf("MP : %d%n",this.mp);
	}
	
	public void info() {
		System.out.printf("名前 : %s%n", this.name);
		System.out.printf("HP : %d%n",this. hp);
		System.out.printf("MP : %d%n",this. mp);
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
