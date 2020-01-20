package csce247project1;

public abstract class Robot {
	protected String name;
	MoveBehavior moveBehavior;
	TalkBehavior talkBehavior;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public void setMoveBehavior(MoveBehavior mB) {
		moveBehavior = mB;
	}
	
	public void setTalkBehavior(TalkBehavior tB) {
		talkBehavior = tB;
	}
	
	public String move() {
		return moveBehavior.move();
	}
	
	public String talk() {
		return talkBehavior.talk();
	}
	
	public abstract String toString();
}
