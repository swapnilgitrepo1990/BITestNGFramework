package com.adp.bi.tests;

import org.testng.annotations.DataProvider;
import com.adp.main.config.Constants;
import com.adp.main.config.GetData;

/**
 * @author Swapnil Sonawane
 * @Description This class contains data providers of all methods
 *
 */
public class TestDataProvider {
	static GetData testData = new GetData();

	@DataProvider(name = "WorkFront Jobs")
	public static Object[][] testWorkFrontJobs() {
		Object[][] arrayObject = null;
		arrayObject = testData
				.getDataWithYesRunMode(testData.getDataFromExcel(Constants.testDataFile, "testWorkFrontJobs"));
		return arrayObject;
	}

	@DataProvider(name = "Test Blogs")
	public static Object[][] testBlogs() {
		Object[][] arrayObject = null;
		arrayObject = testData.getDataWithYesRunMode(testData.getDataFromExcel(Constants.testDataFile, "testBlogs"));
		return arrayObject;
	}

}
