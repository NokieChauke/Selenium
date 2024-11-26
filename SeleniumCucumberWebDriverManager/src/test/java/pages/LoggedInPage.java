package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {

    public static String productcategory_formalshoes_xpath = "//*[text()='Formal Shoes']";
    public static String productcategory_sports_xpath = "//*[text()='Sports']";
    public static String productcategory_Sneakers = "//*[text()='Sneakers']";

    public static void visibility_productcategory_formalshoes() throws InterruptedException{
        String actualproductcategory_fs = driver.findElement(By.xpath(productcategory_formalshoes_xpath)).getText();
        assertEquals("Formal Shoes",actualproductcategory_fs);
    }

    public static void visibility_productcategory_sports() throws InterruptedException{
        String actualproductcategort_sprt = driver.findElement(By.xpath(productcategory_sports_xpath)).getText();
        assertEquals("Sports",actualproductcategort_sprt);
    }

    public static void visibility_productcategory_sneakers() throws InterruptedException{
        String actualcategory_snk = driver.findElement(By.xpath(productcategory_Sneakers)).getText();
        assertEquals("Sneakers",actualcategory_snk);
    }
}
