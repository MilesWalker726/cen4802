package cen4802C;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestingDivd 
{

	@Test
	public void test() 
	{
		JunitTesting test = new JunitTesting();
		int output = test.divide(150, 15);
		assertEquals(10, output);

	}

}
