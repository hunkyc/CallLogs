import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class testOverhead {


    WebDriver driver;
    String baseUrl;

    testOverhead() throws Exception{
        setUp();
    }
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
//        driver = new HtmlUnitDriver();
        driver.manage().deleteAllCookies();
        baseUrl = "https://dashboard.nascomms.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void tearDown() throws Exception {
        driver.quit();
//        String verificationErrorString = verificationErrors.toString();
//        if (!"".equals(verificationErrorString)) {
//            fail(verificationErrorString);
//        }
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
