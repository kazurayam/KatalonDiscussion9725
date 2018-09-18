import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import internal.GlobalVariable as GlobalVariable

class MyTestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		if (GlobalVariable.CURRENT_TESTSUITE_ID != null &&
			GlobalVariable.CURRENT_TESTSUITE_ID.length() > 0) {
			Map<String, String> m = (Map<String, String>)GlobalVariable.SUITE_CASE_MAP
			m.put(
				GlobalVariable.CURRENT_TESTSUITE_ID,
				testCaseContext.getTestCaseId())
		}
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		GlobalVariable.CURRENT_TESTSUITE_ID = testSuiteContext.getTestSuiteId()
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		GlobalVariable.CURRENT_TESTSUITE_ID = null
	}
}