//navigates to the Call Logs page and selects each item from the drop-down list
//import com.sun.xml.internal.bind.v2.TODO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class reports {
    WebDriver driver;
    String baseUrl;
    String reportsButton = "Reports-mmListNav";

    @Before
    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
//        driver = new HtmlUnitDriver();

        System.setProperty("webdriver.chrome.driver", "/Users/martin/Downloads/chromedriver");
        driver = new ChromeDriver();

//        driver.manage().deleteAllCookies();
        baseUrl = "https://dashboard.nascomms.com/";
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

//    @Test
//    public void shouldDisplayReportsPage() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        assertEquals("Reports - Nascomms Dashboard", driver.getTitle());
//        Thread.sleep(3000);
//    }

//    @Test
//    public void shouldDisplayDailyReportsWhenDailyReportsSelected() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        assertEquals("Reports - Nascomms Dashboard", driver.getTitle());
//        driver.findElement(By.id("reportsSidePDFSelect")).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_third > form > input")).click();
//        Thread.sleep(3000);
//    }

    @Test
    public void shouldDisplayWeeklyReportsWhenWeeklyReportsSelected() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Users/martin/Downloads/chromedriver");
//        WebDriver driver = new ChromeDriver();

//        driver.get("https://dashboard.nascomms.com/Login/Login?ReturnUrl=%2f");
//        driver.findElement(By.id("UserName")).clear();
//        driver.findElement(By.id("UserName")).sendKeys("Martin.Smith");
//        driver.findElement(By.id("Password")).clear();
//        driver.findElement(By.id("Password")).sendKeys("BongTow");
//        driver.findElement(By.cssSelector("input.coloured_button")).click();

        successfulLogin();
        driver.findElement(By.id(reportsButton)).click();
        assertEquals("Reports - Nascomms Dashboard", driver.getTitle());
        driver.findElement(By.className("k-input")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#reportsSidePDFSelect_listbox > li:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third > form > input")).click();
    }

    private void successfulLogin() {
        driver.get(baseUrl + "/Login/Login?ReturnUrl=%2f");
        driver.findElement(By.id("UserName")).clear();
        driver.findElement(By.id("UserName")).sendKeys("Martin.Smith");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("BongTow");
        driver.findElement(By.cssSelector("input.coloured_button")).click();
    }
}