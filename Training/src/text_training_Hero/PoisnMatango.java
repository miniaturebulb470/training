package text_training_Hero;

class PoisonMatango extends Matango {
	int poisonCounter;
	
	public PoisonMatango() {
		super("お化け毒キノコ");
		poisonCounter = 5;
	}
	public void attack(Hero h) {
		super.attack(h);
		if(this.poisonCounter>0) {
			int d = h.hp / 5;
			h.hp -= d;
			System.out.printf("さらに毒の胞子をばらまいた！%n");
			System.out.printf("%sに%dポイントのダメージ！%n",h.getName(),d);
			System.out.printf("%sHP : %d%n",h.getName(),h.hp);
			this.poisonCounter--;
		}
	}
}
