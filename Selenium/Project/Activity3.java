package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
      
        // Initialize the FirefoxDriver
        driver = new FirefoxDriver();

        // Open the browser and navigate to the URL
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifyFirstInfoBoxTitle() {
        // Locate the first info box title element
        WebElement firstInfoBoxTitle = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])[1]"));

        // Get the text of the first info box title
        String actualTitle = firstInfoBoxTitle.getText();

        // Expected title
        String expectedTitle = "Actionable Training";

        // Verify the title matches the expected text
        Assert.assertEquals(actualTitle, expectedTitle, "The first info box title does not match!");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
