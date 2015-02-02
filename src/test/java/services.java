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
//    public void shouldDisplayAllServicesPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        Assert.assertEquals(ServicesPage, driver.getTitle());
//        Assert.assertEquals(AllServicesPage, driver.findElement(By.cssSelector("body > div.body > div.three_quarter > h1")).getText());
//    }
//
//    @Test
//    public void shouldDisplayServicesSettingsPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        Assert.assertEquals(ServicesSettingsPage, driver.getTitle());
//        Assert.assertEquals(ServicesSettings, driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > h1")).getText());
//    }
//
//    @Test
//    public void shouldDisplayClickCallingServicesPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("clickcalling")).click();
//        Assert.assertEquals(ServicesPage, driver.getTitle());
//        Assert.assertEquals(ClickCallingServicesPage, driver.findElement(By.cssSelector("body > div.body > div.three_quarter > h1")).getText());
//    }
//
//    @Test
//    public void shouldDisplayMultiTrackingClickCallingServicesPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("mtclickcalling")).click();
//        Assert.assertEquals(ServicesPage, driver.getTitle());
//        Assert.assertEquals(MTClickCallingServicesPage, driver.findElement(By.cssSelector("body > div.body > div.three_quarter > h1")).getText());
//    }
//
//    @Test
//    public void shouldDisplayGeoCallingServicesPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("geocalling")).click();
//        Assert.assertEquals(ServicesPage, driver.getTitle());
//        Assert.assertEquals(GeoCallingServicesPage, driver.findElement(By.cssSelector("body > div.body > div.three_quarter > h1")).getText());
//    }
//
//    @Test
//    public void shouldDisplayMultiTrackingGeoCallingServicesPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("mtgeocalling")).click();
//        Assert.assertEquals(ServicesPage, driver.getTitle());
//        Assert.assertEquals(MTGeoCallingServicesPage, driver.findElement(By.cssSelector("body > div.body > div.three_quarter > h1")).getText());
//    }
//
//    @Test
//    public void shouldDisplayLeadCallingServicesPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("leadcalling")).click();
//        Assert.assertEquals(ServicesPage, driver.getTitle());
//        Assert.assertEquals(LeadCallingServicesPage, driver.findElement(By.cssSelector("body > div.body > div.three_quarter > h1")).getText());
//    }
//
//    @Test
//    public void shouldDisplayPaCallingServicesPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("pacalling")).click();
//        Assert.assertEquals(ServicesPage, driver.getTitle());
//        Assert.assertEquals(PaCallingServicesPage, driver.findElement(By.cssSelector("body > div.body > div.three_quarter > h1")).getText());
//    }
//
//    @Test
//    public void shouldDisplayHaveAChatServicesPage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("haveachat")).click();
//        Assert.assertEquals(ServicesPage, driver.getTitle());
//        Assert.assertEquals(HaveAChatServicesPage, driver.findElement(By.cssSelector("body > div.body > div.three_quarter > h1")).getText());
//    }
//
//    @Test
//    public void shouldDisplayAddServicePage() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("addaccount")).click();
//        Assert.assertEquals(AddAccountPage, driver.getTitle());
//        Assert.assertEquals(AddService, driver.findElement(By.cssSelector("body > div.body > h1")).getText());
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