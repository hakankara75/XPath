package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class Xpath_Preceding {

    @Test
    public void preceding1() {

        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("(//div[@class='right']//a[@title='GÖNÜLLÜ OL']/preceding::a[@title='Tema Facebook'])[1]"));

        assertTrue(xpath.isDisplayed());

        getDriver().quit();

    }

    @Test
    public void preceding2() {

        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//div[@class='right']//a[@title='GÖNÜLLÜ OL']/preceding::div[@class='social']"));

        xpath.click();

        getDriver().quit();

    }

}
