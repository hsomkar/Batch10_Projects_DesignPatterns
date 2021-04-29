package com.tyss.designpattern.factorymethod;

public class WindowDialog extends Dialog{

//	@Override
//	public void renderWindow() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public Button createButton() {
		return new WindowButton();
	}


}
