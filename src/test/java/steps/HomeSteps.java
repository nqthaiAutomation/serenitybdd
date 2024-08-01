package steps;

import pages.HomePage;

public class HomeSteps {
    HomePage homePage;
    public void accessMenu(String menu) {
        homePage.accessMenu(menu);
    }

    public void verifyHeaderPage(String page) {
        homePage.verifyHeaderPage(page);
    }


}
