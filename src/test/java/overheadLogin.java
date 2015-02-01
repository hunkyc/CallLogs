import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class overheadLogin {
    private final reports reports;

    String baseUrl = "https://dashboard.nascomms.com/";

    public overheadLogin(reports reports) {
        this.reports = reports;
    }

    void successfulLogin() {
        reports.getDriver().get(baseUrl + "/Login/Login?ReturnUrl=%2f");
        reports.getDriver().findElement(By.id("UserName")).clear();
        reports.getDriver().findElement(By.id("UserName")).sendKeys("Martin.Smith");
        reports.getDriver().findElement(By.id("Password")).clear();
        reports.getDriver().findElement(By.id("Password")).sendKeys("BongTow");
        reports.getDriver().findElement(By.cssSelector("input.coloured_button")).click();
    }

    public WebDriver setup() {
        WebDriver driver;
//    driver = new FirefoxDriver();
//        driver = new HtmlUnitDriver();
//      location of chrome driver at work
//    System.setProperty("webdriver.chrome.driver", "/Users/martin/Downloads/chromedriver");
//      location of chrome driver at home
        System.setProperty("webdriver.chrome.driver", "/home/martin/Applications/ChromeDriver/chromedriver");
    driver = new ChromeDriver();

//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    return driver;
    }
}