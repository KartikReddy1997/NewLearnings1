package PageObjects;

import BasePage.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPages  {

private final WebDriver driver;
public AmazonLoginPages(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver, this);
}
    @FindBy(how = How.XPATH, using = "//div[@id='nav-cart-count-container']")
    private  WebElement cart;

    @FindBy(how = How.XPATH,using="//h2[normalize-space()='Your Amazon Cart is empty']")
    private WebElement emptycart;



    public  void LaunchURL()    {

        driver.get("https://www.amazon.in/");
    }

    public  void clickCart()    {

      //  driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
        cart.click();
    }

    public  void verifyCartContent()
    {
//        WebElement emptycart =driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']"));
        System.out.println(">>>>>"+emptycart.getText());

    }

    public String getTitleOfThePage(){
        return driver.getTitle();
    }
}
