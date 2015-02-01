import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class services {
    String baseUrl = "https://dashboard.nascomms.com/";
    WebDriver driver;
    String ServicesPage = "Services Home - Nascomms Dashboard";

    @Before
    public void setup() {
//    driver = new FirefoxDriver();
//        driver = new HtmlUnitDriver();
//      location of chrome driver at work
//    System.setProperty("webdriver.chrome.driver", "/Users/martin/Downloads/chromedriver");
//      location of chrome driver at home
        System.setProperty("webdriver.chrome.driver", "/home/martin/Applications/ChromeDriver/chromedriver");
        driver = new ChromeDriver();

//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void shouldDisplayServicesPage() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        Assert.assertEquals(ServicesPage, driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public void successfulLogin() {
        driver.get(baseUrl + "/Login/Login?ReturnUrl=%2f");
        driver.findElement(By.id("UserName")).clear();
        driver.findElement(By.id("UserName")).sendKeys("Martin.Smith");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("BongTow");
        driver.findElement(By.cssSelector("input.coloured_button")).click();
    }
}
