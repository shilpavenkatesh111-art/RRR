package test;

import org.testng.annotations.Test;

public class SimpleTest{
@Test(groups = "smoke")
public void simplem1() {
	System.out.println("---simple execution---");
}

@Test(groups = "regression")
public void simplem2() {
	System.out.println("---simple2 execution---");
}
}
