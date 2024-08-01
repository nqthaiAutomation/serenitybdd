package Common;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageObject extends net.serenitybdd.core.pages.PageObject {
    public void pause(int millisecond){
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void inputText(String xPath, String value) {
        getDriver().findElement(By.xpath(xPath)).clear();
        getDriver().findElement(By.xpath(xPath)).sendKeys(value);
    }

    public void clickButton(String button) {

        getDriver().findElement(By.xpath("//*[@type='submit' and @value='"+button+"']")).click();
    }

    public void verifyMessageError(String resuilt) {
        Assert.assertTrue(isElementVisible(By.xpath("//*[@class='validation-summary-errors']//*[text()='"+resuilt+"']"))==true);
    }
    public WebElement getElement(String xpath){
        return getDriver().findElement(By.xpath(xpath));
    }
    public void clickElement(String xpath){
        getElement(xpath).click();
    }


}
