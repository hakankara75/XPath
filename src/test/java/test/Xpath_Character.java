package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertNotNull;
import static utilities.Driver.getDriver;

public class Xpath_Character {
    @Test
    public void character() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("(//*[@title='BAĞIŞ YAP'])[2]"));

        xpath.click();

        getDriver().quit();

    }
    @Test
    public void character1() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("(//span[.='BAĞIŞ YAP'])[2]"));

        xpath.click();

        getDriver().quit();

    }
    @Test
    public void character2() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("(//*[.='BAĞIŞ YAP'])[2]"));

        xpath.click();

        getDriver().quit();

    }
}
