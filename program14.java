
//program 14
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program14 {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Strawberry\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // driver.manage().window().maximize();
        Thread.sleep(3000);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.findElement(By.id("firstName")).sendKeys("abcd");
        driver.findElement(By.id("malerb")).click();
        driver.findElement(By.id("englishchbx")).click();
        driver.findElement(By.id("hindichbx")).click();
        driver.findElement(By.id("registerbtn")).click();
        driver.findElement(By.id("email")).sendKeys("123@gmail.com");
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
