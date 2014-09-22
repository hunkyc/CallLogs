import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class dashboardHomePageTests {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
        driver = new HtmlUnitDriver();
        baseUrl = "https://dashboard.nascomms.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

//    Test below removed from suite as no longer has help link on homepage
//    @Test
//    public void testHomepageHelpLink() throws Exception {
//        driver.get(baseUrl + "/");
//        driver.findElement(By.id("UserName")).clear();
//        driver.findElement(By.id("UserName")).sendKeys("Martin.Smith");
//        driver.findElement(By.id("Password")).clear();
//        driver.findElement(By.id("Password")).sendKeys("BongTow");
//        driver.findElement(By.cssSelector("input.coloured_button")).click();
//        driver.findElement(By.id("pageHelpLink")).click();
//        assertEquals("This is the home page of the Nascomms Dashboard. This page allows you to see a quick overview of your accounts leads and recent missed calls. It is important to regular check this page when loggin into your account as it contains service updates and messages from the Nascomms team.", driver.findElement(By.cssSelector("#window > p")).getText());
//        driver.findElement(By.cssSelector("span.k-icon.k-i-close")).click();
//        driver.findElement(By.id("logout")).click();
//    }

    @Test
    public void checkLinks() throws StaleElementReferenceException {
        String str = "Privacy Policy";
        driver.get(baseUrl + "/");
        driver.findElement(By.id("UserName")).clear();
        driver.findElement(By.id("UserName")).sendKeys("Martin.Smith");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("BongTow");
        driver.findElement(By.cssSelector("input.coloured_button")).click();
        List <WebElement> alllinks = driver.findElements(By.tagName("a"));

        for(int i=0; i<alllinks.size(); i++)
                System.out.println(alllinks.get(i).getText());

        for(int i=0; i< alllinks.size(); i++){
            if (alllinks.get(i).getText().equals("")) {
                //do nothing
            }
            else {
                    try {
                        System.out.println("going to " + alllinks.get(i).getText() + " link");
                        alllinks.get(i).click();
                        if (driver.getTitle().equals("404 Page Not Found - Nascomms Dashboard")) {
                            System.out.println("Link " + alllinks.get(i).getText() + " is a broken link");
                            driver.navigate().back();
                        }
                        else
                            driver.navigate().back();
                    } catch (StaleElementReferenceException e) {
                        e.printStackTrace();
                        System.out.println(alllinks.get(i).getText() + " is a stale link");
                        driver.get("https://dashboard.nascomms.com/");
                    }
            }
        }
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
}
