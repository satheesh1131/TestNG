package rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyse implements IRetryAnalyzer {
	int startCount=0,endCount=3;
	@Override
	public boolean retry(ITestResult result) {
		if(startCount<endCount) {
			startCount++;
			return true;
		}
		return false;
	}

}
