package com.gdp.state;

public class DayState implements State {
	private static DayState singleton = new DayState();
	private DayState() {}
	
	public static State getInstance() {
		return singleton;
	}
	
	@Override
	public void doClock(Context context, int hour) {
		if(hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.recordLog("ʹ�ý��(����)");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("���¾���(����)");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("����ͨ��(����)");
	}
	
	public String toString() {
		return "[����]";
	}
}
