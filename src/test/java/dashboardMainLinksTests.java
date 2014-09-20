import com.thoughtworks.selenium.Selenium;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class dashboardMainLinksTests {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
//        driver = new HtmlUnitDriver();
        driver.manage().deleteAllCookies();
        baseUrl = "https://dashboard.nascomms.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void shouldSuccessfullyLogin() throws Exception {
        driver.get(baseUrl + "/Login/Login?ReturnUrl=%2f");
        driver.findElement(By.id("UserName")).clear();
        driver.findElement(By.id("UserName")).sendKeys("Martin.Smith");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("BongTow");
        driver.findElement(By.cssSelector("input.coloured_button")).click();
        assertEquals("Home - Nascomms Dashboard", driver.getTitle());
        try {
            assertEquals("Dashboard Home", driver.findElement(By.cssSelector("p.coloured_header_box")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        successsfulLogout();
    }

    @Test
    public void shouldDisplayUnsuccessfulLoginMessage() throws Exception {
        driver.get(baseUrl + "/Login/Login?ReturnUrl=%2f");
        driver.findElement(By.id("UserName")).clear();
        driver.findElement(By.id("UserName")).sendKeys("Martin.Smith");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("Hello");
        driver.findElement(By.cssSelector("input.coloured_button")).click();
        assertEquals("The user name or password provided is incorrect.",driver.findElement(By.className("validation-summary-errors")).getText());
    }

    @Test
    public void shouldDisplayCallLogsPage () throws Exception {
        successfulLogin();
        driver.findElement(By.id("calllogs")).click();
        assertEquals("Call Logs - Nascomms Dashboard", driver.getTitle());
        successsfulLogout();
    }

    @Test
    public void shouldDisplayReportsPage () throws Exception {
        successfulLogin();
        driver.findElement(By.id("reports")).click();
        assertEquals("Reports - Nascomms Dashboard", driver.getTitle());
        successsfulLogout();
    }

    @Test
    public void shouldDisplayHaveAChatPage () throws Exception {
        successfulLogin();
        driver.findElement(By.id("haveachat")).click();
        assertEquals("Have a Chat - Nascomms Dashboard", driver.getTitle());
        successsfulLogout();
    }

    @Test
    public void shouldDisplayAccountsPage () throws Exception {
        successfulLogin();
        driver.findElement(By.id("accounts")).click();
        assertEquals("Services Home - Nascomms Dashboard", driver.getTitle());
        successsfulLogout();
    }

    @Test
    public void shouldDisplayManagementSummaryPage () throws Exception {
        successfulLogin();
        driver.findElement(By.id("management")).click();
        assertEquals("Management Summary - Nascomms Dashboard", driver.getTitle());
        successsfulLogout();
    }

     @Test
    public void shouldDisplayAssistancePage () throws Exception {
        successfulLogin();
        driver.findElement(By.id("assistance")).click();
        assertEquals("Tickets - Nascomms Dashboard", driver.getTitle());
         successsfulLogout();
    }

    @Test
    public void shouldDisplayLoginPage () throws Exception {
        successfulLogin();
        driver.findElement(By.id("logout")).click();
        assertEquals("Nascomms Dashboard", driver.getTitle());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
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

