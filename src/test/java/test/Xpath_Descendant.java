package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class Xpath_Descendant {
    @Test
    public void descendant() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        List<WebElement> xpath =getDriver().findElements(By.xpath("//div[@class='container']//descendant::img"));

        assertTrue(xpath.size()==63);

        assertEquals(xpath.size(),63);

        getDriver().quit();

    }
}
