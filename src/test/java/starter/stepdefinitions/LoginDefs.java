package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

import java.util.List;
import java.util.Map;

public class LoginDefs {
    @Steps
    LoginSteps loginStep;

    @Given("I access kyotviet")
    public void i_access_kyotviet() {
        loginStep.i_access_kyotviet();
    }

    @When("I check login with infomation in table below")
    public void iCheckLoginWithInfomationInTableBelow(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            String userName = columns.get("Username");
            String passWord = columns.get("Password");
            String resuilt = columns.get("Resuilt");
            loginStep.loginWithAccout(userName, passWord);
            loginStep.checkMessageResuilt(resuilt);

        }

    }

    @Given("I login kyotViet susserfully")
    public void iLoginKyotVietSusserfully() {
        loginStep.i_access_kyotviet();
        loginStep.loginWithAccout("0790994442", "311849");
        loginStep.checkMessageResuilt("Thành công");
    }
}
