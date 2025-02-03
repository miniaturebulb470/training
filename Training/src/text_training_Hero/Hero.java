package text_training_Hero;

public class Hero { //Heroのインスタンスを生成するクラス
	private String name;//フィールドのインスタンス変数 「private」にすることで外部から呼び出せなくなる
	                    //この場合「name」に値を代入するときは「setName」メソッドを使い、
						//「name」の値を呼び出したいときは「getName」メソッドを使うことになる
	
	int hp;     //フィールドのインスタンス変数
	
	Sword sword;/*フィールド←Sword型の変数を宣言することでSwordクラスをフィールドとしてもてる
	            //「has a」と呼ばれる。使用するにはSwordクラスのインスタンスが事前に
	            //生成されていなければならない*/
	
	static int counter = 0; //「static」がつく変数はクラス変数と呼ばれ、同じクラスのインスタンスの間で
						//共有したい情報がある場合などに使用される。この変数を参照するときは
						//「クラス名.変数名」のように記述する。クラス変数の初期化は必ずフィールドの
						//クラス変数宣言時に行う。コンストラクタでは行わない。
	
	enum Gender{MALE,FEMALE}; //「enum」を使うとString型の定文字列(複数)を宣言できる
	Gender gender;              //今回の場合はまず「Gender」という型と定文字列を２つ定義した
								//次にGender型のインスタンス変数としてgenderを宣言した
								//「Gender」型のインスタンスは「MALE」と「FEMALE」しか値をとれない
								//値を代入するときは「h1.gender = Hero.Gender.MALE;」のように記述する
								//呼び出すときは「h1.gender.toString()と記述する
	//コンストラクタ
	public Hero(){      //コンストラクタ　条件①メソッド名とクラス名が同じ②戻り値の型が宣言されていない
		this("ダミー"); //この構文は、このクラスの別のコンストラクタを呼ぶためのもの
						//オーバーロードで複数のパターンのコンストラクタを用意してもいいのだが、
						//同じ処理をたくさん書かないといけなくなる。その場合修正が大変になるので、
						//この書き方が使われる
	}
	public Hero(String name){   //コンストラクタのオーバーロード引数ありの場合
		checkName(name);
		this.name = name;       //名前を初期化
		hp = 100;              //HPを初期化
		sword = new Sword();   //Swordクラスのインスタンスを生成
		Hero.counter ++;      //クラス変数「counter」を１増やす
		
		System.out.printf("%d人目のHeroの%sが生まれました%n",this.counter,this.name);
		System.out.printf("名前 : %s%n",this.name);
		System.out.printf("HP : %d%n",this.hp);
	}
	
	//インスタンスメソッド
	public void info(){
		System.out.printf("%n=====================%n");
		System.out.printf("名前 : %s%n",this.name);
		System.out.printf("HP : %d%n",this.hp);
		if(this.sword.name != null) {
			System.out.printf("武器 : %s%n",this.sword.name);
		}else {
			System.out.printf("武器 : なし%n");
		}
		System.out.printf("=====================%n%n");
	}
	public void checkName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if(name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		if(name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}	
	}
	public void setName(String name){
		checkName(name);
		this.name = name;
		System.out.printf("Heroの名前を%sに変更しました%n",this.name);
	}
	public String getName(){
		return this.name;
	}
	
	public void slip(){
		this.hp -= 5;
		System.out.printf("%sは転んだ！%n%sは5のダメージを受けた%n",this.name,this.name);
		System.out.printf("HP : %d%n",this.hp);
	}
	
	public void setSword(Sword s){
		this.sword = s;
		
		System.out.printf("%sは%sを装備した%n",this.name,s.name);
	}
	public void attack(Matango m) {
		m.hp -= 10;
		System.out.printf("%sは%sを攻撃した！%n%sに10のダメージを与えた%n",this.name, m.name, m.name);
	}

	//クラスメソッド・・インスタンスを生成しなくても使えるメソッドで「クラス名.メソッド名(引数)」
	//　　　　　　　　　のように使う。メソッドの中でインスタンス変数やインスタンスメソッドは使えない
	//                  シンプルな計算処理などを行うときに使う。
	static double getTriangleArea(double base, double height) {
		return base * height / 2.0;
	}

}
