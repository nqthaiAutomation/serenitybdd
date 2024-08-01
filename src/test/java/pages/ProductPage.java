package pages;

import Common.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {
    public void selectProduceHasCode(String code) {
        clickElement("//*[contains(text(),'" + code + "')]/ancestor::tr//a[@tabindex='0']");
    }

    public void closeSanBox() {

        String xPath = "//*[@class='vodal-close']";
        clickElement(xPath);
    }

    public void verifyButtonDisplayed(String button, boolean disPlayed) {
        String xPathButton = "//*[contains(@class,'addProductBtn')]//*[text()='" + button + "']";
        Assert.assertTrue(isElementVisible(By.xpath(xPathButton)) == disPlayed);
    }

    @Override
    public void clickButton(String button) {
        String xPathButton = "//*[contains(@class,'addProductBtn')]//*[text()='" + button + "']";
        clickElement(xPathButton);

    }

}
