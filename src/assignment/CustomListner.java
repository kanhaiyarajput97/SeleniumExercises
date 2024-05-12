package assignment;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListner extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("failed test case");
		try {
			failed(result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
