package cen4802C;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestingSub 
{

	@Test
	public void test() 
	{
		JunitTesting test = new JunitTesting();
		int output = test.subtract(25, 6);
		assertEquals(19, output);
	}
}
