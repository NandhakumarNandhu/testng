package org.ne;

import org.testng.annotations.Test;

public class D {

	@Test(groups="regression")
	private void tc1111() {

		System.out.println("print tc1111");
	}
	@Test(groups= {"sanity","smoke"})
	private void tc2222() {

		System.out.println("print tc2222");
	}
	@Test(groups= {"regression","sanity"})
	private void tc3333() {

		System.out.println("print tc3333");
	}
	
}
