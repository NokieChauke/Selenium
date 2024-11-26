package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.OnlineProductsPage.*;

public class OnlineProductsPage {

    @When("User clicks on Formal drop down")
    public static void User_clicks_on_Formal_drop_down() throws InterruptedException{
        click_formal_dropdown();
    }
    @Then("User should be able to view the Products")
    public static void User_should_be_able_to_view_the_Products() throws InterruptedException{
        getText_shoename_classic();
        getText_shoename_prest();

    }

}
