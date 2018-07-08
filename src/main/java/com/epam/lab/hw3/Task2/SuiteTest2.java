package com.epam.lab.hw3.Task2;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SuiteTest2 {
	@Test
	public void TestSame() {
		String firstString = "aaa";
		String secondString = "aaa";
		assertSame(firstString, secondString);
	}
}
