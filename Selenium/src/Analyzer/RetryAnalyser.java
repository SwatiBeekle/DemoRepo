package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
 int count=0;
 int countretry=3;
	@Override
	public boolean retry(ITestResult result) {
		if(count<countretry) {
			count++;
		return true;
	}
	return false;

}
}