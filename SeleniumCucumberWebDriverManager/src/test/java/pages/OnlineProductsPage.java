package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class OnlineProductsPage  extends BrowserDriver {
    public static String formal_dropdown_xpath = "/html/body/div[2]/center/div/i[1]";
    public static String shoename_class_xpath = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String shoename_prest_xpath = "/html/body/div[2]/table/tbody/tr[2]/td[1]";


    public static void click_formal_dropdown() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(formal_dropdown_xpath)).click();
    }
    public static void getText_shoename_classic() throws InterruptedException{
        Thread.sleep(2000);
        String shoename_class = driver.findElement(By.xpath(shoename_class_xpath)).getText();
        assertEquals("   Classic Cheltenham",shoename_class);

    }
    public static void getText_shoename_prest() throws InterruptedException{
        Thread.sleep(2000);
        String shoename_prest = driver.findElement(By.xpath(shoename_prest_xpath)).getText();
        assertEquals("   Prestige Barlett Borgue",shoename_prest);

    }
}
