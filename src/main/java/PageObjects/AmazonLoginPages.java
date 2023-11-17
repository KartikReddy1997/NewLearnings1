package PageObjects;

import BasePage.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLoginPages extends Basepage {

    static WebDriver driver;


    public static void LaunchURL()
    {
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
    }
}
