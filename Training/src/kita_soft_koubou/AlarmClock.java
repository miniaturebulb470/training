package kita_soft_koubou;

public class AlarmClock extends Clock{
	private int alarmHour;
	private int alarmMinute;
	public AlarmClock(int hour,int minute,int second,int aHour, int aMinute) {
		super(hour,minute,second);
		this.alarmHour = aHour;
		this.alarmMinute = aMinute;
		
	}
	
	public void showData() {
		super.showData();
		System.out.printf("アラーム%d : %d%n",this.alarmHour,this.alarmMinute);

	}
}
