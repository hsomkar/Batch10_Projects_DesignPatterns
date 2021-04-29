package com.tyss.designpatterns.template;

public class Gta extends Game{

	@Override
	public void init() {
		System.out.println("gta loading");
		
	}

	@Override
	public void start() {
		System.out.println("strat shooting");
		
	}

	@Override
	public void end() {
		System.out.println("wasted");
		
	}

}
