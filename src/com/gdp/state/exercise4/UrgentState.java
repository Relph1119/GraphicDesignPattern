package com.gdp.state.exercise4;

public class UrgentState implements State {
	
	private static UrgentState singleton = new UrgentState();
	private UrgentState() {}
	public static State getInstance() {
		return singleton;
	}
	
	@Override
	public void doClock(Context context, int hour) {
		
	}

	@Override
	public void doUse(Context context) {
		context.callSecurityCenter("紧急：紧急时使用金库！");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("按下警铃(紧急时)");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("正常通话(紧急时)");
	}
	@Override
	public String toString() {
		return "[紧急时]";
	}
	
	
}
