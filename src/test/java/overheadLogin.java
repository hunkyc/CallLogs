import org.openqa.selenium.By;

public class overheadLogin {
    private final reports reports;

    String baseUrl = "https://dashboard.nascomms.com/";;

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
}