package StepDef;

import BasePage.Basepage;
import PageObjects.AmazonLoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonSteps   {


    private AmazonContainer page=new AmazonContainer();
    private WebDriver driver;

//    public AmazonSteps() {
//        // Default constructor (zero-argument)
//    }
//   public AmazonSteps(AmazonContainer cont) {
//
//        this.page = cont;
//    }

    @Given("I am on Amazon application")
    public void iAmOnAmazonApplication() {
     //   basepage.setDriver();
            page.Loginpages.LaunchURL();
    }

    @When("I move to cart")
    public void iMoveToCart() {
        page.Loginpages.clickCart();
    }

    @Then("User should see You cart is empty")
    public void userShouldSeeYouCartIsEmpty() {
        page.Loginpages.verifyCartContent();
    }

    @Given("User is on empty cart page")
    public void userIsOnEmptyCartPage() {
//        page.Loginpages.LaunchURL();
        System.out.println(page.Loginpages.getTitleOfThePage());

    }

    @When("User searchs for the products from search bar")
    public void userSearchsForTheProductsFromSearchBar() {
        System.out.println("User searchs for the products from search bar>>>>>>>>>>>");
    }

    @And("User adds the {string} product in the cart")
    public void userAddsTheProductInTheCart(String arg0) {
        System.out.println("User adds the "+arg0+"{ product in the cart>>>>>>>>>>>");
    }

    @Then("User should see product added into the cart")
    public void userShouldSeeProductAddedIntoTheCart() {
        System.out.println("User should see product added into the cart>>>>>>>>>>>");
    }
}
