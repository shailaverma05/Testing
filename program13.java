
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program13 {
    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver",
                "C:\\Users\\Strawberry\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        // WebDriverWait wait = new WebDriverWait(driver, 3);
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("facebook");
        driver.findElement(By.name("q")).submit();
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        driver.navigate().refresh();
        // Wait for some time to allow the video page to load
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();
    }
}