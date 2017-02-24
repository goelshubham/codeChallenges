package org.ck.hackerRank.algorithms.implementation.nondivisiblesubset;

import org.ck.codeChallengeLib.testhelper.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest extends BaseTest
{
	@Test
	public void test00() throws Exception
	{
		pipeResource("00");

		Solution.main(null);

		assertEquals(getResult("3"), this.output.toString());
	}

	@Test
	public void test01() throws Exception
	{
		pipeResource("01");

		Solution.main(null);

		assertEquals(getResult("1"), this.output.toString());
	}

	@Test
	public void test02() throws Exception
	{
		pipeResource("02");

		Solution.main(null);

		assertEquals(getResult("5"), this.output.toString());
	}
}
