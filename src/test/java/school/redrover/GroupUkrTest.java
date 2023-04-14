package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class GroupUkrTest {

    @Test
    public void youtubeSearchTest(){
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--headless","--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(optionsChrome);
        driver.get("https://www.youtube.com/");

        String title = driver.getTitle();
        Assert.assertEquals("YouTube", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='search']"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));

        searchInput.sendKeys("Что такое Selenium?");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        searchButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        WebElement link = driver.findElement(By.xpath("//a[@title='Что такое Selenium?']"));
        String value = link.getText();

        Assert.assertEquals(value, "Что такое Selenium?");

        driver.quit();

    }
    @Test
    public void VNUiTest(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless","--window-size= 1920,1080");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("http://uitestingplayground.com/home");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
        String title = driver.getTitle();
        Assert.assertEquals(title,"UI Test Automation Playground");

        WebElement textInputLink = driver.findElement(By.xpath("//section[@id = 'overview']//a[text() = 'Text Input']"));
        textInputLink.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
        WebElement textField = driver.findElement(By.xpath("//input[@id='newButtonName']"));
        WebElement updButton = driver.findElement(By.xpath("//button[@id='updatingButton']"));

        textField.sendKeys("New Name");
        updButton.click();
        Assert.assertEquals(updButton.getText(), "New Name");

        driver.quit();


    }

}