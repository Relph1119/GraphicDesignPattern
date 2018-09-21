package com.gdp.state.exercise3;

public interface Context {
	public abstract void setClock(int hour);
	public abstract void changeState(State state);
	public abstract void callSecurityCenter(String msg);
	public abstract void recordLog(String msg);
}
