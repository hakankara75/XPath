package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class Xpath_Ancestor {
    @Test
    public void ancestor1() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("(//a[@title='Nikah ve Düğün Davetiyeleri']/ancestor::div)[5]"));

        assertTrue(xpath.isEnabled());

        getDriver().quit();

    }

    @Test
    public void ancestor2() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//a[@title='Nikah ve Düğün Davetiyeleri']/ancestor::div[@class='row']"));

        assertTrue(xpath.isEnabled());

        getDriver().quit();

    }
}
