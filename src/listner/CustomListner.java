package listner;

import org.testng.ITestResult;

public class CustomListner extends BaseClass implments ITestListener {
	
	@Override
	public Void onTestFailure(ITestResult result) {
		
		System.out.println("Failed Test Case");
		try {
			failed(result.getMethod().getMethodName());
			
		}catch(Exception e) {
			//TODO: handle exception
		}
		
	}


