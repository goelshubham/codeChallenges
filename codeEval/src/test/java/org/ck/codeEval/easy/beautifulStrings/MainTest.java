package org.ck.codeEval.easy.beautifulStrings;

import static org.junit.Assert.assertEquals;

import org.ck.codeEval.test.BaseTest;
import org.junit.Test;

public class MainTest extends BaseTest
{
	@Test
	public void test00() throws Exception
	{
		Main.main(getFileAsArgs("00"));
		
		assertEquals(getResult("152", "754", "491", "729", "646"), this.output.toString());
	}
}
