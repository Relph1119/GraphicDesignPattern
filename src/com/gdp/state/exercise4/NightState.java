package com.gdp.state.exercise4;

public class NightState implements State {
	
	private static NightState singleton = new NightState();
	private NightState() {}
	public static State getInstance() {
		return singleton;
	}
	
	@Override
	public void doClock(Context context, int hour) {
		if(9 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.callSecurityCenter("����������ʹ�ý�⣡");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("���¾���(����)");
		context.changeState(UrgentState.getInstance());
	}

	@Override
	public void doPhone(Context context) {
		context.recordLog("���ϵ�ͨ��¼��");
	}
	
	public String toString() {
		return "[����]";
	}

	

}
