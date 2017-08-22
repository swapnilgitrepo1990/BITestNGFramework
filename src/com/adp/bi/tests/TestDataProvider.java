package com.adp.bi.tests;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import com.adp.main.config.Constants;
import com.adp.main.config.GetData;
import com.adp.main.config.RunTest;

/**
 * @author Swapnil Sonawane
 * @Description This class contains data providers of all methods
 *
 */
public class TestDataProvider {
	static GetData testData = new GetData();
	public final static Logger logger = Logger.getLogger(TestWorkFrontJobs.class.getName());
	@DataProvider(name = "WorkFront Jobs")
	public static Object[][] testWorkFrontJobs(ITestContext context) {
		 Object[][] arrayObject = null;
		if(RunTest.testconfig.get("parallel_Mode").equalsIgnoreCase("On"))
		{
		String rowNumber = context.getCurrentXmlTest().getParameter("test_param");
	    logger.info("Row number set in the parameter is :-"+rowNumber);
	   
		arrayObject = testData.getDataFromExcelByRow(Constants.testDataFile, "testWorkFrontJobs", Integer.parseInt(rowNumber));
				//.getDataWithYesRunMode(testData.getDataFromExcel(Constants.testDataFile, "testWorkFrontJobs"));
	}else{		
		arrayObject = testData
				.getDataWithYesRunMode(testData.getDataFromExcel(Constants.testDataFile, "testWorkFrontJobs"));
	}
		return arrayObject;
	}

	@DataProvider(name = "Test Blogs")
	public static Object[][] testBlogs() {
		Object[][] arrayObject = null;
		arrayObject = testData.getDataWithYesRunMode(testData.getDataFromExcel(Constants.testDataFile, "testBlogs"));
		return arrayObject;
	}

}
