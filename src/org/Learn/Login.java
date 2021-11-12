package org.Learn;

import org.testng.annotations.Test;

@Test()
public class Login {
	@Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
	public void test() {
		System.out.println("test");
	}
	
	public void test1() {
		System.out.println("test1");
	}
}
