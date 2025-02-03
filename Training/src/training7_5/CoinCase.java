package training7_5;

public class CoinCase {
	int[] kindCoins = {500,100,50,10,5,1};
	int[] countCoins = {0,0,0,0,0,0};
	
	public void addCoins(int kind,int coin) {
		for(int i=0; i<kindCoins.length; i++) {
			if(kindCoins[i] == kind) {
				countCoins[i] += coin;
			}
		}
	}
	
	public int getCount(int kind) {
		int a = 0;
		for(int i=0; i<kindCoins.length; i++) {
			if(kindCoins[i] == kind) {
				a =  countCoins[i];
			}
		}
		return a;
	}
	public int getAmount() {
		int a = 0;
		for(int i=0; i<kindCoins.length; i++) {
			a += kindCoins[i] * countCoins[i];
		}
		return a;
	}
	public int getCount() {
		int c = 0;
		for(int i=0; i<countCoins.length; i++) {
			c += countCoins[i];
		}
		return c;
	}
	public void getAll() {
		int a = 0;
		for(int i=0; i<kindCoins.length; i++) {
			System.out.printf("%3d円 : %3d枚%n",kindCoins[i],countCoins[i]);
		}
		}
}
