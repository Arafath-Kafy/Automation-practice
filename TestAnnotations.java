import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotations {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class: Setup database connection");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class: Close database connection");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method: Open browser");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method: Close browser");
    }

    @Test
    public void testLogin() {
        System.out.println("Executing testLogin...");
        Assert.assertTrue(true, "Login test passed.");
    }

    @Test
    public void testSearch() {
        System.out.println("Executing testSearch...");
        
        
        boolean searchSuccessful = false;
        
        Assert.assertTrue(searchSuccessful, "Search test failed.");
    }

}
