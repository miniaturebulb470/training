package mirai_engineer_blog;

public class Main2_15 {

	public static void main(String[] args) {
		Musician[] musicians = {
				new Vocalist("桜井"),
				new Guiterist("田原", "リードギター"),
				new Guiterist("中川","ベース"),
				new ChrusDrummer("鈴木")
		};
		for(Musician m : musicians) {
			if(m instanceof Singable) {
				((Singable) m).sing();
			}
			if(m instanceof Playable p) {
				p.Play();
			}
		}
		
		
	}
}

abstract class Musician {
	String name;

	public Musician(String name) {
		this.name = name;
	}
}

interface Singable {
	public void sing();
}

interface Playable {
	public void Play();
}

class Vocalist extends Musician implements Singable {
	public Vocalist(String name) {
		super(name);
	}

	public void sing() {
		System.out.printf("%sは熱唱しました！%n", this.name);
	}
}

class Guiterist extends Musician implements Playable {
	String typeGuiter;

	public Guiterist(String name, String typeGuiter) {
		super(name);
		this.typeGuiter = typeGuiter;
	}

	public void Play() {
		System.out.printf("%sは%sを演奏しました！%n", this.name, this.typeGuiter);
	}
}

class ChrusDrummer extends Musician implements Singable, Playable {
	public ChrusDrummer(String name) {
		super(name);
	}

	public void sing() {
		System.out.printf("%sはコーラスでハモりました！%n", this.name);
	}
	public void Play() {
		System.out.printf("%sはドラムを演奏しました！%n", this.name);
	}
	

}
