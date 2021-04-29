package com.tyss.designpattern.factorymethod.os;

public class OsFactory {

	public Os getInstance(String str) {
		if (str.equalsIgnoreCase("1"))
			return new Android();
		else if (str.equalsIgnoreCase("2"))
			return new Ios();
		else
			return new Windows();
	}

}
