package twoDimenshanalArrayData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnToReadDataFromSameClass {

	 @Test(dataProvider = "supplyTheDataForAcceptTheDataMethod")
	    public void acceptTheDatafromSupplyDataMethod(String firstName, String lastName, String mobileNumber, String pwd) {

	        System.out.println(firstName + " : " + lastName + " : " + mobileNumber + " : " + pwd);

	    }

	    @DataProvider
	    public Object[][] supplyTheDataForAcceptTheDataMethod() {
	        Object[][] obj = new Object[3][4];
	        // first person
	        obj[0][0] = "kanhaiya";
	        obj[0][1] = "singh";
	        obj[0][2] = "9336372223";
	        obj[0][3] = "112233";
	        // second person
	        obj[1][0] = "kishan";
	        obj[1][1] = "singh";
	        obj[1][2] = "8932075216";
	        obj[1][3] = "1520154";
	        // third person
	        obj[2][0] = "lucky";
	        obj[2][1] = "singh";
	        obj[2][2] = "8948904868";
	        obj[2][3] = "9874521";

	        return obj;
	    }
}