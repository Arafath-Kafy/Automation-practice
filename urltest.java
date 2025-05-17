import org.testng.annotations.Test;
import org.testng.Assert;
import java.net.URI;
import java.net.URISyntaxException;

public class urltest {
    public boolean isValidUrl(String urlStr) {
        try {
            URI uri = new URI(urlStr);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            

            if (!"http".equals(scheme) && !"https".equals(scheme)) {
                return false;
            }


            if (host == null || host.startsWith(".")) {
                return false;
            }

            return true;
        } catch (URISyntaxException e) {
            return false;
        }
    }
}

class UrlValidator {
    urltest validator = new urltest();

    @Test
    public void testValidUrls() {
        Assert.assertTrue(validator.isValidUrl("https://www.google.com"));
        Assert.assertTrue(validator.isValidUrl("http://example.com/path?query=123"));
    }

    @Test
    public void testInvalidUrls() {
        Assert.assertFalse(validator.isValidUrl("ftp://fileserver.com")); 
        Assert.assertFalse(validator.isValidUrl("http://.com"));         
        Assert.assertFalse(validator.isValidUrl("http://"));           
        Assert.assertFalse(validator.isValidUrl("http://localhost"));   
    }
}
