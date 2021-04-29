package com.tyss.designpattern.factorymethod;

public class HtmlButton implements Button {

	@Override
	public void rendering() {
		System.out.println("<button>hello world<button/>");
		
	}

	@Override
	public void clicking() {
		System.out.println("says hello world");
		
	}

}
