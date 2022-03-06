package parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	// Data Provider returns a 2-dimensional Object Array.
	
	@DataProvider
	public Object[][] testData(){
		Object[][] data = new Object[3][3];
		
		data[0][0] = "Java";
		data[0][1] = 2;
		data[0][2] = 'c';
		
		data[1][0] = 4;
		data[1][1] = 5;
		data[1][2] = 6;
		
		data[2][0] = 7;
		data[2][1] = 8;
		data[2][2] = 9;
		
		return data;
	}
	
	// testData : attribute of a dataprovider
	@Test(dataProvider="testData")
	public void testCase(int s1, int s2, int s3) {
		System.out.println("S1"+" "+s1+ " S2"+s2+ "S3"+s3);
		
	}

}
