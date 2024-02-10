package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderAll {
	@DataProvider(name = "facebook",parallel =  true)
	public Object[][] fbInputs(){
		Object[][] fb= {{"sathish@gmail.com","12345678"},
						{"ram@gmail.com","87654321"}};
		return fb;
	}
	@DataProvider(name="instagram",parallel = true)
	public Object[][] instaInputs(){
		Object[][] ig= {{"praveen@gmail.com","12345678"},
						{"guna@gmail.com","87654321"}};
		return ig;
	}

}
