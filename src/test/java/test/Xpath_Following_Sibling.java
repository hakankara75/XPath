package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class Xpath_Following_Sibling {
    @Test
    public void followingSibling() {

        getDriver().get("https://www.tema.org.tr/anasayfa");

        List<WebElement> xpath=getDriver().findElements(By.xpath("//div[@class='social']//a[@title='Tema Facebook']//following-sibling::a"));
        WebElement xpathFollowing=getDriver().findElement(By.xpath("//div[@class='social']//a[@title='Tema Youtube']//following-sibling::a"));

        assertFalse(xpath.isEmpty());
        assertTrue(xpathFollowing.getAccessibleName().contains("Linkedin"));

        getDriver().quit();
    }
}
