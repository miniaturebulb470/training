package training2_12;

public abstract class SoccerPlayer {
	private String name;
	private int uniformNumber;
	
	public SoccerPlayer(String name, int uniformNumber) {
		this.name = name;
		this.uniformNumber = uniformNumber;
	}
	public String getName() {return this.name;}
	public int getUniformNumber() {return this.uniformNumber;}
	public void kickBall() {
		System.out.printf("%sはボールを蹴りました%n",getName());
	}
	public void catchBall() {
		System.out.printf("%sはボールを足で受け止めました%n",getName());
	}
	abstract String getPositionName();
	public String toString() {
		return this.name + "  背番号"+this.uniformNumber;
	}
}
