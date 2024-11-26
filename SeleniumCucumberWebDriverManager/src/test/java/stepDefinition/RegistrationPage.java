package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.RegistrationPage.get_registration_page_text;

public class RegistrationPage {

    @Then("User should be able to  view the Registration page")
    public static void User_should_be_able_to_view_the_Registration_page() throws InterruptedException{
        get_registration_page_text();
    }
}
