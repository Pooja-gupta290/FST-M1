package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize the FirefoxDriver
        driver = new FirefoxDriver();

        // Open the browser and navigate to the URL
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifySecondPopularCourseTitle() {
        // Locate the title of the second most popular course
        WebElement secondCourseTitle = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]"));

        // Get the text of the second course title
        String actualTitle = secondCourseTitle.getText();

        // Expected title
        String expectedTitle = "Email Marketing Strategies";

        // Verify the title matches the expected text
        Assert.assertEquals(actualTitle, expectedTitle, "The second most popular course title does not match!");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
