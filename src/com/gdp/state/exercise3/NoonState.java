package com.gdp.state.exercise3;

public class NoonState implements State {
	private static NoonState singleton = new NoonState();
	private NoonState() {}
	public static State getInstance() {
		return singleton;
	}
	
	@Override
	public void doClock(Context context, int hour) {
		if(hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		} else if (9 <= hour && hour < 12 || 13 < hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.callSecurityCenter("紧急：午餐时间使用金库！");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("按下警铃(午餐时间)");
	}

	@Override
	public void doPhone(Context context) {
		context.recordLog("午餐时间的通话录音");
	}
	@Override
	public String toString() {
		return "[午餐时间]";
	}
	
	
}
