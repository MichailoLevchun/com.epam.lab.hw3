package com.epam.lab.hw3.Task4;

import static org.junit.Assert.*;
import java.lang.reflect.Method;
import org.junit.Test;

public class Task4Test {
	
	@Test
	public void TestNotNull() throws Exception{
		@SuppressWarnings("rawtypes")
		Class cls = Class.forName("com.epam.lab.hw3.Task4.Task4");
		Object obj = cls.newInstance();
		@SuppressWarnings("unchecked")
		Method method = cls.getDeclaredMethod("sum", Integer.TYPE,Integer.TYPE);
		method.setAccessible(true);
		int result= (int) method.invoke(obj, new Object[]{25,16});
		assertNotNull(result);
	}
}
