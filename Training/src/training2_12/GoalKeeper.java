package training2_12;

public class GoalKeeper extends SoccerPlayer {
	String POSITION_NAME = "ゴールキーパー";
	
	public void catchBall() {
		System.out.printf("%sはボールを手で受け止めました",getName());

	}
	
}
