package org.ne;

import org.testng.annotations.Test;

public class A {

	
	@Test(groups="smoke")
	private void tc1() {

		System.out.println("print tc1");
	}
	@Test(groups="sanity")
	private void tc2() {

		System.out.println("print tc2");
	}
	@Test(groups="regression")
	private void tc3() {

		System.out.println("print tc3");
	}
	
	
	
	
}
