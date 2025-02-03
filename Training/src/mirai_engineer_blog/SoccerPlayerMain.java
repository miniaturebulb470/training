package mirai_engineer_blog;

public class SoccerPlayerMain {

	public static void main(String[] args) {
		SoccerPlayer g = new GoalKeeper("川島",12);
		CenterForward c = new CenterForward("田村",11);
		System.out.println(c);
		c.kickBall();
		c.catchBall();
		System.out.println(g);
		g.kickBall();
		g.catchBall();
		
	}

}
