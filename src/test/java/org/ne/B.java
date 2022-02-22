package org.ne;

import org.testng.annotations.Test;

public class B {
	
	@Test(groups= {"smoke","sanity"})
	private void tc11() {

		System.out.println("print tc11");
	}
	@Test(groups= {"sanity","regression"})
	private void tc22() {

		System.out.println("print tc22");
	}
	@Test(groups= {"regression","smoke"})
	private void tc33() {

		System.out.println("print tc33");
	}
	
}
