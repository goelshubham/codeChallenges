package org.ck.hackerRank.languages.java.introduction.currencyformatter;

import org.ck.codeChallengeLib.testhelper.BaseTest;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest extends BaseTest
{
	@Test
	@Ignore("Encoding Mismatch")
	public void test00() throws Exception
	{
		pipeResource("00");

		Solution.main(null);

		assertEquals(getFileAsResult("00"), this.output.toString());
	}
}
