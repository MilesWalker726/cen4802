package cen4802C;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestingMult 
{

	@Test
	public void test() 
	{
		JunitTesting test = new JunitTesting();
		int output = test.multiply(6, 3);
		assertEquals(18, output);

	}

}
