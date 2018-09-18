package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object SUITE_CASE_MAP
     
    /**
     * <p></p>
     */
    public static Object CURRENT_TESTSUITE_ID
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['SUITE_CASE_MAP' : [:], 'CURRENT_TESTSUITE_ID' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        SUITE_CASE_MAP = selectedVariables['SUITE_CASE_MAP']
        CURRENT_TESTSUITE_ID = selectedVariables['CURRENT_TESTSUITE_ID']
        
    }
}
