package reRunTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserForFailedTest implements IRetryAnalyzer{
	int startCount=1,endCount=4;
	@Override
	public boolean retry(ITestResult result) {
		if(startCount < endCount) {
			startCount++;
			return true;
		}
		return false;
	}
}
