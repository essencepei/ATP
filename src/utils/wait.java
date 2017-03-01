package utils;

import org.apache.log4j.Logger;

public class wait {
	private static Logger log;
	public static void main(String[] args) {
	}
	
	public void waitForElement(String target){
		   for (int second = 0;; second++) {   
		        if (second >= 60) {   
		            log.debug("Element:" + target   
		                    + " can't be found after 60 seconds");   
//		            fail("find element timeout: " + target);                   
		        }   
		        try {   
//		            if (selenium.isElementPresent(target))   
		                break;   
		        } catch (Exception e) {   
		            log.debug("Element:" + target   
		                    + " can't be found in 60 seconds");   
		            assert (false);   
		        }   
//		        pause(1000);   
		    } 
	}
	
	public void click(String locator){
		waitForElement(locator);
//		selenimu.click(locator);
		
		
	}
}
