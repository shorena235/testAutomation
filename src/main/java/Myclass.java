import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Myclass {

    public String basePath = ("http://the-internet.herokuapp.com/");
    public WebDriver driver;


    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basePath);
        driver.manage().window().maximize();

    }

    @Test
    public void Test(){
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.id("email")).sendKeys("jemalikoo9999@gmail.com");
        driver.findElement(By.id("form_submit")).click();
    }

    @AfterMethod
    public void quite(){
        driver.quit();
    }

}
