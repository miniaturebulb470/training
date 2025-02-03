package kita_soft_koubou;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void showData() {
		System.out.printf("%d : %d : %d%n",this.hour,this.minute,this.second);
	}
}
