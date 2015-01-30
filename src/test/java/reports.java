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
    String goButton = "body > div.body > div.one_third > form > input";
    String ReportsHomepageTitle = "Reports - Nascomms Dashboard";
    String AutomaticReportPage = "Automatic Reports - Nascomms Dashboard";
    String StatisticsPage = "Reports - Nascomms Dashboard";
    String CallCountsPage = "Reports - Nascomms Dashboard";

    @Before
    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
//        driver = new HtmlUnitDriver();
//      location of chrome driver at work
        System.setProperty("webdriver.chrome.driver", "/Users/martin/Downloads/chromedriver");
//      location of chrome driver at home
//        System.setProperty("webdriver.chrome.driver", "/home/martin/Applications/ChromeDriver/chromedriver");
        driver = new ChromeDriver();

//        driver.manage().deleteAllCookies();
        baseUrl = "https://dashboard.nascomms.com/";
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

//    @Test
//         public void shouldDisplayReportsHomePage() {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        assertEquals(ReportsHomepageTitle, driver.getTitle());
//        assertEquals("Recent Reports", (driver.findElement(By.cssSelector("body > div.body > div.two_third_first > div:nth-child(1) > table > tbody > tr:nth-child(1) > th"))).getText());
//        assertEquals("Leads This Week", (driver.findElement(By.cssSelector("body > div.body > div.two_third_first > div:nth-child(2) > table > tbody > tr:nth-child(1) > th"))).getText());
//        assertEquals("Leads Today", (driver.findElement(By.cssSelector("body > div.body > div.two_third_first > div:nth-child(4) > table > tbody > tr:nth-child(1) > th"))).getText());
//        assertEquals("Leads This Year", (driver.findElement(By.cssSelector("body > div.body > div.two_third_first > div:nth-child(5) > table > tbody > tr:nth-child(1) > th"))).getText());
//    }

//    @Test
//    public void shouldDisplayAutomaticReportsPage() {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        driver.findElement(By.id("reportPDFImg")).click();
//        assertEquals(AutomaticReportPage, driver.getTitle());
//        assertEquals("Automatic Reports", (driver.findElement(By.cssSelector("body > div.body > h1"))).getText());
//    }
//
//    @Test
//    public void shouldDisplayStatisticsPage() {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        driver.findElement(By.id("reportsStatsImg")).click();
//        assertEquals(StatisticsPage, driver.getTitle());
//        assertEquals("Account Statistics", (driver.findElement(By.cssSelector("body > div.body > h1"))).getText());
//    }

    @Test
    public void shouldCallCountsPage() {
        successfulLogin();
        driver.findElement(By.id(reportsButton)).click();
        driver.findElement(By.id("fmiCallCounts")).click();
        assertEquals(CallCountsPage, driver.getTitle());
        assertEquals("Call Counts Reports", (driver.findElement(By.cssSelector("body > div.body > h1"))).getText());
    }

//    @Test
//    public void shouldDisplayDailyReportsWhenDailyReportsSelected() {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        assertEquals(pageTitle, driver.getTitle());
//        driver.findElement(By.cssSelector(goButton)).click();
//    }
//
//    @Test
//    public void shouldDisplayWeeklyReportsWhenWeeklyReportsSelected() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        assertEquals(pageTitle, driver.getTitle());
//        driver.findElement(By.className("k-input")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("#reportsSidePDFSelect_listbox > li:nth-child(2)")).click();
//        driver.findElement(By.cssSelector(goButton)).click();
//    }
//
//    @Test
//    public void shouldDisplayMonthlyReportsWhenMonthlyReportsSelected() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        assertEquals(pageTitle, driver.getTitle());
//        driver.findElement(By.className("k-input")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("#reportsSidePDFSelect_listbox > li:nth-child(3)")).click();
//        driver.findElement(By.cssSelector(goButton)).click();
//    }
//
//    @Test
//    public void shouldDisplayMonthlyFilteredReportsWhenMonthlyFilteredReportsSelected() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        assertEquals(pageTitle, driver.getTitle());
//        driver.findElement(By.className("k-input")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("#reportsSidePDFSelect_listbox > li:nth-child(4)")).click();
//        driver.findElement(By.cssSelector(goButton)).click();
//    }
//
//    @Test
//    public void shouldDisplayYearlyReportsWhenYearlyReportsSelected() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(reportsButton)).click();
//        assertEquals(pageTitle, driver.getTitle());
//        driver.findElement(By.className("k-input")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("#reportsSidePDFSelect_listbox > li:nth-child(5)")).click();
//        driver.findElement(By.cssSelector(goButton)).click();
//    }

    @After
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
}