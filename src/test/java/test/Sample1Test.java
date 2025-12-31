package test;

import org.testng.annotations.Test;

public class Sample1Test {
	@Test(groups = "smoke")
	public void Sample1Test1() {
		System.out.println("--Sample1Test print---");
	}
	
	@Test(groups = "regression")
	public void bm() {
		System.out.println("---Sample1Test before method---");
	}
	
}
