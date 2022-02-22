package org.ne;

import org.testng.annotations.Test;

public class C {
	
	@Test(groups= {"sanity","regression"})
	private void tc111() {

		System.out.println("print tc111");
	}
	@Test(groups="smoke")
	private void tc222() {

		System.out.println("print tc222");
	}
	@Test(groups= {"smoke","sanity"})
	private void tc333() {

		System.out.println("print tc333");
	}
	
}
