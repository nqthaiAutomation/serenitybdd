package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ProductSteps;

public class ProductDefs {
    @Steps
    ProductSteps productSteps;
    @When("I select produce has code {string}")
    public void iSelectProduceHasCode(String code) {
        productSteps.selectProduceHasCode(code);
        
    }

    @Then("I verify button {string} displayed is {string}")
    public void iVerifyButtonDisplayedIs(String button, String isDisplayed) {
        boolean disPlayed= Boolean.parseBoolean(isDisplayed);
        productSteps.verifyButtonDisplayed(button,disPlayed);
    }

    @And("I click button {string}")
    public void iClickButton(String button) {
        productSteps.clickButton(button);
    }
}
