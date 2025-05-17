import org.testng.Assert;
import org.testng.annotations.Test;


public class testNG1 {
	@Test
	public void testsum() {
		int a = 10, b=5;
		int expectedresult = 15;
		int actualresult = a+b;
		
		Assert.assertEquals(actualresult,expectedresult, "Sum did not match!");
	}
	
	@Test
	public void testmessage() {
		String expected = "Hello World";
		String actual = "Hello there";
		
		Assert.assertEquals(actual, expected, "String do not match!");
	}
}