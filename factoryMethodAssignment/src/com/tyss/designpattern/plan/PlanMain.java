package com.tyss.designpattern.plan;

import java.util.Scanner;

public class PlanMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of units :");
		float unit = sc.nextFloat();
		sc.close();
		GetPlan gp = new GetPlan();
		Plan p = gp.getPlan("Domestic");
		System.out.println("Bill for Domestic plan is " + p.generateBill(unit));
		Plan p1 = gp.getPlan("Commercial");
		System.out.println("Bill for Commercial plan is " + p1.generateBill(unit));
		Plan p2 = gp.getPlan("Institutional");
		System.out.println("Bill for Institutional plan is " + p2.generateBill(unit));
	}
}
