import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class testetsng {

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
