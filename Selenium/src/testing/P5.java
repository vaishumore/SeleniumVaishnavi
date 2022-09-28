package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P5 {
	@Test
	public void carrot() {
		Reporter.log("carrot", true);
	}

	@Test
	public void tomato() {
		Reporter.log("tomato", true);
	}
    @Test 
    public void bhindi() {
    	Reporter.log("bhindi",false);
    }
	
}
