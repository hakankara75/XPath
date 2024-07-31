package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class Xpath_And_Or {
    @Test
    public void and() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//a[@title='Hakkımızda' and @href='javascript:void(0)']"));

        assertTrue(xpath.isDisplayed());

        getDriver().quit();

    }
    @Test
    public void or() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("(//img[@class='menu-icon mobile-only' or @src='/Content/Icons/menu-arrow.svg'])[1]"));

        assertTrue(xpath.isEnabled());

        getDriver().quit();

    }
}
