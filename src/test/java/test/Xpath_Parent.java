package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.*;
import static utilities.Driver.getDriver;

public class Xpath_Parent {

    @Test
    public void parent() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        List<WebElement> xpath =getDriver().findElements(By.xpath("(//a[@title='Nikah ve Düğün Davetiyeleri'])[2]/parent::div"));

        assertNotNull(xpath);

        getDriver().quit();

    }
}
