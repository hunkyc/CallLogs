//navigates to the have a chat page and tests the functionality of that page
//import com.sun.xml.internal.bind.v2.TODO;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;


public class haveAChat {
    WebDriver driver;
    String baseUrl;
    String haveAChatButton = "HaveAChat-mmListNav";
    String searchButton = "input[value='Search']";

    //private boolean acceptNextAlert = true;
//private StringBuffer verificationErrors = new StringBuffer();
//String startDate = "1/03/2914 12:00AM";

    @Before
    public void setUp() throws Exception {
        //when using HTML Unit driver headless / no browser
        driver = new HtmlUnitDriver();

        //when using Firefox browser
//        driver = new FirefoxDriver();

        //when using google chrome browser
//        System.setProperty("webdriver.chrome.driver", "/home/martin/Applications/ChromeDriver/chromedriver");
//        driver = new ChromeDriver();

        //used by all drivers
        driver.manage().deleteAllCookies();
        baseUrl = "https://dashboard.nascomms.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
//        String verificationErrorString = verificationErrors.toString();
//        if (!"".equals(verificationErrorString)) {
//            fail(verificationErrorString);
//        }
    }

    @Test
    public void shouldDisplayhaveAChatPage() {
        driver.get(baseUrl + "/HaveAChat");
        successfulLogin();
        driver.findElement(By.id(haveAChatButton)).click();
        Assert.assertEquals("Have a Chat - Nascomms Dashboard", driver.getTitle());
        successsfulLogout();
    }

    private void successfulLogin() {
        driver.get(baseUrl + "/Login/Login?ReturnUrl=%2f");
        driver.findElement(By.id("UserName")).clear();
        driver.findElement(By.id("UserName")).sendKeys("Martin.Smith");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("BongTow");
        driver.findElement(By.cssSelector("input.coloured_button")).click();
    }

    private void successsfulLogout() {
        driver.findElement(By.id("logout")).click();
    }
}