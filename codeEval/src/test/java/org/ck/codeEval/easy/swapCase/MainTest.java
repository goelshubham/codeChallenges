package org.ck.codeEval.easy.swapCase;

import static org.junit.Assert.assertEquals;

import org.ck.codeEval.test.BaseTest;
import org.junit.Test;

public class MainTest extends BaseTest
{
	@Test
	public void test00() throws Exception
	{
		Main.main(getFileAsArgs("00"));

		assertEquals(getResult("hELLO WORLD!", "jAVAsCRIPT LANGUAGE 1.8", "a LETTER"), this.output.toString());
	}
}
