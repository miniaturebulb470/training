package kita_soft_koubou;

public class Robot {
	int id;
	String name;
	static int total = 0;
	
	public Robot(String name) {
		this.name = name;
		total ++;
		this.id = total;
	}
	public static int getTotal() {
		return total;
	}
	public void introduce() {
		System.out.printf("ID : %d  NAME : %s%n",this.id,this.name);
	}
}
