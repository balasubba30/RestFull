package com.stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before(order=2)
	public void twoB() {
		System.out.println("This will run before the every Scenario");
	}

	@Before(order=1)
	public void oneB() {
		System.out.println("-----------------Start of Scenario-----------------");
	}

	@After(order=2)
	public void twoA() {
		System.out.println("-----------------End of Scenario-----------------");
	}

	@After(order=1)
	public void oneA() {
		System.out.println("This will run after the every Scenario");
	}
}
