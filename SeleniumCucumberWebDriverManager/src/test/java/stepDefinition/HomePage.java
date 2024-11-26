package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class HomePage {

    @Given("^User navigates to the login page$")
    public void User_navigates_to_the_login_page() throws InterruptedException {
        Click_hamburger_menu();
        Click_signIn_portal();
    }
    @Given("^User navigates to Online Product Page$")
    public void user_navigates_to_online_product_page() throws InterruptedException {
        Click_hamburger_menu();
        Click_online_products();
    }


}
