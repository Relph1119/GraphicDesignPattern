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
		context.callSecurityCenter("����������ʱʹ�ý�⣡");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("���¾���(����ʱ)");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("����ͨ��(����ʱ)");
	}
	@Override
	public String toString() {
		return "[����ʱ]";
	}
	
	
}
