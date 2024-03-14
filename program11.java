import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program11 {
  public static void main(String[] args) throws Exception {
    System.getProperty("webdriver.chrome.driver",
        "C:\\Users\\Strawberry\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://lms.nmit.ac.in/moodle/login/index.php");
    // WebElement Username= driver.findElement(By.id("username"));
    // Username.sendKeys("1NT21CS160");
    driver.findElement(By.id("username")).sendKeys("1NT21CS160");
    WebElement Password = driver.findElement(By.id("password"));
    Password.sendKeys("#Verma@100cr");
    WebElement Submit = driver.findElement(By.id("loginbtn"));
    Submit.click();
    Thread.sleep(2000);
    driver.quit();
  }
}
