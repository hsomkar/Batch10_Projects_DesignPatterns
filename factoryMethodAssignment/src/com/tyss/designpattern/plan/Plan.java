package com.tyss.designpattern.plan;

abstract public class Plan {

	static int rate;

	public abstract void setRate();

	public float generateBill(float units) {
		setRate();
		return rate * units;
	}
}
