import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program17 {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.gecko.driver", "D:\\HTML tutorial\\SoftTool2\\src\\New folder\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("D:\\HTML tutorial\\SoftTool2\\src\\New folder\\" + "newHtml.html");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("send")).click();
        driver.findElement(By.id("submitbutton")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
