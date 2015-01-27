//navigates to the Call Logs page and selects each item from the drop-down list
//import com.sun.xml.internal.bind.v2.TODO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;


public class callLogs {
    WebDriver driver;
    String baseUrl;
    String callLogButton ="CallLogs-mmListNav";
    String searchButton = "input[value='Search']";

    //private boolean acceptNextAlert = true;
//private StringBuffer verificationErrors = new StringBuffer();
//String startDate = "1/03/2914 12:00AM";

    @Before
    public void setUp() throws Exception {
        //when using HTML Unit driver headless / no browser
//        driver = new HtmlUnitDriver();

        //when using Firefox browser
//        driver = new FirefoxDriver();

        //when using google chrome browser
        System.setProperty("webdriver.chrome.driver", "/home/martin/Applications/ChromeDriver/chromedriver");
        driver = new ChromeDriver();

        //used by all drivers
        driver.manage().deleteAllCookies();
        baseUrl = "https://dashboard.nascomms.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllServicesFromDropList() throws InterruptedException {
//
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.cssSelector("span.k-icon.k-i-arrow-s")).click();
//        driver.findElement(By.id("SearchParams_AccountID_option_selected")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//// TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//@Test
//public void shouldDisplayCorrectRecordsWhenSelectAllClickCallingServicesFromDropList() {
//    successfulLogin();
//    driver.findElement(By.id(callLogButton)).click();
//    driver.findElement(By.className("k-input")).click();
//    driver.findElement(By.cssSelector("#SearchParams_AccountID_listbox > li:nth-child(2)")).click();
//    driver.findElement(By.cssSelector(searchButton)).click();
//// TODO direct connect to Db to extract records and compare with displayed results
//}
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllGeoCallingServicesFromDropList()   {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.className("k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_AccountID_listbox > li:nth-child(3)")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//// TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenLeadCallingSelectAllServicesFromDropList() {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.className("k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_AccountID_listbox > li:nth-child(4)")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//// TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllPACallingServicesFromDropList() {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.className("k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_AccountID_listbox > li:nth-child(5)")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//// TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllMtClickCallingServicesFromDropList() {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.className("k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_AccountID_listbox > li:nth-child(6)")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//// TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllMtGeoCallingServicesFromDropList() throws InterruptedException{
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.className("k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_AccountID_listbox > li:nth-child(7)")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(searchButton)).click();
//// TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllHaveAChatServicesFromDropList() throws InterruptedException{
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.className("k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_AccountID_listbox > li:nth-child(8)")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(searchButton)).click();
//// TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenDateRangeIsSet()  {
//        String startDate = "1/03/2914 12:00AM";
//        String endDate = "1/03/2914 12:00AM";
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_StartDate']")).clear();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_StartDate']")).sendKeys(startDate);
//        driver.findElement(By.xpath(".//*[@id='SearchParams_EndDate']")).clear();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_EndDate']")).sendKeys(endDate);
//        driver.findElement(By.cssSelector(searchButton)).click();
////TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCustomerNumberEntered() throws InterruptedException {
//        String customerNumber = "(07) 3843 3551";
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.id("SearchParams_CustomerNumber")).clear();
//        driver.findElement(By.id("SearchParams_CustomerNumber")).sendKeys(customerNumber);
//        driver.findElement(By.cssSelector(searchButton)).click();
//        Thread.sleep(2000);
////TODO direct connect to DB to extract records and compare with displayed results
//}
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsAll() {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_quarter > form > table > tbody > tr:nth-child(12) > td > span > span > span.k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_Status_option_selected")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsAllUnanswered() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_quarter > form > table > tbody > tr:nth-child(12) > td > span > span > span.k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_Status_listbox > li:nth-child(2)")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsRegistered() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_quarter > form > table > tbody > tr:nth-child(12) > td > span > span > span.k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_Status_listbox > li:nth-child(3)")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsDenied() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.cssSelector("body > div.body > div.one_quarter > form > table > tbody > tr:nth-child(12) > td > span > span > span.k-input")).click();
//        driver.findElement(By.cssSelector("#SearchParams_Status_listbox > li:nth-child(4)")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
////
    @Test
    public void ShouldDisplayCorrectRecordsWhenCallStatusIsAllAnswered() throws InterruptedException {
        successfulLogin();
        driver.findElement(By.id(callLogButton)).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_quarter > form > table > tbody > tr:nth-child(12) > td > span > span > span.k-input")).click();
        driver.findElement(By.cssSelector("body > div.body > div.one_quarter > form > table > tbody > tr:nth-child(12) > td > span > span > span.k-input")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("#SearchParams_Status_listbox > li:nth-child(5)")).click();
        driver.findElement(By.cssSelector(searchButton)).click();
        Thread.sleep(2000);
        //TODO direct connect to DB to extract records and compare with displayed results
    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsBusy() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[6]")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//        Thread.sleep(2000);
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsNoAnswer() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[7]")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//        Thread.sleep(2000);
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsVoiceMail() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[8]")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//        Thread.sleep(2000);
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsEmailContact() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[9]")).click();
//        driver.findElement(By.cssSelector(searchButton)).click();
//        Thread.sleep(2000);
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//        public void ShouldDisplayCorrectRecordsWhenCallStatusIsUnansweredCallerHungUp() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[10]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsOutOfHours() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id(callLogButton)).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[11]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsBlocked() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[12]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsCustomerCallBack() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[13]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//    //TODO direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsMTMenu() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[14]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//    //TODO direct connect to DB to extract records and compare with displayed results
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

    private void successsfulLogout() {
        driver.findElement(By.id("logout")).click();
    }
}