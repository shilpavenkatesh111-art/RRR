package test;

import org.testng.annotations.Test;

public class SampleTest {
	@Test(groups = "smoke")
//1st executes this method
	public void sample_m3() {
		System.out.println("---create---");
	}

//2nd this method will get execute, because we gave the priority -1
	@Test(groups = "regression")
	public void sample_m2() {
		System.out.println("---edit---");
	}

//3rd this method will get execute
	@Test(dependsOnMethods = "sample_m3")
	public void sample_m1() {
		System.out.println("---delete---");

	}

//this method will get execute 2 times
	@Test(invocationCount = 2)
	public void sample_m4() {
		System.out.println("---test---");
	}

}