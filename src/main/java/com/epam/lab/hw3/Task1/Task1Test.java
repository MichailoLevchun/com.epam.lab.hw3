package com.epam.lab.hw3.Task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task1Test {

	@Test
	public void TestEquals() {
		Task1 t1 = new Task1("fhdskjf", 12);
		Task1 t2 = new Task1("fkjdslfk", 12);
		assertEquals(t1.getAge(), t2.getAge());
	}

	@Test
	public void TestNotNull() {
		Task1 t1 = new Task1("fhdskjf", 12);
		assertNotNull(t1.getAge());
	}

	@Test
	public void TestSame() {
		Task1 t1 = new Task1("aabb", 12);
		Task1 t2 = new Task1("aabb", 342);
		assertSame(t1.getName(), t2.getName());
	}

}
