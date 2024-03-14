import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program20 {
    public static void main(String[] args) throws Exception {
        System.getProperty("webdriver.gecko.driver",
                "D:\\\\HTML tutorial\\\\SoftTool2\\\\src\\\\New folder\\\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://lms.nmit.ac.in/moodle/login/index.php");
        driver.findElement(By.id("username")).sendKeys("1NT21CS160");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("****");
        WebElement Submit = driver.findElement(By.id("loginbtn"));
        Submit.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
