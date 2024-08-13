package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class Xpath_Absolute_Attribute {
    @Test
    public void absoluteAttribute1() {

        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//section/div/div/p"));

        assertTrue(xpath.getText().contains("erozyon"));

        getDriver().quit();

    }

    @Test
    public void absoluteAttribute2() {

        getDriver().get("https://www.tema.org.tr/anasayfa");

        //WebElement xpath=getDriver().findElement(By.xpath("//p[@xpath='1']"));
        WebElement xpathAttribute=getDriver().findElement(By.xpath("//p[attribute::xpath='1']"));

        assertTrue(xpathAttribute.getText().contains("erozyon"));

        getDriver().quit();

    }
}
