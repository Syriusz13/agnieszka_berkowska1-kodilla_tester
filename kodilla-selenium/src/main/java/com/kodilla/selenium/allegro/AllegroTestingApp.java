package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        driver.findElement(By.cssSelector("[data-role='close-and-accept-consent']")).click();
        //driver.findElement(By.cssSelector("[data-role='close-and-accept-consent']")).click();

        //WebElement categoryCombo = driver.findElement(By.xpath("//*[contains(@class, \"_r65gb _1fwkl\")]/select[1]")); //Wyrażenie XPath-Relative
        //Select categorySelect = new Select(categoryCombo);
        //categorySelect.selectByIndex(3);

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/div[2]/div/select"));
        Select categorySelect2 = new Select(categoryCombo);
        categorySelect2.selectByIndex(3);

        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("Mavic mini");
        driver.findElement(By.cssSelector("button[data-role='search-button']")).click();
        //inputField.submit();
    }
}
