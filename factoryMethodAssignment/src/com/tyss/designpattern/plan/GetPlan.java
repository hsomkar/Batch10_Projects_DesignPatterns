package com.tyss.designpattern.plan;

public class GetPlan {

	public Plan getPlan(String planType) {
		if (planType.equalsIgnoreCase("Domestic"))
			return new Domestic();
		else if (planType.equalsIgnoreCase("Commercial"))
			return new Commercial();
		else
			return new Institutional();
	}
}
