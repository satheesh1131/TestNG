package threadLocal;

import org.testng.annotations.DataProvider;

public class DataProviderFB{
	
	@DataProvider(parallel = true)
	public Object[][] fbInputs(){
		Object[][] fb= {{"sathish@gmail.com","12345678"},
						{"ram@gmail.com","87654321"}};
		return fb;
	}
}
