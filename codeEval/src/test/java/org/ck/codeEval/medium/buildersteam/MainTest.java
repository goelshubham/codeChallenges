package org.ck.codeEval.medium.buildersteam;

import org.ck.codeEval.test.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest extends BaseTest
{
	@Test
	public void test00() throws Exception
	{
		Main.main(getFileAsArgs("00"));

		assertEquals(getResult("1", "2", "0"), this.output.toString());
	}

	@Test
	public void test01() throws Exception
	{
		Main.main(getFileAsArgs("01"));

		assertEquals(getResult("0", "2", "0", "1", "0", "0", "0", "1", "2", "0", "1", "1", "0", "1", "5",
				"0", "1", "2", "20", "0", "1", "1", "0", "1", "1", "0", "30", "1", "0", "0", "0", "2",
				"0", "0", "9", "11", "2", "2", "1", "0"), this.output.toString());
	}
}
