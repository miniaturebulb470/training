package kita_soft_koubou;

public class Pitcher extends BaseballPlayer {
	double era;
	
	public Pitcher(String name,int num, double bat,double era) {
		this.name = name;
		this.num = num;
		this.bat = bat;
		this.era = era;
	}
	
	public void introduce() {
		System.out.printf("%s%n",super.name);
		System.out.printf("%d%n",super.num);
		System.out.printf("%.2f%n",super.bat);
		System.out.printf("%.2f%n",this.era);
	}
}
