package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class Xpath_Self {
    @Test
    public void self() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//a[@title='Sepetim']//self::a[@class='vcenter']"));

        assertNotNull(xpath);

        getDriver().quit();

    }
}
