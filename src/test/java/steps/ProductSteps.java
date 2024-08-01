package steps;

import net.thucydides.core.annotations.Step;
import pages.ProductPage;

public class ProductSteps {

    ProductPage productPage;
    @Step
    public void selectProduceHasCode(String code) {
        productPage.selectProduceHasCode(code);
    }
    @Step
    public void closeSanBox() {
        productPage.closeSanBox();
    }
    @Step
    public void verifyButtonDisplayed(String button, boolean disPlayed) {
        productPage.verifyButtonDisplayed(button,disPlayed);
    }
    @Step
    public void clickButton(String button) {
        productPage.clickButton(button);
    }
}
