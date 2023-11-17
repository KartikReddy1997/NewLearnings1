package StepDef;

import BasePage.Basepage;
import PageObjects.AmazonLoginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AmazonSteps {
    @Given("I am on Amazon application")
    public void iAmOnAmazonApplication() {
        Basepage.SetDriver();
        AmazonLoginPages.LaunchURL();
    }

    @When("I move to cart")
    public void iMoveToCart() {
        AmazonLoginPages.clickCart();
    }

    @Then("User should see You cart is empty")
    public void userShouldSeeYouCartIsEmpty() {
        AmazonLoginPages.verifyCartContent();
    }

}
