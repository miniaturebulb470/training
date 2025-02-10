package mirai_engineer_blog;
//hennkou
public class Main2_17 {
	int a;
	public static void main(String[] args) {
		Car mycar = new Car(123, "ロミオ", 0.5);
        try {
            while(true) {
                // 走行する
                mycar.run();
            }
        } catch(GasolineException e) {
            System.out.println(e.getMessage());
        }

	}

}
class GasolineException extends Exception{
	public GasolineException(String s) {
		super(s);
	}
}
class Car{
	int number;
	String type;
	double gas;
	
	public Car(int number, String type, double gas) {
		this.number = number;
		this.type = type;
		this.gas = gas;
	}
	public void run() throws GasolineException {
		if(this.gas < 0.1) {
			throw new GasolineException("ナンバー"+this.number+"の"+this.type+"はガソリン不足のため走行できません。");
		}
		System.out.printf("ナンバー%dの%sは走行しています。%n",this.number,this.type);
		this.gas -= 0.1;
	}
}