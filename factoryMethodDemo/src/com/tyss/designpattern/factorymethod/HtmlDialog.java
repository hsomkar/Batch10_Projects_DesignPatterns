package com.tyss.designpattern.factorymethod;

public class HtmlDialog extends Dialog {
	public void rendering() {
		System.out.println("<button>Test Button</button>");
		createButton();
	}



	@Override
	public Button createButton() {
		System.out.println("onclicking will says hello world");
		return null;
	}

}
