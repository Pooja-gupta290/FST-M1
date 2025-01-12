package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
                
        // Initialize the FirefoxDriver
        driver = new FirefoxDriver();

        // Open the browser and navigate to the URL
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifyTitle() {
        // Get the title of the website
        String actualTitle = driver.getTitle();
        
        // Expected title
        String expectedTitle = "Alchemy LMS – An LMS Application";

        // Verify the title matches the expected title
        Assert.assertEquals(actualTitle, expectedTitle, "The website title does not match!");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
