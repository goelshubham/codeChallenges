package org.ck.codeEval.medium.sortMatrixColums;

import org.ck.codeEval.test.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest extends BaseTest
{
	@Test
	public void test00() throws Exception
	{
		Main.main(getFileAsArgs("00"));

		assertEquals(getResult("-3 -3 29 | -17 -17 69 | 8 44 3",
				"-26 -21 25 39 | -91 27 -81 -98 | 67 98 32 -87 | 18 9 -90 -79",
				"-10 26 39 | 66 -62 97 | 85 22 36"), this.output.toString());
	}
}
