package training2_12;

public class CenterForward extends SoccerPlayer {
	String POSITION_NAME = "センターフォワード";

	public CenterForward(String name, int uniformNumber) {
		super(name, uniformNumber);

	}

	public String getPositionName() {
		return this.POSITION_NAME;
	}
	public void info() {
		System.out.printf("名前 : %s%n", getName());
		System.out.printf("No : %d%n", this.uniformNumber);
		System.out.printf("POSITION_NAME : %s%n",this.POSITION_NAME);
	}

}
