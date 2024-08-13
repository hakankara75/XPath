package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertNotNull;
import static utilities.Driver.getDriver;

public class Xpath_Child {

    @Test
    public void xpathChild() {

        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//div[@class='social']/child::a[@title='Tema Instagram']"));

        assertNotNull(xpath);

        getDriver().quit();

    }
}
