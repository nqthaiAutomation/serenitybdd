package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.LoginPages;

public class LoginSteps {
    LoginPages loginPages;
    private HomePage homePage;

    @Step
    public void i_access_kyotviet() {
        loginPages.open();
    }

    public void loginWithAccout(String userName, String passWord) {
        loginPages.inputText("//*[@id='UserName']",userName);
        loginPages.inputText("//*[@id='Password']",passWord);
        loginPages.clickButton("Quản lý");
    }

    public void checkMessageResuilt(String resuilt) {
        if(!resuilt.equals("Thành công"))
            loginPages.verifyMessageError(resuilt);
        else
            homePage.verifyImageKyotVietDisplayed();
    }
}
