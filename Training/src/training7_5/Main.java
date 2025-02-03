package training7_5;

public class Main {

	public static void main(String[] args) {
		CoinCase cc = new CoinCase();
		cc.addCoins(200,3);
		cc.addCoins(100,3);
		cc.addCoins(50,2);
		cc.addCoins(10,7);
		cc.addCoins(5,1);
		cc.addCoins(1,3);
		cc.addCoins(10,7);
		
		cc.getAll();
		System.out.printf("全部で%d枚%n",cc.getCount());
		
		System.out.printf("全額%d円%n",cc.getAmount());
	}

}
