//import com.sun.xml.internal.bind.v2.TODO;
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
    String CustomerGreetingPage = "Customer Greetings:";
    String BusinesWhisperPage = "Business Whisper:";
    String FollowMePage = "Follow Me:";
    String PreTalkPage = "Pre-Talk:";
    String PreTalkGroupManagementPage = "Pre-Talk Group Management:";
    String AllowedRegionsPage = "Allowed Regions:";
    String SearchEngineTrackingPage = "Search Engine Tracking:";
    String TrackingUrlPage = "Tracking URL:";
    String GoogleTrackingPage = "Google Tracking:";
    String CallClassificationPage = "Call Classification:";
    String DiallerStylesPage = "Dialler Customisation:";
    String DiallerWebScriptsPage = "Dialler Script Download:";
    String LeadCallingFormPage = "Customise LeadCalling Form:";
    String LeadCallingWebScriptsPage = "LeadCalling Form Script Download:";
    String CallRecordingFtpPage = "Call Recording FTP:";
    String RecordedMessagePage = "Recorded Message:";
    String StatusPage = "One To One Calling:";
    String CustomersManagementPage = "Customer Address Book";
//    TODO Add colon ":" to end of title for consistency and replace temp description of service on page
    String StaffManagementPage = "Staff Address Book";
//    TODO Add colon ":" to end of title for consistency and replace temp description of service on page





    @Before
    public void setup() {
//    driver = new FirefoxDriver();
//        driver = new HtmlUnitDriver();
//      location of chrome driver at home
        System.setProperty("webdriver.chrome.driver", "/home/martin/Applications/ChromeDriver/chromedriver");
        driver = new ChromeDriver();

//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void OverviewLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(1) > a")).click();
        Assert.assertEquals(ServiceOverviewPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
    }

    @Test
    public void LabelsLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(3) > a")).click();
        Assert.assertEquals(ServiceLabelsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
    }

    @Test
    public void ContactDetailsLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(5) > a")).click();
        Assert.assertEquals(ContactDetailsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void CompanyDetailsLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(7) > a")).click();
        Assert.assertEquals(CompanyDetailsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void BlockedPhoneNumbersLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(4) > span:nth-child(9) > a")).click();
        Assert.assertEquals(BlockedPhoneNumbersPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
    }

    @Test
    public void VoiceMailLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(7) > span:nth-child(1) > a")).click();
        Assert.assertEquals(VoiceMailPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void OutOfHoursLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(7) > span:nth-child(3) > a")).click();
        Assert.assertEquals(OutOfHoursPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

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

    @Test
    public void CustomerGreetingLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(10) > span:nth-child(5) > a")).click();
        Assert.assertEquals(CustomerGreetingPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void BusinesWhisperLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(10) > span:nth-child(7) > a")).click();

        Assert.assertEquals(BusinesWhisperPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void FollowMeLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(10) > span:nth-child(9) > a")).click();
        Assert.assertEquals(FollowMePage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void PreTalkLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(10) > span:nth-child(11) > a")).click();
        Assert.assertEquals(PreTalkPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void PreTalkGroupManagementLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(10) > span:nth-child(13) > a")).click();
        Assert.assertEquals(PreTalkGroupManagementPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void AllowedRegionsLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(10) > span:nth-child(15) > a")).click();
        Assert.assertEquals(AllowedRegionsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void SearchEngineTrackingLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(13) > span:nth-child(1) > a")).click();
        Assert.assertEquals(SearchEngineTrackingPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void TrackingUrlLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(13) > span:nth-child(3) > a")).click();
        Assert.assertEquals(TrackingUrlPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void GoogleTrackingLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(13) > span:nth-child(5) > a")).click();
        Assert.assertEquals(GoogleTrackingPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void CallClassificationLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(13) > span:nth-child(7) > a")).click();
        Assert.assertEquals(CallClassificationPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void DiallerStylesLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(16) > span:nth-child(1) > a")).click();
        Assert.assertEquals(DiallerStylesPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void DiallerTextLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(16) > span:nth-child(3) > a")).click();
        Assert.assertEquals(DiallerStylesPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void DiallerWebScriptsLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(16) > span:nth-child(5) > a")).click();
        Assert.assertEquals(DiallerWebScriptsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void LeadCallingFormLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(19) > span:nth-child(1) > a")).click();
        Assert.assertEquals(LeadCallingFormPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > form > h1")).getText());
    }

    @Test
    public void LeadCallingStyleLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(19) > span:nth-child(3) > a")).click();
        Assert.assertEquals(LeadCallingFormPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
    }

    @Test
    public void LeadCallingWebScriptsLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(19) > span:nth-child(5) > a")).click();
        Assert.assertEquals(LeadCallingWebScriptsPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void CallRecordingFtpLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(22) > span:nth-child(1) > a")).click();
        Assert.assertEquals(CallRecordingFtpPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void RecordedMessageLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(22) > span:nth-child(3) > a")).click();
        Assert.assertEquals(RecordedMessagePage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void StatusLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(25) > span:nth-child(1) > a")).click();
        Assert.assertEquals(StatusPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h2")).getText());
    }

    @Test
    public void CustomerManagementLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(25) > span:nth-child(3) > a")).click();
        Assert.assertEquals(CustomersManagementPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
    }

    @Test
    public void StaffManagementLink() {
        successfulLogin();
        driver.findElement(By.id("Services-mmListNav")).click();
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_third_first.settingsSideMenu > p:nth-child(25) > span:nth-child(5) > a")).click();
        Assert.assertEquals(StaffManagementPage, driver.findElement(By.cssSelector("body > div.body > div.two_third > h1")).getText());
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
