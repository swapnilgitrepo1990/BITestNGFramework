package com.adp.bi.selenium.utility;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.adp.bi.tests.TestWorkFrontJobs;

public class javaUtility {
	final static Logger logger = Logger.getLogger(TestWorkFrontJobs.class.getName());
	
	public static int randomNumber()
	{
		Random random = new Random();
		int number=random.nextInt(1000000);
		return number;
	}
	
	public static void pause(int timeIN)
	{
         logger.info("Executioned Paused for "+timeIN+" seconds");
		try {
				TimeUnit.SECONDS.sleep(timeIN);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
