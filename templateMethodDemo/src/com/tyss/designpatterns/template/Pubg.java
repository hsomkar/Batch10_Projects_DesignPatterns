package com.tyss.designpatterns.template;

public class Pubg extends Game {

	@Override
	public void init() {
		System.out.println("pubg loading");
		
	}

	@Override
	public void start() {
		System.out.println("pubg playing");
		
	}

	@Override
	public void end() {
		System.out.println("winner winner good dinner");
	}


}
