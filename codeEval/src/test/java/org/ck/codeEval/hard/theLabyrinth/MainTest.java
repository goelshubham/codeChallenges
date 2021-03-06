package org.ck.codeEval.hard.theLabyrinth;

import org.ck.codeEval.test.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest extends BaseTest
{
	@Test
	public void test00() throws Exception
	{
		Main.main(getFileAsArgs("00"));

		assertEquals(
				getResult("*************************+*************************",
						"*                        +++++++    * *           *",
						"* * *** *** *******************+***** * * * * * ***",
						"* * *   * *   *   * * *    +++++        * * * *   *",
						"***** * * *** * *** * * ***+*** * ***** *** *******",
						"*     * *   * *     *   * *+*   *     * * *       *",
						"*** ******* * ***** *** * *+******* * *** * *** * *",
						"* *     *     *   *     *  +  *     * *       * * *",
						"* * *********** * *********+* ******* * *** * *****",
						"*     * *   * * *     *  +++* *   *   * *   *     *",
						"* ***** * *** * ***** ***+*** * * * ******* ***** *",
						"* *     *   * * *       *+* *   * * * *   *     * *",
						"* * ***** *** *** *** ***+* ***** *** *** ***** ***",
						"*     *   * * *     * *  +    * *       * *     * *",
						"* * ***** * * * *** * ***+***** *** ***** *** * * *",
						"* * *           *   * *+++*     *     *     * *   *",
						"* ******* ******* * ***+******* *** * * ********* *",
						"*   *       *     * *+++*         * * * *     *   *",
						"*** * * ***** * *****+******* ******* * * * * * ***",
						"*     *   *   *+++++++  *       * *   * * * * *   *",
						"*** * *** * ***+***** ******* * * * *** *** * *** *",
						"* * * * * * * *+++  * * *     *       *   * * * * *",
						"* * *** * * * ***+*** * * ********* ***** * * * * *",
						"* * *   * * *    +*   * *   *     *   *     * * * *",
						"* * * *** *******+***** * ******* *** * *** *** * *",
						"* * *     *   *  +*     * *     * * * *   *   * * *",
						"* ***** * * * ***+* ***** ***** * * * ***** * * * *",
						"* *     * * * *+++  * *     *           * * *   * *",
						"* ***** * *** *+***** *********** ******* * * * * *",
						"*     * * * *  +++++++++  *   *     * * *   * * * *",
						"* * * *** * *** * *****+***** ******* * *** * * * *",
						"* * *   * * *   *     *+*      +++++++*     * * * *",
						"* ***** * * ***********+*******+*** *+******* * * *",
						"* *     *   *   *     *+*   *+++* * *+      * *   *",
						"* * * ********* * *****+* ***+*** ***+* ***** * ***",
						"* * *       *  +++++++++*   *+* *   *+*   *   *   *",
						"* ******* *****+******* * ***+* * ***+*** * *******",
						"*   *   *   *+++*   *     *  +      *+* * * * * * *",
						"* ***** * ***+***** * *******+* *****+* *** * * * *",
						"*     *+++++++    *     *    +* * *  +*   *     * *",
						"*** ***+*********************+*** ***+*** *** * * *",
						"*   *  +*     *+++++++++++++++* * *  +*       *   *",
						"*** ***+* *****+* ******* *** * * ***+* *** ***** *",
						"*  +++++*+++++++*   *   * * *   *  +++*   * *   * *",
						"***+*****+***** *** *** *** ***** *+* *** *** * * *",
						"*  +++++*+  *   * * *       *   * *+*   * *   *   *",
						"*** ***+*+***** * ***** *** *** ***+*** ******* ***",
						"*   *  +++*   *   *     * * * *  +++* * *     *   *",
						"* ***** *** ***** ******* * * ***+*** * *** ***** *",
						"*   *                 *  +++++++++*         *     *",
						"*************************+*************************"),
				this.output.toString());
	}

	@Test
	public void test01() throws Exception
	{
		Main.main(getFileAsArgs("01"));

		assertEquals(
				getResult("***************************************************+*************************************************",
						"* *       *   *         * *     *   *         * * *+++++++++++++  * *+++*                   *     * *",
						"* * ***** * ******* ***** * *** * * * ******* * * ***** * *****+*** *+*+***** *** * ********* * * * *",
						"*   * *   *     *           * *   * * *   *   *       * *     *+++++++*+++++*   * * * * *     * * * *",
						"* * * *** * * * *** ***** *** * ***** *** *** * *** *** *********** *** ***+*** * *** * * * * * * * *",
						"* *     * * * *     * * *   * *             *     *       * *   * *   * *  +++  * * * *   * * * *   *",
						"* *********** *** *** * * *** ***** * ******* ***** * ***** *** * * *** *****+*** * * * *** * ***** *",
						"*         * *   *   *   * * *       *   *   * *     *   * *   * *   *   *   *+*     *   * * * * *   *",
						"* ***** *** ******* * ***** *** *** ******* * * *** *** * * *** ******* * * *+***** *** * *** * *****",
						"*     *       *   * *   * *   * *   *   *   * *   * * *   *       * *     * *+* * * * *   *   *     *",
						"* *** * * ***** * * * * * * ******* * *** * * * *** * ******* *** * * *******+* * *** ******* *** ***",
						"* * * * *   *   *     * * * *   *     *   * * *   * *       * * *     *   *  +  *     *   *   * *   *",
						"* * *** *** ******* *** * * * * * * *** * ***** * * * ********* * * *** * ***+*** *** *** * * * * * *",
						"* * * * *       *   * *       *   * * * *   * * * * *     * * * * * *   * * *+* * *   * *   *     * *",
						"* * * ***** * ******* ***** * ***** * ***** * * * *** *** * * * * * * *** * *+* * ***** * ********* *",
						"*   *       *   *     *     * *     *   * *     *       *   *   * *   * * * *+* * * *   *     *   * *",
						"* ******* ***** * *********** * ***** * * *********** *** * *** * * *** *** *+* * * *** * * *** *****",
						"*       * * * *   *     *     * *   * * * *     *   *   * *   *   *   *   *  +*     * * * *     *   *",
						"* *** *** * * * ***** *** ******* *** *** * ******* * * * *** ******* *** ***+* ***** * *** ***** * *",
						"*   *   * *             * *   * * *           *       * *   * * * *     *    +++++++      *       * *",
						"* *** *** * * ***** * ***** * * * *** * * *** *** ***** *** * * * *********** *** *+******* * *******",
						"* *     * * * *     *   *   *     *   * * * *   * *   *   * *   *               * *+++++  * * * *   *",
						"********* * ************* * *** ******* *** *** * *** ***** ***** *** * *** ********* *+*** * * * * *",
						"*       * * *   * *       * *     *       *   *       *   *     * * * * * * *     * * *+  * * *   * *",
						"* ***** *** *** * * * ******* ******* * *** ***** ***** * * *** * * * * * * * ***** ***+* * *** *** *",
						"*     *     *       *   *     *       *         * * *   *     *   *   *   *   *     *  +* *   *     *",
						"*** *** ******* *** ***** * *** ********* *** ***** *************** * * ******* *******+*** ******* *",
						"*     *   * *   *     *   * *   * * * *   *   *   * *               * *   *     *   *  +++    *   * *",
						"* ***** *** * *** * * ***** ***** * * * ***** * *** ***** * *** * * ******* * ***** *****+*** * * * *",
						"*     *   *   *   * * *   * *   *     * *   *             *   * * * *       *   *       *+*   * *   *",
						"* * ********* * ***** * *** *** * *** * *** * * * *************** *** *** ***** * * *****+* *** *****",
						"* *         * *   * *   * *       *         * * *   *   *         *     * * *   * *     *+* *   *   *",
						"* ***** ***** *** * *** * * * *** * * * * ***** ***** ***** ***** *** * *** * * *** * ***+*** ***** *",
						"*       * *     * *       * *   * * * * *   *   *   *     *   *   * * * *   * *   * * *  +++      * *",
						"******* * * *** * * * ***** ******* ******* *** * * * * ********* * ******* *** * * *** ***+*** *** *",
						"* * *       * * * * * *   *       * *   *   * * * *   *       *   *     *       * *       *+  *   * *",
						"* * * *** *** * * ******* *** * *** * *** * * ********* ************* * ***** ***** *** ***+******* *",
						"*     *     *   *     * *   * * * * *   * * * *   *   *       * * * * *         *   *   * *+*+++++* *",
						"************* ***** * * * *** * * ***** * *** *** * *** * * * * * * * * * *** ***** * *** *+*+***+* *",
						"*   *       * *   * *   *   * *     * *   *       *     * * *         * * *         *   *  +++  *+++*",
						"* ***** * ***** ***** *** * * *** *** *** * ***** ********* * * *** ******* * * * * * ********* ***+*",
						"*   *   * * *       *     * *   * * *   * *   *   * *   * * * * * * * *   * * * * * *   *     * * *+*",
						"* *** * * * *** * *** ***** * ***** * * * ******* * * *** ***** * * * * ***************** ******* *+*",
						"*     * *       * * *   *   * *   *         *   *     *       * * *   *               *   *     *  +*",
						"* *** * * * * ***** ********* *** ************* * *** * *** * *** * ***** * *** ***** * ***** *****+*",
						"*   * * * * * *   *         *   *   *       * *   *     *   *       *     *   * * * *   * *   * * *+*",
						"* *********** * ***** ******* *** *** *** * * *** * * ******* *** *** ***** * *** * ***** * *** * *+*",
						"*   *   *       *         *       * *   * *   *   * *   *   *   *     * * * * *     *       * *   *+*",
						"* *** * ******* *** * *** *** *** * *** *** ***** *** *** *** *** ***** * *** ***** ******* * *** *+*",
						"* * * * *     * *   * *   * *   * * * * * * *   * *     * *   * * *     *     *       * *        +++*",
						"* * *** ***** * * ***** *** * * * * * * * *** * * ***** * * * * ***** ***** * * * * * * *** *****+***",
						"* *     * *   *   * * *     * * *   *   *     * *   *       *         * * * * * * * *   * * * *  +  *",
						"* *** *** * *** *** * *** * ***** *** ***** * ***** ******* * ***** * * * *** *** * *** * *** ***+* *",
						"* * *     *   * *     *   *   * *         * *   * * *     * * * *   *       *     * *   * *     *+* *",
						"* * *** ***** * * *** ***** * * * * *** * ***** * ***** * ***** *** ***** * ***** * * *** *** ***+* *",
						"*   *     *       *     *   * *   * *   *     *     *   *   * *     *     * *   * * *   *        +* *",
						"* ******* *** * *** ***** *** ******* ***** *** * * ***** * * *** *** * ***** * * * *** * *******+***",
						"* *     *     *   * * *   * *     *     *     * *         * *         *   * * * * * *   *   *    +  *",
						"* ***** ***** ******* *** * ***** *** ********* * * ***** * * ******* * *** * * ******* * *** ***+* *",
						"* *       *     * *           *   *   *   *     * * * *   * *   *   * *       *       * *   * * *+* *",
						"* * ********* *** * ***** ***** *** ***** ***** * * * ***** *** * *** * *** *** * * * * * ***** *+***",
						"*   *   *       *       *     *     *       *     * *         * * *   *   * *   * * * * *       *+++*",
						"* ***** * *** * * *** *** ******* *** *********** ******* * * * * ***** ***** ********* * *********+*",
						"* *     * *   * * *     *       *         *   * * *   * * * * *   *   * *   *   * *     * *       *+*",
						"* * *** ******* *** *** ***** ***** *** ***** * * * *** * * *** ***** * *** *** * ***** ***** *****+*",
						"* * *         * *     *   *       * * * *     *   * *     *   * * * *   * * * *   * *   *+++++++++++*",
						"* * ***** *** *** *** ***** ***** *** * ***** *** * *** *** ***** * ***** * * *** * *****+***** *** *",
						"* *       * *   * * *     *     * *               *     *     *               *     *+++++*   * *   *",
						"* ********* * ***** * * *** *** ***** *** *** *********** ******* ***** ***** *** ***+*** *** ***** *",
						"*   *   *   *         *   *   *   *   * *   * *   *   *     *     *     *   *   *   *+* * *       * *",
						"* *** * * *** ************* ******* * * * *** * ***** ***** ***** * * * *** *** *** *+* *** *** * * *",
						"*   * *   *             *   * *     * *     *   *         * * *   * * * *     * * *  +    * * * * * *",
						"* ******* * ***** * * * ***** * ***** * *** ***** * *** * *** * ***** *** * * * * ***+***** * ***** *",
						"*   *       *   * * * *   *   *     * *   * *   * * *   *   * * *   *   * * *  +++++++        *   * *",
						"*** ***** * * * ***** ***** ************* *** * *** ***** * * * * ********* ***+********* ******* * *",
						"*     * * * * *   *   *       * *     * * * * *         * *   *   *   * *     *+*   * *   *     * * *",
						"***** * * *** *** *** * *** *** *** *** * * * ********* * * ********* * ***** *+* *** * *** ***** * *",
						"*   * *   *   * *     * * *   *         *       *       * * *           * * * *+*     * *         * *",
						"*** * * ***** * * ***** * * *** ***** ***** *********** *** * * * *** *** * ***+***** ***** * ***** *",
						"*   *   *   * *   *       *   *     *       *     *   * *       * * * *   * *  +* *   *     *   * * *",
						"* *** *** *** *** *** * *** * *** *** ******* * ***** * *********** * * *** * *+* *** ******* *** * *",
						"* *           *     * * * * * *   *       * * *   *         * * *       *   * *+* *     *   *       *",
						"* * *********** *** ***** *** ******* *** * * *** *** ***** * * ******* * * ***+* *** ***** * ***** *",
						"* * *             *   * * *       * *   * *     * * *     *       * * * * * *  +      *   *     *   *",
						"* * * ***** ***** * * * * *** *** * ***** ******* * ******* * *** * * * * *****+*** * * * * *** *** *",
						"*   *     * *   * * *       * *     * *   * *   * * *     * *   *   *   *+++*+++  * * * *   *   *   *",
						"* ******* *** *** *** ***** * * *** * *** * * *** * * * *** * ***** * ***+*+*+* * *** * *********** *",
						"*   * *       *     * * * * * *   * * *   *   * * *   * * * * *     *   *+*+++* *   *       *   *   *",
						"***** * *** *** *** *** * *** *** * * * * *** * * * *** * * * ***** *** *+***** ***** ***** * ***** *",
						"*   *     * *   *       * * *   * *     * *     *     *   * *     * * * *+*       * *     *     *   *",
						"* *** *** *************** * *** ********* ***** * * *** ******* * * * * *+***** *** * ******* ***** *",
						"*     *   *           *       *   *     *   * * * *   * *       *       *+  * *   *   *   *       * *",
						"* ********* *** * *** * *** *** ******* *** * * * ******* *** * * * *** *+*** *** ***** * * ***** * *",
						"*   *       * * *   *   * * *   *     *       * * *         * * * *   * *+  *   * *   * * * *   * * *",
						"* *** * *** * *** *** *** ******* *** * *** *** * *** * *** * ***********+***** * *** *** * *** *** *",
						"*   * *   * *   * *               *       * *     *   * *   *   *+++++++++*   * * *     * * *   *   *",
						"* *** ******* * *** * ******* ***** ******* *** ***** ***** *** *+***** *** *** * ***** * ***** *** *",
						"*         *   * * * * *   *           *     *       *   *   *+++++  *     *   * * *   *       * * * *",
						"***** ***** * *** *** *** * *** *** *** ******* *************+***** * *** *** * ***** * *** *** * * *",
						"*       *   *             *     *   *             ++++++++++++    * * *                 *           *",
						"**************************************************+**************************************************"),
				this.output.toString());
	}

	@Test
	public void testCustom00() throws Exception
	{
		Main.main(getFileAsArgs("custom00"));

		assertEquals(
				getResult("*************************+*************************",
						"*                        +++++++    * *           *",
						"* * *** *** *******************+***** * * * * * ***",
						"* * *   * *   *   * * *    +++++        * * * *   *",
						"***** * * *** * *** * * ***+*** * ***** *** *******",
						"*     * *   * *     *   * *+*   *     * * *       *",
						"*** ******* * ***** *** * *+******* * *** * *** * *",
						"* *     *     *   *     *  +  *     * *       * * *",
						"* * *********** * *********+* ******* * *** * *****",
						"*     * *   * * *     *  +++* *   *   * *   *     *",
						"* ***** * *** * ***** ***+*** * * * ******* ***** *",
						"* *     *   * * *       *+* *   * * * *   *     * *",
						"* * ***** *** *** *** ***+* ***** *** *** ***** ***",
						"*     *   * * *     * *  +    * *       * *     * *",
						"* * ***** * * * *** * ***+***** *** ***** *** * * *",
						"* * *           *   * *+++*     *     *     * *   *",
						"* ******* ******* * ***+******* *** * * ********* *",
						"*   *       *     * *+++*         * * * *     *   *",
						"*** * * ***** * *****+******* ******* * * * * * ***",
						"*     *   *   *+++++++  *       * *   * * * * *   *",
						"*** * *** * ***+***** ******* * * * *** *** * *** *",
						"* * * * * * * *+++  * * *     *       *   * * * * *",
						"* * *** * * * ***+*** * * ********* ***** * * * * *",
						"* * *   * * *    +*   * *   *     *   *     * * * *",
						"* * * *** *******+***** * ******* *** * *** *** * *",
						"* * *     *   *  +*     * *     * * * *   *   * * *",
						"* ***** * * * ***+* ***** ***** * * * ***** * * * *",
						"* *     * * * *+++  * *     *           * * *   * *",
						"* ***** * *** *+***** *********** ******* * * * * *",
						"*     * * * *  +++++++++  *   *     * * *   * * * *",
						"* * * *** * *** * *****+***** ******* * *** * * * *",
						"* * *   * * *   *     *+*      +++++++*     * * * *",
						"* ***** * * ***********+*******+*** *+******* * * *",
						"* *     *   *   *     *+*   *+++* * *+      * *   *",
						"* * * ********* * *****+* ***+*** ***+* ***** * ***",
						"* * *       *  +++++++++*   *+* *   *+*   *   *   *",
						"* ******* *****+******* * ***+* * ***+*** * *******",
						"*   *   *   *+++*   *     *  +      *+* * * * * * *",
						"* ***** * ***+***** * *******+* *****+* *** * * * *",
						"*     *+++++++    *     *    +* * *  +*   *     * *",
						"*** ***+*********************+*** ***+*** *** * * *",
						"*   *  +*     *+++++++++++++++* * *  +*       *   *",
						"*** ***+* *****+* ******* *** * * ***+* *** ***** *",
						"*  +++++*+++++++*   *   * * *   *  +++*   * *   * *",
						"***+*****+***** *** *** *** ***** *+* *** *** * * *",
						"*  +++++*+  *   * * *       *   * *+*   * *   *   *",
						"*** ***+*+***** * ***** *** *** ***+*** ******* ***",
						"*   *  +++*   *   *     * * * *  +++* * *     *   *",
						"* ***** *** ***** ******* * * ***+*** * *** ***** *",
						"*   *                 *  +++++++++*         *     *",
						"*************************+*************************",
						"*************************+*************************",
						"*                        +++++++    * *           *",
						"* * *** *** *******************+***** * * * * * ***",
						"* * *   * *   *   * * *    +++++        * * * *   *",
						"***** * * *** * *** * * ***+*** * ***** *** *******",
						"*     * *   * *     *   * *+*   *     * * *       *",
						"*** ******* * ***** *** * *+******* * *** * *** * *",
						"* *     *     *   *     *  +  *     * *       * * *",
						"* * *********** * *********+* ******* * *** * *****",
						"*     * *   * * *     *  +++* *   *   * *   *     *",
						"* ***** * *** * ***** ***+*** * * * ******* ***** *",
						"* *     *   * * *       *+* *   * * * *   *     * *",
						"* * ***** *** *** *** ***+* ***** *** *** ***** ***",
						"*     *   * * *     * *  +    * *       * *     * *",
						"* * ***** * * * *** * ***+***** *** ***** *** * * *",
						"* * *           *   * *+++*     *     *     * *   *",
						"* ******* ******* * ***+******* *** * * ********* *",
						"*   *       *     * *+++*         * * * *     *   *",
						"*** * * ***** * *****+******* ******* * * * * * ***",
						"*     *   *   *+++++++  *       * *   * * * * *   *",
						"*** * *** * ***+***** ******* * * * *** *** * *** *",
						"* * * * * * * *+++  * * *     *       *   * * * * *",
						"* * *** * * * ***+*** * * ********* ***** * * * * *",
						"* * *   * * *    +*   * *   *     *   *     * * * *",
						"* * * *** *******+***** * ******* *** * *** *** * *",
						"* * *     *   *  +*     * *     * * * *   *   * * *",
						"* ***** * * * ***+* ***** ***** * * * ***** * * * *",
						"* *     * * * *+++  * *     *           * * *   * *",
						"* ***** * *** *+***** *********** ******* * * * * *",
						"*     * * * *  +++++++++  *   *     * * *   * * * *",
						"* * * *** * *** * *****+***** ******* * *** * * * *",
						"* * *   * * *   *     *+*      +++++++*     * * * *",
						"* ***** * * ***********+*******+*** *+******* * * *",
						"* *     *   *   *     *+*   *+++* * *+      * *   *",
						"* * * ********* * *****+* ***+*** ***+* ***** * ***",
						"* * *       *  +++++++++*   *+* *   *+*   *   *   *",
						"* ******* *****+******* * ***+* * ***+*** * *******",
						"*   *   *   *+++*   *     *  +      *+* * * * * * *",
						"* ***** * ***+***** * *******+* *****+* *** * * * *",
						"*     *+++++++    *     *    +* * *  +*   *     * *",
						"*** ***+*********************+*** ***+*** *** * * *",
						"*   *  +*     *+++++++++++++++* * *  +*       *   *",
						"*** ***+* *****+* ******* *** * * ***+* *** ***** *",
						"*  +++++*+++++++*   *   * * *   *  +++*   * *   * *",
						"***+*****+***** *** *** *** ***** *+* *** *** * * *",
						"*  +++++*+  *   * * *       *   * *+*   * *   *   *",
						"*** ***+*+***** * ***** *** *** ***+*** ******* ***",
						"*   *  +++*   *   *     * * * *  +++* * *     *   *",
						"* ***** *** ***** ******* * * ***+*** * *** ***** *",
						"*   *                 *  +++++++++*         *     *",
						"*************************+*************************"),
				this.output.toString());
	}
}
