package com.epam.lab.hw3.Task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task3 {
	@Test
	public void testAssert() {
		String string1 = "Junit";
		String string2 = "Junit";
		String string3 = "test";
		String string4 = "test";
		String string5 = null;
		int variable1 = 1;
		int variable2 = 2;
		int[] airethematicArrary1 = { 1, 2, 3 };
		int[] airethematicArrary2 = { 1, 2, 3 };
		assertEquals(string1, string2);
		assertSame(string3, string4);
		assertNotSame(string1, string3);
		assertNotNull(string1);
		assertNull(string5);
		assertTrue(variable1 < variable2);
		assertArrayEquals(airethematicArrary1, airethematicArrary2);
	}
}
