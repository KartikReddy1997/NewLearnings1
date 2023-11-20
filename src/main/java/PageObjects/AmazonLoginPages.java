package PageObjects;

import BasePage.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonLoginPages extends Basepage {

    static WebDriver driver;


    public static void LaunchURL()
    {
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    public static void clickCart()
    {
        driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
    }

    public static void verifyCartContent()
    {
        WebElement emptycart =driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']"));
        System.out.println(">>>>>"+emptycart.getText());
        driver.quit();
    }
}
