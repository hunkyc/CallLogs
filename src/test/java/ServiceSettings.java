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
    String ServiceOverviewPage = "Service Overview:";
    String ServiceLabelsPage = "Service Labels:";
    String ContactDetailsPage = "Contact Details:";
    String CompanyDetailsPage = "Company Details:";
    String BlockedPhoneNumbersPage = "Incoming Blocked Phone Number";
    String VoiceMailPage = "Voicemail:";
    String OutOfHoursPage = "Out Of Hours Method:";
    String BusinessPhoneNumbersPage = "Business Phone Numbers:";
    String CallRecordingPage = "Call Recording:";

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
//
//    @Test
//    public void OverviewLink() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(1) > a")).click();
//        Assert.assertEquals(ServiceOverviewPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
//    }
//
//    @Test
//    public void LabelsLink() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(3) > a")).click();
//        Assert.assertEquals(ServiceLabelsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
//    }
//
//    @Test
//    public void ContactDetailsLink() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(5) > a")).click();
//        Assert.assertEquals(ContactDetailsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
//    }
//
//    @Test
//    public void CompanyDetailsLink() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(7) > a")).click();
//        Assert.assertEquals(CompanyDetailsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
//    }
//
//    @Test
//    public void BlockedPhoneNumbersLink() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(9) > a")).click();
//        Assert.assertEquals(BlockedPhoneNumbersPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
//    }
//
//    @Test
//    public void VoiceMailLink() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(7) > span:nth-child(1) > a")).click();
//        Assert.assertEquals(VoiceMailPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
//    }
//
//    @Test
//    public void OutOfHoursLink() {
//        successfulLogin();
//        driver.findElement(By.id("Services-mmListNav")).click();
//        driver.findElement(By.id("settings")).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(7) > span:nth-child(3) > a")).click();
//        Assert.assertEquals(OutOfHoursPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
//    }

    @Test
    public void BusinessPhoneNumbersLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(10) > span:nth-child(1) > a")).click();
        Assert.assertEquals(BusinessPhoneNumbersPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void CallRecordingLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(10) > span:nth-child(3) > a")).click();
        Assert.assertEquals(CallRecordingPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
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
