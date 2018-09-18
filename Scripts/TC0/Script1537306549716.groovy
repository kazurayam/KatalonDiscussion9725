import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

def memory = GlobalVariable.CURRENT_TESTSUITE_ID

WebUI.comment(">>> start GlobalVariable.CURRENT_TESTSUITE_ID=${GlobalVariable.CURRENT_TESTSUITE_ID}")

Map<String, String> m = (Map<String, String>)GlobalVariable.SUITE_CASE_MAP
WebUI.comment(">>> GlobalVariable.SUITE_CASE_MAP.get(\'" + GlobalVariable.CURRENT_TESTSUITE_ID +
	"\')=" + m.get(GlobalVariable.CURRENT_TESTSUITE_ID))

WebUI.delay(1)

def found = GlobalVariable.CURRENT_TESTSUITE_ID
WebUI.comment(">>> end   GlobalVariable.CURRENT_TESTSUITE_ID=${GlobalVariable.CURRENT_TESTSUITE_ID}")

if (found != memory) {
	throw new IllegalStateException("*** found=${found}, memory=${memory}")
}