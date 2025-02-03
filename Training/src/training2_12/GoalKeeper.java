package training2_12;

public class GoalKeeper extends SoccerPlayer {
	String POSITION_NAME = "ゴールキーパー";
	
	
	public GoalKeeper(String name, int uniformNumber) {
		super(name,uniformNumber);
	}

	public void catchBall() {
		System.out.printf("%sはボールを手で受け止めました",getName());
	}
	String getPositionName() {
		return this.POSITION_NAME;
	}
	public String toString() {
		return this.POSITION_NAME + super.toString();
	}

}
