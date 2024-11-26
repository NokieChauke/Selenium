package stepDefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {

    @When("^User successfully enters the login details$")
    public static void User_successfully_enters_the_login_details() throws InterruptedException {

        enter_UserName();
        enter_Password();
        click_login_button();
    }
    @When("^User clicks on new Registration button$")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        click_newRegister_button();
    }
}
