package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String registration_page_text = "/html/body/center/h1";

    public static void get_registration_page_text() throws InterruptedException{
        Thread.sleep(2000);
        String actual_registration_page_text = driver.findElement(By.xpath(registration_page_text)).getText();
        assertEquals("User Registration Page",actual_registration_page_text);
    }


}
