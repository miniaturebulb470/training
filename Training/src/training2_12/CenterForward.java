package training2_12;

public class CenterForward extends SoccerPlayer {
	String POSITION_NAME = "センターフォワード";

	public CenterForward(String name, int uniformNumber) {
		super(name, uniformNumber);

	}

	public String getPositionName() {
		return this.POSITION_NAME;
	}
	public String toString() {
		return this.POSITION_NAME +"  "+ super.toString();
	}
}
