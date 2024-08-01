package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeSteps;
import steps.ProductSteps;

public class HomeDefs {
    @Steps
    HomeSteps homeSteps;
    @Steps
    ProductSteps productSteps;
    @When("I access menu {string}")
    public void iAccessMenu(String menu) {
        homeSteps.accessMenu(menu);

    }

    @Then("I verify header page is {string}")
    public void iVerifyHeaderPageIs(String page) {
        productSteps.closeSanBox();
        homeSteps.verifyHeaderPage(page);
    }
}
