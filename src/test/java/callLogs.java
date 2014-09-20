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

import java.util.concurrent.TimeUnit;


public class callLogs {

    WebDriver driver;
    String baseUrl;
    //private boolean acceptNextAlert = true;
    //private StringBuffer verificationErrors = new StringBuffer();
    //String startDate = "1/03/2914 12:00AM";

    @Before
    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
        driver = new HtmlUnitDriver();
        driver.manage().deleteAllCookies();
        baseUrl = "https://dashboard.nascomms.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void shouldDisplayCorrectRecordsWhenSelectAllServicesFromDropList() {
        successfulLogin();
        driver.findElement(By.id("CallLogs-mmListNav")).click();
        driver.findElement(By.cssSelector("span.k-input")).click();
        driver.findElement(By.id("SearchParams_AccountID_option_selected")).click();
        driver.findElement(By.cssSelector("input[value='Search']")).click();
//        TODO direct connect to Db to extract records and compare with displayed results
    }

//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllClickCallingServicesFromDropList() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_AccountID_listbox']/li[2]"));
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[14]/td/input[2]")).click();
//
////        TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllGeoCallingServicesFromDropList() {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_AccountID_listbox']/li[3]"));
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[14]/td/input[2]")).click();
////        TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenLeadCallingSelectAllServicesFromDropList() {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_AccountID_listbox']/li[4]"));
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[14]/td/input[2]")).click();
////        TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllPACallingServicesFromDropList() {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_AccountID_listbox']/li[5]"));
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[14]/td/input[2]")).click();
////        TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllMtClickcallingServicesFromDropList() {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_AccountID_listbox']/li[6]"));
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[14]/td/input[2]")).click();
////        TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllMtGeoCallingServicesFromDropList() {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_AccountID_listbox']/li[7]"));
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[14]/td/input[2]")).click();
////        TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenSelectAllHaveAChatServicesFromDropList() {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_AccountID_listbox']/li[8]"));
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[14]/td/input[2]")).click();
////        TODO direct connect to Db to extract records and compare with displayed results
//    }
//
//    @Test
//    public void shouldDisplayCorrectRecordsWhenDateRangeIsSet() throws InterruptedException {
//        String startDate = "1/03/2914 12:00AM";
//        String endDate = "1/03/2914 12:00AM";
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_StartDate']")).clear();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_StartDate']")).sendKeys(startDate);
//        driver.findElement(By.xpath(".//*[@id='SearchParams_EndDate']")).clear();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_EndDate']")).sendKeys(endDate);
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[14]/td/input[2]")).click();
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCustomerNumberEntered() throws InterruptedException {
//        String customerNumber = "(07) 3843 3551";
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.id("SearchParams_CustomerNumber")).clear();
//        driver.findElement(By.id("SearchParams_CustomerNumber")).sendKeys(customerNumber);
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[14]/td/input[2]")).click();
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//
////    WORKS FROM HERE DOWN
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsAll() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[1]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsAllUnanswered() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[2]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsRegistered() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[3]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsDenied() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[4]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsAllAnswered() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[5]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsBusy() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[6]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsNoAnswer() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[7]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsVoiceMail() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[8]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsEmailContact() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[9]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsUnansweredCallerHungUp() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[10]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }
//
//    @Test
//    public void ShouldDisplayCorrectRecordsWhenCallStatusIsOutOfHours() throws InterruptedException {
//        successfulLogin();
//        driver.findElement(By.id("calllogs")).click();
//        driver.findElement(By.xpath("html/body/div[1]/div[1]/form/table/tbody/tr[10]/td/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='SearchParams_Status_listbox']/li[11]")).click();
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(2000);
//        //TODO  direct connect to DB to extract records and compare with displayed results
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
//        //TODO  direct connect to DB to extract records and compare with displayed results
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
//        //TODO  direct connect to DB to extract records and compare with displayed results
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
//        //TODO  direct connect to DB to extract records and compare with displayed results
//    }

    private void selectIncludeHiddenCalls() {
        driver.findElement(By.id("SearchParams_Hidden")).click();
    }

    private void selectOnlyShowFlaggedCalls() {
        driver.findElement(By.id("SearchParams_Flagged")).click();
    }

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

//    private void successsfulLogout() {
//        driver.findElement(By.id("logout")).click();
//    }
}
