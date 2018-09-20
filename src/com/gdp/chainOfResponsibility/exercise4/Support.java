package com.gdp.chainOfResponsibility.exercise4;

public abstract class Support {
	private String name;
	private Support next;
	public Support(String name) {
		this.name = name;
	}
	
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	
	public final void support(Trouble trouble) {
		for(Support obj = this; true; obj = obj.next) {
			if(obj.resolve(trouble)) {
				obj.done(trouble);
				break;
			} else if(obj.next == null){
				obj.fail(trouble);
				break;
			}
		}
	}
	
	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	protected abstract boolean resolve(Trouble trouble);
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}
}
