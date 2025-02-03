package training2_12;

public abstract class SoccerPlayer {
	private String name;
	private int uniformNumber;
	
	public SoccerPlayer(String name, int uniformNumber) {
		this.name = name;
		this.uniformNumber = uniformNumber;
	}
	public String getName() {return this.name;}
	public void kickBall() {
		System.out.printf("%sはボールを蹴りました",getName());
	}
	public void catchBall() {
		System.out.printf("%sはボールを足で受け止めました",getName());
	}
	abstract String getPositionName();
	public String toString() {
		return this.name + this.uniformNumber;
	}
}
