package StepDef;

import BasePage.Basepage;
import PageObjects.AmazonLoginPages;
import org.openqa.selenium.WebDriver;

public class AmazonContainer {


    private WebDriver driver;
    AmazonLoginPages Loginpages;


    public AmazonContainer() {
        driver = Basepage.getdriver();
        initPages();
    }

    private void initPages() {
        Loginpages = new AmazonLoginPages(driver);
    }
}
