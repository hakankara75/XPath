package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class SubString_StartsWith {


    @Test
    public void subString_StartsWith_Text() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//div[starts-with(substring(text(),18,20),'TEMA')]"));

        assertTrue(xpath.isDisplayed());

        getDriver().quit();

    }

    @Test
    public void subString_StartsWith_Attribute() {
        getDriver().get("https://www.tema.org.tr/anasayfa");

        WebElement xpath=getDriver().findElement(By.xpath("//div[starts-with(substring(@class,1,4),'cont')]"));

        assertTrue(xpath.isDisplayed());

        getDriver().quit();

    }
}
