package org.ck.projectEuler.solutions.problem009;

import static org.junit.Assert.assertEquals;

import org.ck.projectEuler.test.BaseTest;
import org.junit.Test;

public class ProblemTest extends BaseTest
{
	@Test
	public void test00() throws Exception
	{
		Problem.main(null);
		
		assertEquals(getResult("31875000"), this.output.toString());
	}
}
