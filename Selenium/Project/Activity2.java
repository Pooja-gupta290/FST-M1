package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        
        // Initialize the FirefoxDriver
        driver = new FirefoxDriver();

        // Open the browser and navigate to the URL
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifyHeading() {
        // Locate the heading element on the webpage
        WebElement headingElement = driver.findElement(By.xpath("//h1"));

        // Get the text of the heading
        String actualHeading = headingElement.getText();

        // Expected heading text
        String expectedHeading = "Learn from Industry Experts";

        // Verify the heading matches the expected text
        Assert.assertEquals(actualHeading, expectedHeading, "The website heading does not match!");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

