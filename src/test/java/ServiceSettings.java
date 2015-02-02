import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceSettings {
    String baseUrl = "https://dashboard.nascomms.com/";
    WebDriver driver;
    String ServicesPage = "Services Home - Nascomms Dashboard";
    String AddAccountPage = "Add Account - Nascomms Dashboard";
    String ServicesSettingsPage = "Services Settings - Nascomms Dashboard";
    String AllServicesPage = "All Services:";
    String ClickCallingServicesPage = "ClickCalling Services:";
    String MTClickCallingServicesPage = "MultiTracking ClickCalling Services:";
    String GeoCallingServicesPage = "GeoCalling Services:";
    String MTGeoCallingServicesPage = "MultiTracking GeoCalling Services:";
    String LeadCallingServicesPage = "LeadCalling Services:";
    String PaCallingServicesPage = "PACalling Services:";
    String HaveAChatServicesPage = "HaveAChat Services:";
    String AddService = "Request Additional Services";
    String ServicesSettings = "Services Settings:";
    String ServiceOverviewPage = "Service Overview:";
    String ServiceLabelsPage = "Service Labels:";



    @Before
    public void setup() {
//    driver = new FirefoxDriver();
//        driver = new HtmlUnitDriver();
//      location of chrome driver at work
        System.setProperty("webdriver.chrome.driver", "/Users/martin/Downloads/chromedriver");
//      location of chrome driver at home
//        System.setProperty("webdriver.chrome.driver", "/home/martin/Applications/ChromeDriver/chromedriver");
        driver = new ChromeDriver();

//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

//    @Test
//    public void OverviewLink() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(1) > a")).click();
//        Assert.assertEquals(ServiceOverviewPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
//    }

    @Test
    public void LabelsLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(3) > a")).click();
        Assert.assertEquals(ServiceLabelsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
    }

//    @Test
//    public void shouldDisplayServicesSettingsPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        Assert.assertEquals(ServicesSettingsPage, driver.getTitle());
//        Assert.assertEquals(ServicesSettings, driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > h1")).getText());
//    }

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
