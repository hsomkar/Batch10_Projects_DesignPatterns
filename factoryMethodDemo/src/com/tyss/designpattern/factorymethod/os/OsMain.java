package com.tyss.designpattern.factorymethod.os;

public class OsMain {

	public static void main(String[] args) {
		OsFactory obj=new OsFactory();
		Os o=obj.getInstance("1");
		o.specs();
		Os o1=obj.getInstance("2");
		o1.specs();
		Os o2=obj.getInstance("3");
		o2.specs();
	}
}
