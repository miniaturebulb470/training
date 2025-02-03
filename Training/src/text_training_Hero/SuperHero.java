package text_training_Hero;

public class SuperHero extends Hero {
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
    //Heroの「attack」メソッドをオーバーライドしている
	public void attack(Matango m) {
		super.attack(m);           //「super.」をつけることでHeroのメソッドにアクセスできる
		if(flying == true) {
			super.attack(m);
		}
	}
	

}
