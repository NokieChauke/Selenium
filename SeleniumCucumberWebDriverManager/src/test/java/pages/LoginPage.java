package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class    LoginPage extends BrowserDriver {

    public static String userName_id = "usr";
    public static String password_id = "pwd";
    public static String login_button_xpath = "//*[@id=\"second_form\"]/input";
    public static String new_register_button_id = "NewRegistration";

    public static void enter_UserName() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id(userName_id)).sendKeys("username");
    }
    public static void enter_Password() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id(password_id)).sendKeys("Password");
    }

    public static void click_login_button() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_xpath)).click();
    }
    public static void click_newRegister_button() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id(new_register_button_id)).click();
    }

}
