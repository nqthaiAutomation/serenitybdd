package pages;

import Common.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public void verifyImageKyotVietDisplayed() {
        Assert.assertTrue(isElementVisible(By.xpath("//*[text()='Tổng quan']")) == true);

    }

    public void accessMenu(String menu) {
        String[] iTems = menu.split("->");
        String xPathMenu = "//ul[@class='kv-navbar-list']//li//*[text()='" + iTems[0] + "']";
        clickElement(xPathMenu);
        String xPathChildMenu = "//ul[@class='kv-dropdown-list ng-scope']//li//*[text()='" + iTems[1] + "']";
        clickElement(xPathChildMenu);
    }

    public void verifyHeaderPage(String page) {
        Assert.assertTrue(isElementVisible(By.xpath("//*[@class='heading-page']//*[text()='" + page + "']")));
    }
}
