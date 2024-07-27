package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class Xpath_NormalizeSpace {

    @Test
    public void text() {

        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//a[text()='Çalışmalarımız']"));

        assertTrue(xpath.isDisplayed());

        getDriver().quit();

    }

    @Test
    public void textHandle() {

        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("(//a[@href='javascript:void(0)'])[1]"));

        assertTrue(xpath.isDisplayed());

        getDriver().quit();

    }

    @Test
    public void normalizeSpace() {

        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//a[normalize-space()='Çalışmalarımız']"));

        assertTrue(xpath.isDisplayed());

        getDriver().quit();
    }
}
