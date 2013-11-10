package wad;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SampleTest {

    private String port;
    private WebDriver driver;
    private String baseAddress;
    
    @Before
    public void setUp() {
        
        driver = new HtmlUnitDriver();
        port = System.getProperty("jetty.port", "8090");
        baseAddress = "http://localhost:" + port + "/app";
    }
     
    @Test
    public void testingTests() {
    
        driver.get(baseAddress);
        Assert.assertTrue(driver.getPageSource().contains("register"));
        
    }
    
}
