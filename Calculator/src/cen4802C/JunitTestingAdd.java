package cen4802C;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestingAdd 
{

	@Test
	public void test() 
	{
		JunitTesting test = new JunitTesting();
		int output = test.add(5, 5);
		assertEquals(10, output);	
	}
}
